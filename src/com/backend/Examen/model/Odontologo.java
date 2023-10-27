
package com.backend.Examen.model;

public class Odontologo {

    private int id;

    private int numeroMatri;

    private String nombre;

    private String apellido;



    public Odontologo(int numeroMatri, String nombre, String apellido) {

        this.numeroMatri = numeroMatri;

        this.nombre = nombre;

        this.apellido = apellido;

    }



    public Odontologo(int id, int numeroMatri, String nombre, String apellido) {

        this.id = id;

        this.numeroMatri = numeroMatri;

        this.nombre = nombre;

        this.apellido = apellido;

    }



    public int getId() {

        return id;

    }
    public void setId(int id) {

        this.id = id;

    }



    public int getNumeroMatri() {

        return numeroMatri;

    }



    public void setNumeroMatri(int numeroMatri) {

        this.numeroMatri = numeroMatri;

    }



    public String getNombre() {

        return nombre;

    }



    public void setNombre(String nombre) {

        this.nombre = nombre;

    }



    public String getApellido() {

        return apellido;

    }



    public void setApellido(String apellido) {

        this.apellido = apellido;

    }



    @Override

    public String toString() {

        return "Odontologo{" +

                "id=" + id +

                ", numeroMatri=" + numeroMatri +

                ", nombre='" + nombre + '\'' +

                ", apellido='" + apellido + '\'' +

                '}';

    }

}
