package kz.singularity.adminpanel.services;

import kz.singularity.adminpanel.models.Dish;
import kz.singularity.adminpanel.models.Order;
import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.List;

public interface CatalogService {
    List<Dish> findAll();
}
