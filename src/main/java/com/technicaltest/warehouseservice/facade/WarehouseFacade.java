package com.technicaltest.warehouseservice.facade;

import com.technicaltest.warehouseservice.dto.WarehouseData;
import com.technicaltest.warehouseservice.entity.WarehouseEntity;
import com.technicaltest.warehouseservice.mapper.WarehouseMapper;
import com.technicaltest.warehouseservice.service.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseFacade {

    @Autowired
    private WarehouseService warehouseService;

    @Autowired
    private WarehouseMapper warehouseMapper;

    public List<WarehouseData> getAll() {
        List<WarehouseEntity> warehouses = warehouseService.getAll();
        return warehouseMapper.warehouseEntityListToWarehouseDataList(warehouses);
    }
}
