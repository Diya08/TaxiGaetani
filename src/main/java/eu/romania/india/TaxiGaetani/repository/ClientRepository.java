package eu.romania.india.TaxiGaetani.repository;


import eu.romania.india.TaxiGaetani.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query("select c from Client c where c.userName = ?1 and c.password = ?2")
    Client findByUserNameAndPassword(String username, String password);
}
