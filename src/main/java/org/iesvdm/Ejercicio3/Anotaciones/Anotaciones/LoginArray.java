package org.iesvdm.Ejercicio3.Anotaciones.Anotaciones;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface LoginArray {
    Credenciales[] value();
}
