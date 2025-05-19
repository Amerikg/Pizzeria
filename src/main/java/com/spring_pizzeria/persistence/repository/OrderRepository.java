package com.spring_pizzeria.persistence.repository;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

import com.spring_pizzeria.persistence.entity.OrderEntity;
import java.time.LocalDateTime;


public interface OrderRepository extends ListCrudRepository<OrderEntity,Integer> {
    List<OrderEntity> findAllByDateAfter(LocalDateTime date);
    List<OrderEntity> findAllByMethodIn(List<String> methods);
}
