package parsingExceptions;

public class equipMalformedException extends RuntimeException {
	public equipMalformedException(String message, int line) {
        super("Error: " + message + " > line:" + line);
    }
}
