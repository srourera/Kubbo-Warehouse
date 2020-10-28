package com.technicaltest.warehouseservice.repository;

import com.technicaltest.warehouseservice.entity.WarehouseEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepository extends CrudRepository<WarehouseEntity, Integer> {

    List<WarehouseEntity> findAll();

}