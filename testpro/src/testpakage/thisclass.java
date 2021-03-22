package testpakage;

public class thisclass {
    String firstName;
    String lastName;
    thisclass(String firstName1,String lastName1){
          firstName=firstName1;
          lastName = lastName1;
    }
    void display(){
        System.out.println(firstName+lastName);
    }

    public static void main(String[] args) {
        thisclass trythis = new thisclass("ashik","bhuiyan");
        trythis.display();

    }
}
