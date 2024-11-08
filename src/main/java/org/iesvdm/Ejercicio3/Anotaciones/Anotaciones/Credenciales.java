package org.iesvdm.Ejercicio3.Anotaciones.Anotaciones;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(LoginArray.class)


public @interface Credenciales {

    String usuario();
    String hashPasswd();


}
