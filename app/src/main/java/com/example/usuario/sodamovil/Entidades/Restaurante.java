package com.example.usuario.sodamovil.Entidades;

import android.graphics.Bitmap;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by Danel on 4/12/2017.
 */

public class Restaurante {

    private String codigo;
    private String nombre;
    private String descripcion;
    private Bitmap imagen; //http://stackoverflow.com/questions/9357668/how-to-store-image-in-sqlite-database
    private Double latitudesH;
    private Double latitudesV;
    private String horario;
    private List<String> usuarios;


    public Restaurante(String codigo, String nombre, String descripcion, Bitmap imagen, Double latitudesH, Double latitudesV, String horario, List<String> usuarios) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.latitudesH = latitudesH;
        this.latitudesV = latitudesV;
        this.usuarios=usuarios;
        this.horario=horario;
    }

    public Restaurante() {
        this.codigo = "";
        this.nombre = "";
        this.descripcion = "";
        this.imagen = null;
        this.latitudesH = 0.0;
        this.latitudesV = 0.0;
        this.horario="";
        this.usuarios= new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Bitmap getImagen() {
        return imagen;
    }

    public void setImagen(Bitmap imagen) {
        this.imagen = imagen;
    }

    public Double getLatitudesH() {
        return latitudesH;
    }

    public void setLatitudesH(Double latitudesH) {
        this.latitudesH = latitudesH;
    }

    public Double getLatitudesV() {
        return latitudesV;
    }

    public void setLatitudesV(Double latitudesV) {
        this.latitudesV = latitudesV;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<String> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<String> usuarios) {
        this.usuarios = usuarios;
    }
}