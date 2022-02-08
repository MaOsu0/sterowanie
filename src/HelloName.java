public class HelloName {
    public static void main(String[] args) {
        final String name1 = "Krzysiek";
        final String name2 = "Piotrek";
        final String name3 = "Wojtek";
        final String name4 = "Maciek";

        String name = "Krzysiek";

        switch (name) {
            case name1:
            case name2:
            case name3:
                System.out.println("Siemka, witaj w aplikacji!");
                break;
            case name4:
                System.out.println("Witam Panie prezesie, jak mija dzień?");
                break;
            default:
                System.out.println("Witaj nieznany użytkowniku");
        }
        System.out.println("Konic programu");
    }
    

}
