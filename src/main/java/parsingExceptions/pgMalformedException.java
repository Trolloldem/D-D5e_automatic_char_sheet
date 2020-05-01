package parsingExceptions;

public class pgMalformedException extends RuntimeException{
    public pgMalformedException(String message) {
        super(message);
    }
}
