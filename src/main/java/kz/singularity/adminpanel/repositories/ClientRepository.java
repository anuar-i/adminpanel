package kz.singularity.adminpanel.repositories;

import kz.singularity.adminpanel.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository <Client, Long>{
  Client findClientById(Long id);


}
