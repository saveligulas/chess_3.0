package gulas.saveli.error;

public class InvalidCoordinateException extends RuntimeException {
    public InvalidCoordinateException() {
        super("Given Coordinates are out of bounds");
    }
}
