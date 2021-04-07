package OPPs2;

public class DBugTest {
    int a;
    String name;
    void insert(int a,String name){
        this.a= a;
        this.name= name;
    }
    void display(){
        System.out.println(a+" "+name);
    }
    public static void main(String[] args) {
        DBugTest obj = new DBugTest();
        obj.insert(2010376107,"ashik");
        obj.display();
    }
}
