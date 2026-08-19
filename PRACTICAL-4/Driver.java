public class Driver {

    public static void main(String[] args) {

        PasswordChecker pc = new PasswordChecker();

        String[] passwords = {
            "abc",
            "password",
            "Password",
            "Pass1234",
            "Abcd1234!"
        };

        for (String pw : passwords) {

            System.out.println("Password: " + pw);

            System.out.println("Length >= 8: " + pc.checkLength(pw));
            System.out.println("Has Uppercase: " + pc.checkUppercase(pw));
            System.out.println("Has Digit: " + pc.checkDigit(pw));
            System.out.println("Has Special Character: " + pc.checkSpecial(pw));

            System.out.println("Strength: " + pc.strength(pw));
            System.out.println("----------------------------");
        }
    }
}
