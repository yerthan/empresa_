package org.iesvdm.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class BipMap<K, V> {


    Map<K,V> map;


    public BipMap() {
        this.map = new HashMap<>();
    }


    /*
    * Si no existe, lo que va a hacer es dar un error
    * y si existe lo que va a hacer es actualizar
    * */
    public BipMap<K,V> biMaput(K k, V v){



        if(this.map.containsKey(k)){
            System.out.println("Se realiza una actualización");
            this.map.put(k,v);
        }else{
            System.out.println("Error");
            throw new IllegalArgumentException("Error");
        }
       return this;
    }



    /*
    *Esta funcion lo que hace es poner si o sí el valor, en el caso de que exista, lo va a actualizar
    **/
        public BipMap<K,V> forcePut(K k, V v){

            if(this.map.containsKey(k)){
                this.map.put(k,v);
            }else{
                this.map.put(k,v);
            }

            //BipMap<K,V> nueva = new BipMap<>();

            return this;
        }


        public BipMap<K,V> inv(){

            BipMap z = this;


            if(this.map.isEmpty()){
                System.out.println("mapa vacio");
            }else{

            }

            return this;

        }

    @Override
    public String toString() {
        return "BipMap{" +
                "map=" + map +
                '}';
    }
}
