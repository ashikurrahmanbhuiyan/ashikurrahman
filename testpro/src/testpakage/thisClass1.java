package testpakage;
class thisMethod{
    thisMethod(int b,int c){
        System.out.println("this is this");
    }
    thisMethod(int a){
        this(20,13);
        System.out.println(a);
    }
}
public class thisClass1 {
    public static void main(String[] args) {

        thisMethod a = new thisMethod(10);
    }
}
