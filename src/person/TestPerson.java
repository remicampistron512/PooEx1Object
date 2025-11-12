package person;

import city.City;

public class TestPerson {
    public static void main(String[] args) {
        //Exercice 1.8
        //Person skanderberg = new Person("Skanderberg","Kastrioti",63, "Krujë" );
        //Person hannibal = new Person("Hannibal","Barca",66);
        //Person belisarius = new Person ("Belisarius","Flavius");

        //Exercice 1.9
        Person skanderberg = new Person("Skanderberg","Kastrioti",63, "Krujë",new City("Istanbul","Empire Ottoman"));
        Person hannibal = new Person("Hannibal","Barca",66);
        Person belisarius = new Person ("Belisarius","Flavius");

        System.out.println(skanderberg);
        System.out.println(hannibal);
        System.out.println(belisarius);
    }
}

