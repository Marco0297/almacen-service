/**
 * @author: Marco Antonio Sánchez Contreras
 */
package com.almacen.allmacenservice.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tabla_almacen")
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Fecha de ingreso de los producto
     */
    private Date fchIn;

    /**
     * Nombre del producto
     */
    private String productoAlmacen;

    /**
     * Nombre del proveedor
     */
    private String proveedorAlmacen;

    /**
     * Color del producto (caracteristicas)
     */
    private String color;

    /**
     * Observaciones del producto
     */
    private String observaciones;

    /**
     * Cantidad del producto que hay en almacen
     */
    private Integer cantidadAlmacen;

    /**
     * Precio del producto por pieza
     */
    private Double precioUnitario;

    /**
     * Valor total por cada producto que se encuentra en alacen
     */
    private Double valorTotalProductoAlmacen;

    /**
     * Precio de todos los productos en general dentro del almacen
     */
    private Double precioGralAlmacen;



    /**
     * Constructor
     */
    public Inventory() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFchIn() {
        return fchIn;
    }

    public void setFchIn(Date fchIn) {
        this.fchIn = fchIn;
    }

    public String getProductoAlmacen() {
        return productoAlmacen;
    }

    public void setProductoAlmacen(String productoAlmacen) {
        this.productoAlmacen = productoAlmacen;
    }

    public String getProveedorAlmacen() {
        return proveedorAlmacen;
    }

    public void setProveedorAlmacen(String proveedorAlmacen) {
        this.proveedorAlmacen = proveedorAlmacen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getCantidadAlmacen() {
        return cantidadAlmacen;
    }

    public void setCantidadAlmacen(Integer cantidadAlmacen) {
        this.cantidadAlmacen = cantidadAlmacen;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getValorTotalProductoAlmacen() {
        return valorTotalProductoAlmacen;
    }

    public void setValorTotalProductoAlmacen(Double valorTotalProductoAlmacen) {
        this.valorTotalProductoAlmacen = valorTotalProductoAlmacen;
    }

    public Double getPrecioGralAlmacen() {
        return precioGralAlmacen;
    }

    public void setPrecioGralAlmacen(Double precioGralAlmacen) {
        this.precioGralAlmacen = precioGralAlmacen;
    }
}
