package city;

public class City {
    public String name;
    public String country;
    public int population;

    public City(String name, String country, int population){
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public City(String name, int population){
        this.name = name;
        this.population = population;
    }
    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPopulation(int population) {
        if(population < 0)
            throw new RuntimeException("La population ne peut pas être négative !");
        this.population = population;
    }

    public void offsetPopulation(int offset){
        if (offset < 0 && this.population + offset < 0){
            throw new RuntimeException("La population ne peut pas être négative !");
        } else {
            this.population += offset;
        }
    }
}
