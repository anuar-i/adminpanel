package kz.singularity.adminpanel.services.imp;

import kz.singularity.adminpanel.models.Dish;
import kz.singularity.adminpanel.models.Order;
import kz.singularity.adminpanel.repositories.CatalogRepository;
import kz.singularity.adminpanel.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {
    private final CatalogRepository catalogRepository;

    @Override
    public List<Dish> findAll() {
        return catalogRepository.findAll();
    }
}
