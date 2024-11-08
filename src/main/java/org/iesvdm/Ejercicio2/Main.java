package org.iesvdm.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, Integer> mapa = new HashMap<>();
        BipMap bp = new BipMap();

        bp = bp.forcePut(1, "1");
        bp = bp.biMaput(1,  "2");
        bp.biMaput(1, "1");
        bp.biMaput(2, "2");
        bp.biMaput(1, "2");
    }

}
