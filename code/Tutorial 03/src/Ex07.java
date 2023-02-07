public class Ex07 {
    public static void main(String args[]) {
        String firstName = "Kamala";
        String middleName = "Sugarcane";
        String lastName = "Perera";
        int age = 20;

        StringBuilder password = new StringBuilder(" ");
        password.setCharAt(0, firstName.toLowerCase().charAt(0));
        password.append(middleName.toLowerCase().substring(0, 2));
        password.append(lastName.toLowerCase().substring(lastName.length()-3,lastName.length()-1));
        password.append(age * 100);

        System.out.println("Password: " + password);

    }
}
