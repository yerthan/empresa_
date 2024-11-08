package org.iesvdm.Ejercicio3.Anotaciones.Clase;

import org.iesvdm.Ejercicio3.Anotaciones.Anotaciones.Credenciales;

import java.util.ArrayList;
import java.util.List;

@Credenciales(usuario = "usuario1", hashPasswd = "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918")
@Credenciales(usuario = "usuario2", hashPasswd = "ac9689e2272427085e35b9d3e3e8bed88cb3434828b43b86fc0596cad4c6e270")



public class Usuarios {

    String nombre;
    List<Usuario> usuarios = new ArrayList<Usuario>();

    public Usuarios(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", usuarios=" + usuarios +
                '}';
    }
}
