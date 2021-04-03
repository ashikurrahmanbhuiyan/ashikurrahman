package testpakage;
class A5{
    void m(){
        System.out.println(this);
    }
}
class B{
    thiskeyword obj;
    B(thiskeyword obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj.owner);
        System.out.println(obj.data);
    }


}
public class thiskeyword {
    int data = 10;
    String owner = "ashik";
    thiskeyword(){
        B b = new B(this);

    }
    public static void main(String[] args) {
        thiskeyword a = new thiskeyword();
        A5 obj = new A5();
        System.out.println(obj);
        obj.m();

    }
}
