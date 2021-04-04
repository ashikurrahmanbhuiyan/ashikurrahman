package testpakage;

class test{
    void employee(String name){
        System.out.println(name);
    }
    void employee(int id){
        System.out.println(id);
    }
    void employee(String name , int id){
        System.out.println(name + " " +id);
    }
}

public class methodOverLoading {
    public static void main(String[] args) {
        test new1 = new test();
        new1.employee("ashik is good");
    }
}
