package cl.zbsys.exceptions;

/**
 * Created by josebovet on 12/22/15.
 */
public class OperationException extends Exception {

    public OperationException() {
        super();
    }

    public OperationException(String message) {
        super(message);
    }

    public OperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public OperationException(Throwable cause) {
        super(cause);
    }

    protected OperationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
