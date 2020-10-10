package com.Cloudinary_Rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "prenda")
public class Prenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPrenda;
    private String nombre;
    private float precio;
    @OneToOne
    @JoinColumn(name="id")
    private Imagen imagen;

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "idPrenda=" + idPrenda +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", imagen=" + imagen +
                '}';
    }
}
