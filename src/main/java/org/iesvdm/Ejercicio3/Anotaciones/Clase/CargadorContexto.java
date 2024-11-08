package org.iesvdm.Ejercicio3.Anotaciones.Clase;

import org.iesvdm.Ejercicio3.Anotaciones.Anotaciones.Credenciales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CargadorContexto {

    public static List<Credenciales> valorCredenciales(){
        return Arrays.asList(Usuarios.class.getAnnotationsByType(Credenciales.class));
    }


    /*
    * Lo que hacemos aquí es crear un usuario y lo comparamos con nuestra contraseña
    * entonces vemos si tiene el acceso o lo tiene denegado.
    * */
    public static List<Usuario> cargardorUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        for (Credenciales c : valorCredenciales()){
            Usuario u = new Usuario();
            u.setNombre(c.usuario());
            u.setPassword(c.hashPasswd());
            usuarios.add(u);
        }

        return usuarios;
    }

}
