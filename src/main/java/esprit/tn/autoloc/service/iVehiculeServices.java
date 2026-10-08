package esprit.tn.autoloc.service;

import esprit.tn.autoloc.domain.Vehicule;

import java.util.List;
import java.util.Optional;

public interface iVehiculeServices {
    Vehicule create (Vehicule vehicule);
    Vehicule findById (Long id);
    List<Vehicule> findAll();
    void deleteById (Long id);
    Vehicule update (Vehicule vehicule);
}
