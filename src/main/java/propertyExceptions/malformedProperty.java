package propertyExceptions;

public class malformedProperty extends RuntimeException{
    public malformedProperty(String message) {
        super(message);
    }
}
