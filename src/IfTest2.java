public class IfTest2 {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");

        System.out.println("Wybierz opcję:");
        System.out.println("0 - wyjście z programu");
        System.out.println("1 - wyświetl informacje o użytkwniku");
        System.out.println("2 - modyfikacja danych");

        int option = 1;

        if (option == 0) {
            System.out.println("Bye bye");
        } else if (option == 1) {
            System.out.println("Użytkownik " + user.getFirstName() + " " + user.getLastName());
        } else if (option == 2) {
            user.setFirstName("Marian");
            user.setLastName("Powolny");
            System.out.println("Zmodyfikowane dane użytkownika " + user.getFirstName() + " " + user.getLastName());
        } else {
            System.out.println("Błędna opcja");
        }
    }
}
