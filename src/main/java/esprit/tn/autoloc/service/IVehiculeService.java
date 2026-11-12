package esprit.tn.autoloc.service;

import esprit.tn.autoloc.domain.Contrat;
import esprit.tn.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule create (Vehicule vehicule);
    Vehicule findById (Long id);
    List<Vehicule> findAll();
    void deleteById (Long id);
    Vehicule update (Long id, Vehicule vehicule);
    Vehicule assignAgence (Long idVehicule, Long idAgence);
    Vehicule assignEquipement (Long idVehicule, Long idEquipement);
    void unassignEquipement (Long idVehicule, Long idEquipement);
    Vehicule addVehiculeAndAssignAgence (Vehicule vehicule, Long idAgence);
}