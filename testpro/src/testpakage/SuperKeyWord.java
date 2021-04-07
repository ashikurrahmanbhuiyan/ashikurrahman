package testpakage;
class People{
    int id;
    String name;
    People(int id , String name){
        this.id = id;
        this.name = name;
    }
}
class emp extends People{
    float salary;
    emp(int id,String name,int salary){
        super(id,name);
        this.salary = salary;
    }
    void display(){
        System.out.println(id+" "+name+" "+ salary);
    }
}
public class SuperKeyWord {
    public static void main(String[] args) {
     Dog pauppy = new Dog();
     pauppy.pcolor();
     pauppy.eat();
     emp e1 = new emp(2010376107,"ashik",400000);
     e1.display();

    }
}
