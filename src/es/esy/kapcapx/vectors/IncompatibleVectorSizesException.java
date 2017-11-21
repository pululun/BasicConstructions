package es.esy.kapcapx.vectors;

public class IncompatibleVectorSizesException extends Exception{

    public IncompatibleVectorSizesException () {
        super();
    }
    public IncompatibleVectorSizesException (String message) {
        super(message);
    }

    public IncompatibleVectorSizesException (String message, Throwable throwable) {
        super(message, throwable);
    }

}
