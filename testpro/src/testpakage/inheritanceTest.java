package  testpakage;
class Animal{
    String color = "green";
    void eat(){
        System.out.println("eating");
    }
}
class Dog extends Animal{
    String color = "Red";
    void breaking(){
        System.out.println("breaking");
    }
    void eat(){
        System.out.println("dog is eating");
        super.eat();
    }
    void pcolor(){
        System.out.println(this.color);
        System.out.println(super.color);
    }
}
class Employee{
    float salary = 120000;
    void mess(){
        System.out.println("eat");
    }
}
class programmer extends Employee{
    int bonus = 20000;
}
class ashik extends programmer{
    String name = "ashik";
}
class laboni extends Animal  {
    String name = "laboni";
}
public class inheritanceTest{
    public static void main(String[] args) {
        Dog tomy = new Dog();
        tomy.breaking();
        tomy.eat();
    }
}
