package testpakage;

public class thisclass {
    static String computerName = "asus";
    String firstName;
    String lastName;
    thisclass(String firstName,String lastName){
          this.firstName=firstName;
          this.lastName = lastName;
    }
    thisclass(String firstName){
        this.firstName = firstName;
    }
    void display(){
        System.out.println(firstName+" "+lastName);
    }

    public static void main(String[] args) {
        thisclass trythis = new thisclass("ashik","bhuiyan");
        thisclass trythis1 = new thisclass("ashik");
        System.out.println(trythis1.computerName);

    }
}
