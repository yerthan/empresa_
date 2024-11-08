package org.iesvdm.Ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.iesvdm.Ejercicio1.UtilEstadistica.media;

public class Prueba {

    public static void main(String[] args) {


        Double[] num = new Double[6] ;
        num[0] = 34.0;
        num[1] = 27.0;
        num[2] = 45.0;
        num[3] = 55.0;
        num[4] = 22.0;
        num[5] = 34.0;

        int escala = 3;

        RoundingMode ro =  RoundingMode.UP;

        BigDecimal bd = media(num, escala, ro);

        System.out.println(bd);

    }

}
