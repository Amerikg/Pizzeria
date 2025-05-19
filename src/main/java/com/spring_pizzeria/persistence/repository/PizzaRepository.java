package com.spring_pizzeria.persistence.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.ListCrudRepository;

import com.spring_pizzeria.persistence.entity.PizzaEntity;

public interface PizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
    List<PizzaEntity> findAllByAvailableTrueOrderByPrice();
    Optional <PizzaEntity>  findFirstByAvailableTrueAndNameIgnoreCase(String name);
    List<PizzaEntity> findAllByAvailableTrueAndDescriptionContainingIgnoreCase(String description);
    List<PizzaEntity> findAllByAvailableTrueAndDescriptionNotContainingIgnoreCase(String description);
    List<PizzaEntity> findTop3ByAvailableTrueAndPriceLessThanEqualOrderByPriceAsc(Double price);
    int countByVeganTrue();
}
