package testpakage;
class owner{
    String firstName;
    String lastName;
    int age;
    int Class;

    void insert(String firstName,String lastName,int age, int Class){
        this.firstName = firstName;
        this.lastName=lastName;
        this.age=age;
        this.Class=Class;

    }
   void display() {
        System.out.println(firstName + " " + lastName + " " + age + " " + Class);
    }
}
public class ownername {
    public static void main(String[] args) {
        owner ashik = new owner();
        owner lovely = new owner();
        ashik.insert("ashik","bhuiyan",21,13);
        lovely.insert("lovely","talukder",26,18);
        ashik.display();
        lovely.display();


    }
}
