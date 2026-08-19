public class PasswordChecker {

    // Check length
    public boolean checkLength(String pw) {
        return pw.length() >= 8;
    }

    // Check uppercase letter
    public boolean checkUppercase(String pw) {
        return pw.matches(".*[A-Z].*");
    }

    // Check digit
    public boolean checkDigit(String pw) {
        return pw.matches(".*[0-9].*");
    }

    // Check special character
    public boolean checkSpecial(String pw) {
        return pw.matches(".*[^a-zA-Z0-9].*");
    }

    // Check password strength
    public String strength(String pw) {
        int count = 0;

        if (checkLength(pw))
            count++;

        if (checkUppercase(pw))
            count++;

        if (checkDigit(pw))
            count++;

        if (checkSpecial(pw))
            count++;

        if (count <= 1)
            return "Weak";
        else if (count <= 3)
            return "Medium";
        else
            return "Strong";
    }
} 
