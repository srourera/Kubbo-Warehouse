package com.technicaltest.warehouseservice.controllers;

import com.technicaltest.warehouseservice.dto.WarehouseData;
import com.technicaltest.warehouseservice.facade.WarehouseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseController {

    @Autowired
    private WarehouseFacade warehouseFacade;

    @GetMapping
    ResponseEntity<List<WarehouseData>> getWarehouses(){
        return new ResponseEntity<>(warehouseFacade.getAll(), HttpStatus.OK);
    }
}
