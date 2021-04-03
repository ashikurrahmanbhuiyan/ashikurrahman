package testpakage;
public class thisClass3 {
    void m(thisClass3 s2){
        System.out.println("method is invoked "+ s2);
    }
    void p(int a){
        m(this);
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        thisClass3 s1 = new thisClass3();
        s1.p(10);
    }
}
