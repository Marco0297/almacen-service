package com.almacen.allmacenservice.response;

import com.almacen.allmacenservice.model.Inventory;

import java.util.List;

public class InventoroyResponse {
    private List<Inventory> inventory;

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }
}
