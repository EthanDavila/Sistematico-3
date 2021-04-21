/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author Sistemas-32
 */
public class Producto {

    private int NoCodigo;
    private String Nombre;
    private String Cantidad;
    private float Precio;

    public Producto() {
    }

    public Producto(int NoCodigo, String Nombre, String Cantidad, float Precio) {
        this.NoCodigo = NoCodigo;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public int getNoCodigo() {
        return NoCodigo;
    }

    public void setNoCodigo(int NoCodigo) {
        this.NoCodigo = NoCodigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }
}
