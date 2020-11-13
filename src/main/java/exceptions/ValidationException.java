package exceptions;

/**
 * Used in factories to validate
 */
public class ValidationException extends Exception {

    public ValidationException(String message) {
        super(message);
    }
}
