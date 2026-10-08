package esprit.tn.autoloc.repository;

import esprit.tn.autoloc.domain.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IVehiculeRepository extends JpaRepository<Vehicule,Long> {
}
