package testpakage;
class Operation{
    int square(int n){
        return n*n;
    }
}
class Circle{
    double pi = 3.14;

    double area(int radius){
       Operation ag = new Operation();
        return pi*(ag.square(radius));
    }
}
class Address{
    String city, division , country;
    Address(String city, String division , String country){
        this.city = city;
        this.division = division;
        this.country = country;
    }
}
class Employee1{
    String name;
    int id;
    Address address;
    Employee1(String name, int id,Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void display(){
        System.out.println(id + " "+ name);
        System.out.println(address.city+"  "+address.division+"  "+ address.country);
    }
}


public class AggregationTest {
    public static void main(String[] args) {
        Address address1 = new Address("kendua","mymensing","Bangladesh");
        Employee1 ashik = new Employee1("ashik",2010376107,address1);
        ashik.display();
    }
}
