package com.example.pm01ej2;

public class DatosPersonales {

    public String Nombres,Apellidos,Correo;
    public Integer Edad;



    public DatosPersonales() {
        this.Nombres= Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Correo = Correo;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }
}
