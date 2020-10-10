package com.Cloudinary_Rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "imagen")
public class Imagen {

    @Id
    private String imagenId;
    private String name;
    private String imagenUrl;


    public Imagen() {
    }

    public Imagen(String name, String imagenUrl, String imagenId) {
        this.name = name;
        this.imagenUrl = imagenUrl;
        this.imagenId = imagenId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getImagenId() {
        return imagenId;
    }

    public void setImagenId(String imagenId) {
        this.imagenId = imagenId;
    }

    @Override
    public String toString() {
        return "Imagen{" +
                "imagenId='" + imagenId + '\'' +
                ", name='" + name + '\'' +
                ", imagenUrl='" + imagenUrl + '\'' +
                '}';
    }
}
