package esprit.tn.autoloc.service.impls;

import esprit.tn.autoloc.domain.Vehicule;
import esprit.tn.autoloc.repository.IVehiculeRepository;
import esprit.tn.autoloc.service.iVehiculeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VehiculeServicesImlp implements iVehiculeServices {

    private final IVehiculeRepository vehiculeRepository;

    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule findById (Long id) {
        return vehiculeRepository.findById(id).orElseThrow(() -> new RuntimeException("Vehicule not found"));
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}
