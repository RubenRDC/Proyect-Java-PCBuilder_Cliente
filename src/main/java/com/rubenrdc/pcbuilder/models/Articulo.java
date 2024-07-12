package com.rubenrdc.pcbuilder.models;

import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class Articulo {

    private String title, marca, oficialDocumentation;
    private ImageIcon imagen;

    public Articulo(String title, String marca) {
        this.title = title;
        this.marca = marca;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(String fileName) {
        this.imagen = new ImageIcon(fileName);
    }

    public String getOficialDocumentation() {
        return oficialDocumentation;
    }

    public void setOficialDocumentation(String oficialDocumentation) {
        this.oficialDocumentation = oficialDocumentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o.getClass() == this.getClass()) {
            Articulo art = (Articulo) o;
            if (art.getTitle().equals(this.getTitle()) & art.getMarca().equals(this.getMarca())) {
                return true;
            }
        }
        return false;
    }
}
