package parsingExceptions;

public class malformedPropertyException extends RuntimeException{
    public malformedPropertyException(String message) {
        super(message);
    }
}
