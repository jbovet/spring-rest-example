package cl.zbsys.services;

import java.util.List;

/**
 * Servicios de logica de negocio... etc..
 * Created by josebovet on 12/22/15.
 */
public interface OperatoriaService {

    int suma(int a, int b);

    int resta(int a, int b);

    /***
     * Primeros 1000 numeros
     *
     * @return
     */
    List<Integer> generarPrimos();


}
