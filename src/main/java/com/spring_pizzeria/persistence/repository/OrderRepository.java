package com.spring_pizzeria.persistence.repository;

import org.springframework.data.repository.ListCrudRepository;

import com.spring_pizzeria.persistence.entity.OrderEntity;

public interface OrderRepository extends ListCrudRepository<OrderEntity,Integer> {

}
