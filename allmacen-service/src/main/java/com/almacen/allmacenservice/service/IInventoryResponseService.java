package com.almacen.allmacenservice.service;

import com.almacen.allmacenservice.model.Inventory;
import com.almacen.allmacenservice.response.InventoryResponseRest;
import org.springframework.http.ResponseEntity;

public interface IInventoryResponseService {
    public ResponseEntity<InventoryResponseRest> search();
    public ResponseEntity<InventoryResponseRest> save(Inventory inventory);
    public ResponseEntity<InventoryResponseRest>showAll();
    public ResponseEntity<InventoryResponseRest>findById(Long id);
    public ResponseEntity<InventoryResponseRest>update(Inventory inventory, Long id);
    public ResponseEntity<InventoryResponseRest>deleteById(Long id);
    public ResponseEntity<InventoryResponseRest>findNameProducto(String name);
    public ResponseEntity<InventoryResponseRest>findNameProveedor(String name);
}
