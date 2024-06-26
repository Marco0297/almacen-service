package com.almacen.allmacenservice.utils;

import com.almacen.allmacenservice.model.Inventory;

public class PrecioAlmacen {
    public Double valoGralAlmacen(){
        Double total = 0.0;
        Inventory inventory = new Inventory();
        total = total +inventory.getPrecioGralAlmacen();
        return total;
    }
}
