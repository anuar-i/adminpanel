package kz.singularity.adminpanel.repositories;

import kz.singularity.adminpanel.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatalogRepository extends JpaRepository<Dish,Long> {
}
