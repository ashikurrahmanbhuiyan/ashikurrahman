package testpakage;

public class thisClass {
    static String computerName = "asus";
    String firstName;
    String lastName;

    thisClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    thisClass(String firstName) {
        this.firstName = firstName;
    }

    void display() {
        System.out.println(firstName + " " + lastName);
    }

    public static void main(String[] args) {
        thisClass tryThis = new thisClass("ashik","bhuiyan");
        thisClass tryThis1 = new thisClass("ashik");
        System.out.println(tryThis.firstName);
        String owner = "ashik";
        System.out.println(owner);
        System.out.println(thisClass.computerName);
        tryThis.display();
        tryThis1.display();

    }
}
