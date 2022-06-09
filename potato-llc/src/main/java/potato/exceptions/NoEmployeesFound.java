package potato.exceptions;

public class NoEmployeesFound extends RuntimeException{
    public NoEmployeesFound() {
    }

    public NoEmployeesFound(String message) {
        super(message);
    }

    public NoEmployeesFound(String message, Throwable cause) {
        super(message, cause);
    }

    public NoEmployeesFound(Throwable cause) {
        super(cause);
    }

    public NoEmployeesFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
