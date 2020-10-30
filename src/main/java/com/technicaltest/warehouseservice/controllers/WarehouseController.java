package com.technicaltest.warehouseservice.controllers;

import com.technicaltest.warehouseservice.dto.WarehouseData;
import com.technicaltest.warehouseservice.facade.WarehouseFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class WarehouseController {

    @Autowired
    private WarehouseFacade warehouseFacade;

    @GetMapping
    ResponseEntity<List<WarehouseData>> getWarehouses(){
        return new ResponseEntity<>(warehouseFacade.getAll(), HttpStatus.OK);
    }

    @GetMapping(
            value = "/list"
    )
    ResponseEntity<List<WarehouseData>> getWarehousesByList(@RequestParam("idList") List<Long> idList){
        return new ResponseEntity<>(warehouseFacade.getAllByList(idList), HttpStatus.OK);
    }
}
