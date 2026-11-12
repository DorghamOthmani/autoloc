package esprit.tn.autoloc.web.controller;

import esprit.tn.autoloc.domain.Agence;
import esprit.tn.autoloc.domain.Contrat;
import esprit.tn.autoloc.domain.Vehicule;
import esprit.tn.autoloc.exception.ResourceNotFoundException;
import esprit.tn.autoloc.repository.IVehiculeRepository;
import esprit.tn.autoloc.service.IContratService;
import esprit.tn.autoloc.service.IVehiculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("vehicules")
@RestController

public class VehiculeRestController {
    private final IVehiculeService vehiculeService;

    @PostMapping
    public Vehicule add (@RequestBody Vehicule vehicule){
        return vehiculeService.create(vehicule);
    }

    @GetMapping("{id}")
    public Vehicule getVehicule (@PathVariable Long id){
        return vehiculeService.findById(id);
    }

    @GetMapping
    public List<Vehicule> getVehicule (){
        return vehiculeService.findAll();
    }

    @DeleteMapping("{id}")
    public void delete (@PathVariable Long id){
        vehiculeService.deleteById(id);
    }

    @PutMapping("{id}")
    public Vehicule update (@PathVariable Long id, @RequestBody Vehicule vehicule){
        return vehiculeService.update(id, vehicule);
    }

    @PutMapping("{idVehicule}/agence/{idAgence}")
    public Vehicule assignAgence (@PathVariable Long idVehicule, @PathVariable Long idAgence){
        return vehiculeService.assignAgence(idVehicule, idAgence);
    }

    @PutMapping("{idVehicule}/equipement/{idEquipement}")
    public Vehicule assignEquipement (@PathVariable Long idVehicule, @PathVariable Long idEquipement){
        return vehiculeService.assignEquipement(idVehicule, idEquipement);
    }

    @DeleteMapping("{idVehicule}/equipement/{idEquipement}")
    public void unassignEquipement (@PathVariable Long idVehicule, @PathVariable Long idEquipement){
        vehiculeService.unassignEquipement(idVehicule, idEquipement);
    }

    @PostMapping("agence/{idAgence}")
    public Vehicule addVehiculeAndAssignAgence (@RequestBody Vehicule vehicule, @PathVariable Long idAgence){
        return vehiculeService.addVehiculeAndAssignAgence(vehicule, idAgence);
    }
    @RestController
    @RequestMapping("/contrats")
    @RequiredArgsConstructor
    public class ContratController {
        private final IContratService service;

        @PostMapping("/with-payments")
        public Contrat addWithPayments(@RequestBody Contrat c) {
            return service.addWithPayments(c);
        }
    }
}