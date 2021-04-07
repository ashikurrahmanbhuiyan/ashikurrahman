package testpakage;
public class FinalKey {
    final int speed;
    FinalKey(){
        speed= 10;
    }
    void display(){
        System.out.println(speed);
    }
    static final int data;
    static {data=10;}
    public static void main(String[] args) {
        FinalKey a = new FinalKey();
        a.display();
    }
}
