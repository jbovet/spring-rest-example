package cl.zbsys.dao;

import cl.zbsys.domain.Resultado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by josebovet on 12/23/15.
 */
@Repository
public class ResultadoDAOImpl implements ResultadoDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Resultado> getAllResults() {
        String sql = "SELECT *  FROM RESULTADO";
        return jdbcTemplate.query(sql, new ResultSetExtractor<List<Resultado>>() {
            @Override
            public List<Resultado> extractData(ResultSet rs) throws SQLException, DataAccessException {
                List<Resultado> resultados = new ArrayList<Resultado>();
                while (rs.next()) {
                    Resultado resultado = new Resultado();
                    resultado.setIdresultado(rs.getInt(1));
                    resultado.setResultado(rs.getLong(2));
                    resultado.setFecha(rs.getTimestamp(3));
                    resultados.add(resultado);
                }
                return resultados;
            }
        });
    }

    @Override
    public void insert(Resultado resultado) {
        //TODO

    }

    @Override
    public Resultado getResultadoById(Integer id) {
        //TODO
        return null;
    }

    @Override
    public void deleteById(Integer id) {
        //TODO

    }

    @Override
    public void update(Resultado resultado) {
        //TODO
    }
}
