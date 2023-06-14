package pro.sky.course2;


@ResponseStatus
public class WrongNameFormatException extends RuntimeException {

    public WrongNameFormatException() {
        super("WrongNameFormatException");
    }

    public WrongNameFormatException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }

}
