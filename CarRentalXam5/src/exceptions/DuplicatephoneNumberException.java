package exceptions;

public class DuplicatephoneNumberException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DuplicatephoneNumberException(String contactphoneNumber) {
        super("Contact with phonenumber '" + contactphoneNumber + "' already exists.");
    }

}
