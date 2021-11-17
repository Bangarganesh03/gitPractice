package com.rest2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest2.entity.Item;

public interface ShopeeRepository extends JpaRepository<Item, Integer> {

}
