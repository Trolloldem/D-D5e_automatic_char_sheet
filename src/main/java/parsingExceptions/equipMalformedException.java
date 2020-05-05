package parsingExceptions;

public class equipMalformedException extends RuntimeException {
	public equipMalformedException(String message, int line) {
        super("line: " + line + " " + message);
    }
}
