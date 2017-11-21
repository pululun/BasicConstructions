package es.esy.kapcapx.vectors;

public class VectorIndexOutOfBoundsException extends RuntimeException {

    public VectorIndexOutOfBoundsException() {
        super();
    }

    public VectorIndexOutOfBoundsException(String message) {
        super(message);
    }

    public VectorIndexOutOfBoundsException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
