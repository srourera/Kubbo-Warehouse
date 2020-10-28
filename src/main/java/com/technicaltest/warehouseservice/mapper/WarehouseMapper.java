package com.technicaltest.warehouseservice.mapper;

import com.technicaltest.warehouseservice.dto.WarehouseData;
import com.technicaltest.warehouseservice.entity.WarehouseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface WarehouseMapper {
    WarehouseData warehouseEntityToWarehouseData(WarehouseEntity warehouseEntity);
    WarehouseEntity warehouseDataToWarehouseEntity(WarehouseData warehouseData);

    List<WarehouseData> warehouseEntityListToWarehouseDataList(List<WarehouseEntity> warehouseEntityList);
    List<WarehouseEntity> warehouseDataListToWarehouseEntityList(List<WarehouseData> warehouseDataList);
}