package person;
import city.City;
public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String address;
    public City bornCity;

    public Person(String firstName,String  lastName, int age, String address, City bornCity){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.bornCity = bornCity;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        String completeDescription = "[lastName="+ this.lastName + ", firstName=" + this.firstName + ", age="+ this.age + ", address="+this.address +"]";
        if (this.bornCity != null){
            completeDescription += "bornCity = "+ this.bornCity;
        }
        return completeDescription;
    }
}
