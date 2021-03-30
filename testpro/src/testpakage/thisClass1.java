package testpakage;
class thisMethod{
    thisMethod(){
        System.out.println("this is this");
    }
    thisMethod(int a){
        this();
        System.out.println(a);
    }
}
public class thisClass1 {
    public static void main(String[] args) {
      thisMethod a = new thisMethod(10);
    }
}
