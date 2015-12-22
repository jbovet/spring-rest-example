package cl.zbsys.domain;

import javax.validation.constraints.NotNull;

/**
 * Created by josebovet on 12/22/15.
 */
public class Parametros {

    @NotNull
    int a;

    @NotNull
    int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "SumaParametros{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
