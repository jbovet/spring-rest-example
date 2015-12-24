package cl.zbsys.services;

import cl.zbsys.dao.ResultadoDAO;
import cl.zbsys.domain.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by josebovet on 12/22/15.
 */
@Service
public class OperatoriaServiceImpl implements OperatoriaService {

    @Autowired
    ResultadoDAO resultadoDAO;

    @Override
    public int suma(int a, int b) {
        return a + b;
    }

    @Override
    public int resta(int a, int b) {
        return a - b;
    }

    @Override
    public List<Integer> generarPrimos() {
        List<Integer> primos = new ArrayList<Integer>();
        int i = 0;
        int num = 0;
        for (i = 1; i <= 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) primos.add(i);
        }
        return primos;
    }

    @Override
    public List<Resultado> obtenerResultados() {
        //alguna logica extra
        return resultadoDAO.getAllResults();
    }
}