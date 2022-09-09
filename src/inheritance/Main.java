package inheritance;

public class Main {
    static Employee employee1, employee2, employee3, employee4;

    public static void main(String[] args) {
        // Skapa upp massa anställda (inkl employee1 som anropas på rad 14)
        createEmployees();

        /*
        * Så länge som employee1 är uppskapad före den här kodraden så kommer det gå fint att anropa
        * getId(), om jag inte skulle ha initierat employee1 innan den här raden så får jag ett NullPointerException
        */
        System.out.println(employee1.getId());
        System.out.println(employee1.getName());
        System.out.println(employee2.getName());

        // Skapar upp två Customer
        Customer customer1 = new Customer(
                "Agda",
                "Grå",
                87,
                true,
                200);
        Customer customer2 = new Customer(
                "Bengt",
                "Inget hår",
                39,
                false,
                5000);

        // Skriver ut information om två olika objekt; customer1 och customer2
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());

        // Skapar upp tre objekt som är av både typen Person (superklass) och subklasser till den
        Person emp1 = new Employee(
                "Lena",
                "Lila",
                33,
                false,
                1);
        Person cust1 = new Customer(
                "Agda",
                "Grå",
                87,
                true,
                200);
        Person child1 = new Child(
                "Nova",
                "Blond",
                9,
                true,
                0,
                true);
    }

    // Den här metoden ska enbart sätta värden på de variabler som jag har deklarerat högst upp i den här klassen.
    // Om jag vill ha fler så är det bara att fylla på, men för att kunna nå Employeeobjekten utanför den här metoden
    // så MÅSTE jag deklarera dem utanför den här metoden. Exempelvis högst upp i den här klassen så att alla metoder
    // kan nå den.
    static void createEmployees() {
        employee1 = new Employee("Lena", "Lila", 33, false, 1);
        employee2 = new Employee("Jyri", "Svart", 38, false, 2);
        employee3 = new Employee("Lena", "Lila", 33, false, 3);
        employee4 = new Employee("Jyri", "Svart", 38, false, 4);
    }
}
