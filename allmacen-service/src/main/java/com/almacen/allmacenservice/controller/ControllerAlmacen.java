package com.almacen.allmacenservice.controller;

import com.almacen.allmacenservice.model.Inventory;
import com.almacen.allmacenservice.response.InventoryResponseRest;
import com.almacen.allmacenservice.service.IInventoryResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = {"locahost:4200"})
@RequestMapping("/almacen")
public class ControllerAlmacen {

    @Autowired
    private IInventoryResponseService service;

    @GetMapping("/inventario")
    public ResponseEntity<InventoryResponseRest>searchInventory(){
        ResponseEntity<InventoryResponseRest> response = service.search();
        return response;
    }
    @GetMapping("/findByName/{name}")
    public ResponseEntity<InventoryResponseRest>findByNameList(@PathVariable String name){
        ResponseEntity<InventoryResponseRest> response = service.findNameProducto(name);
        return response;
    }
    @GetMapping("/findByProveedor/{name}")
    public ResponseEntity<InventoryResponseRest>findByProveedorList(@PathVariable String name){
        ResponseEntity<InventoryResponseRest> response = service.findNameProveedor(name);
        return response;
    }
    @GetMapping("/findById/{id}")
    public ResponseEntity<InventoryResponseRest>findById(@PathVariable Long id){
        ResponseEntity<InventoryResponseRest> response = service.findById(id);
        return response;
    }

    @PostMapping("/save")
    public ResponseEntity<InventoryResponseRest>save(@RequestBody Inventory inventory){
        ResponseEntity<InventoryResponseRest> response = service.save(inventory);
        return response;
    }

    @GetMapping("/showInventory")
    public ResponseEntity<InventoryResponseRest>findAll(){
        ResponseEntity<InventoryResponseRest> response = service.showAll();
        Map<String, String> mensaje = new HashMap<>();
        mensaje.put("contenido", "EXITOSO");
        return response;
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<InventoryResponseRest>update(@RequestBody Inventory inventory, @PathVariable Long id){
        ResponseEntity<InventoryResponseRest> response = service.update(inventory, id);
        return response;
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<InventoryResponseRest>delete(@PathVariable Long id){
        ResponseEntity<InventoryResponseRest> response = service.deleteById(id);
        return response;
    }

}
