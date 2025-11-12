package person;

public class TestPerson {
    public static void main(String[] args) {
        Person skanderberg = new Person("Skanderberg","Kastrioti",63, "Krujë" );
        Person hannibal = new Person("Hannibal","Barca",66);
        Person belisarius = new Person ("Belisarius","Flavius");


        System.out.println(skanderberg);
        System.out.println(hannibal);
        System.out.println(belisarius);
    }
}
