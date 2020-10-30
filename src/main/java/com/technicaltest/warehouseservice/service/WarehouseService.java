package com.technicaltest.warehouseservice.service;

import com.technicaltest.warehouseservice.entity.WarehouseEntity;
import com.technicaltest.warehouseservice.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    @Autowired
    private WarehouseRepository warehouseRepository;

    public List<WarehouseEntity> getAll() {
        return warehouseRepository.findAll();
    }

    public List<WarehouseEntity> getAllByIdIn(List<Long> idList) {
        return warehouseRepository.findAllByIdIn(idList);
    }
}
