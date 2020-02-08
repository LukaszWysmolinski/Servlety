package pl.sdacademy.userdb;

public class UserValidator {

    public static void validate(User user, String confirmPassword) throws UserValidationException {
        try {
            if(!user.getPassword().equals(confirmPassword)){
                throw new UserValidationException("Password are not the same");
            }
        } catch (NullPointerException e) {
            throw new UserValidationException("Passwords cannot be null", e);
        }
        if (hasErrors()) {
            throw new UserValidationException("User validation failed");
        }
    }

    private static boolean hasErrors() {
        return false;
    }

}
