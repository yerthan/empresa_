package org.iesvdm.Ejercicio3.Anotaciones.Clase;

import org.iesvdm.Ejercicio3.Anotaciones.Anotaciones.Credenciales;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Login {

    public  void login(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el usuario");
        String usuario = sc.nextLine();
        System.out.println("Dime el password");
        String password = sc.nextLine();

        Usuario u = new Usuario(usuario, password);

        List<Credenciales> l = CargadorContexto.valorCredenciales();

        for (Credenciales c : l) {
            if(c.usuario().equals(u.getNombre())){
                System.out.println("Si está dentro de la lista");
                String s = c.hashPasswd();
                if(s.equals(u.getPassword())){
                    System.out.println("Acceso concedido");
                }else{
                    System.out.println("Acceso Denegado");
                }

            }else{
                System.out.println("No esta en la lista");
            }
        }


    }

}
