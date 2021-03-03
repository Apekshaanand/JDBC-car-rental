package exceptions;

public class DuplicateNameException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DuplicateNameException(String contactName) {
        super("Contact with name '" + contactName + "' already exists.");
    }

}
