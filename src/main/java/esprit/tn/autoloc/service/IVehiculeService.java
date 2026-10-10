package esprit.tn.autoloc.service;

import esprit.tn.autoloc.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule create (Vehicule vehicule);
    Vehicule findById (Long id);
    List<Vehicule> findAll();
    void deleteById (Long id);
    Vehicule update (Long id, Vehicule vehicule);
}