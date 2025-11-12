package person;

import city.City;

import java.util.ArrayList;

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

        //System.out.println(skanderberg);
        //System.out.println(hannibal);
        //System.out.println(belisarius);


        Person macron   = new Person("Emmanuel", "Macron",   43, "L'Élysée, Paris",          new City("Amiens",        "France"));
        Person sarkozy  = new Person("Nicolas",  "Sarkozy",  66, "Paris",                     new City("Paris",         "France",2000000));
        Person johnson  = new Person("Boris",    "Johnson",  56, "Downing Street, London",    new City("New York",      "États-Unis"));
        Person depardieu= new Person("Gérard",   "Depardieu",72, "Moscou",                    new City("Châteauroux",   "France"));
        Person kravitz  = new Person("Lenny",    "Kravitz",  56, "Hôtel particulier, Paris",  new City("New York",      "USA"));
        Person lawrence = new Person("Jennifer", "Lawrence", 30, "Louisville, USA",           new City("Indian Hills",  "USA"));

        System.out.println(macron);
        System.out.println(sarkozy);
        System.out.println(johnson);
        System.out.println(depardieu);
        System.out.println(kravitz);
        System.out.println(lawrence);


        System.out.println("");





        Person.printWithFilter(Person.personsList);
    }
}

