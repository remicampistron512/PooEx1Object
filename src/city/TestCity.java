package city;

public class TestCity {
    public static void main(String[] args){
        City saintGeours = new City("Saint-geours de Maremne","France",2946);
        City toulouse = new City("Toulouse","France",450000);
        City merignac = new City("Merignac","France",77136);

        System.out.println(saintGeours.name + ". population = " + saintGeours.population + ". Pays : " + saintGeours.country);
        System.out.println(toulouse.name + ". population = " + toulouse.population + ". Pays : " + toulouse.country);
        toulouse.population+=20000;
        System.out.println(toulouse.name + ". population = " + toulouse.population + ". Pays : " + toulouse.country);
    }
}
