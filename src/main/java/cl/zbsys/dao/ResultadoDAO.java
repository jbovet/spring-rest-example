package cl.zbsys.dao;

import cl.zbsys.domain.Resultado;

import java.util.List;

/**
 * Created by josebovet on 12/23/15.
 */
public interface ResultadoDAO {

    List<Resultado> getAllResults();

    void insert(Resultado resultado);

    Resultado getResultadoById(Integer id);

    void deleteById(Integer id);

    void update(Resultado resultado);

}
