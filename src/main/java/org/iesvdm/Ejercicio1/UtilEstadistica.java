package org.iesvdm.Ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UtilEstadistica {

    public static BigDecimal media(Double[] x, int escala, RoundingMode redondeo){

       //Esta variable sirve para sumar todos los datos del array
        Double suma = 0.0;

        //el bucle recorre todos los datos del array y los convierte
        //después coge y lo suma a la variable de suma
        for (double i : x){
            suma = suma + i;
        }

        BigDecimal bd = new BigDecimal(suma);


        //Hacemos la división
        double media = suma / escala;

        BigDecimal b2 = new BigDecimal(media);
        BigDecimal b3 = new BigDecimal(escala);
        //BigDecimal result = bd.divide(b2, 6, RoundingMode.HALF_UP);


        //Creamos el nuevo el bigDeciaml con los datos
        BigDecimal b4 = bd.divide(BigDecimal.valueOf(x.length), escala, redondeo );

        System.out.println(b3);
        return b4;

    }


}
