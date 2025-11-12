package city;

public class TestCity {
    public static void main(String[] args){
        // Exercice 1.1
        City saintGeours = new City("Saint-geours de Maremne","France",2946);
        City toulouse = new City("Toulouse","France",450000);
        City merignac = new City("Merignac","France",77136);

        //System.out.println(saintGeours.name + ". population = " + saintGeours.population + ". Pays : " + saintGeours.country);
        //System.out.println(toulouse.name + ". population = " + toulouse.population + ". Pays : " + toulouse.country);
        //toulouse.population+=20000;
        //System.out.println(toulouse.name + ". population = " + toulouse.population + ". Pays : " + toulouse.country);

        //System.out.println(saintGeours.getName() + ". population = "+ saintGeours.getPopulation() + ". Pays : "+ saintGeours.getCountry());
        //System.out.println(toulouse.getName() + ". population = "+ toulouse.getPopulation() + ". Pays : "+ toulouse.getCountry());
        //System.out.println(merignac.getName() + ". population = "+ merignac.getPopulation() + ". Pays : "+ merignac.getCountry());

        // Exercice 1.2
        saintGeours.offsetPopulation(-500);

        System.out.println(saintGeours.getName() + ". population = "+ saintGeours.getPopulation() + ". Pays : "+ saintGeours.getCountry());
    }
}
