package com.company.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Elemento {
    @PrimaryKey(autoGenerate = true)
    int id;
    String nombre;
    String descripcion;
    int hora;
    String URL;

    float valoracion;

    public Elemento(String nombre, String descripcion, int hora ,String URL) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.hora = hora;
        this.URL=URL;



    }
}
