package cl.zbsys.domain;

import java.util.Date;

/**
 * Created by josebovet on 12/23/15.
 */
public class Resultado {

    Integer idresultado;
    Long resultado;
    Date fecha;

    public Integer getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(Integer idresultado) {
        this.idresultado = idresultado;
    }

    public Long getResultado() {
        return resultado;
    }

    public void setResultado(Long resultado) {
        this.resultado = resultado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Resultado{" +
                "idresultado=" + idresultado +
                ", resultado=" + resultado +
                ", fecha=" + fecha +
                '}';
    }
}


