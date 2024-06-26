package com.almacen.allmacenservice.dao;

import com.almacen.allmacenservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface InventoryDao extends JpaRepository<Inventory, Long> {

    /**
     * busqueda por producto
     * @param name
     * @return
     */
    List<Inventory> findByProductoAlmacen(String name);

    /**
     * busqueda por proveedor
     * @param name
     * @return
     */
    List<Inventory> findByProveedorAlmacen(String name);

    /**
     *
     * @return
     */
    @Query("SELECT SUM(pu.precioUnitario) FROM Inventory pu")
    Double valorGeneralAlmacen();
}
