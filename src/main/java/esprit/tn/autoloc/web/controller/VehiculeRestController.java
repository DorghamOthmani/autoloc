package esprit.tn.autoloc.web.controller;

import esprit.tn.autoloc.domain.Vehicule;
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
}