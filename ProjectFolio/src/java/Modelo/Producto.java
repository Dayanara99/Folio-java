/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author daya_
 */
public class Producto {
    int id;
    String producto;
    int cantidad;
    double preciou;
    double total;

    public Producto() {
    }

    public Producto(int id, String producto, int cantidad, double preciou, double total) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.preciou = preciou;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPreciou() {
        return preciou;
    }

    public void setPreciou(double preciou) {
        this.preciou = preciou;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
   
}
