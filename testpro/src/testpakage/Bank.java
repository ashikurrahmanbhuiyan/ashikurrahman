package testpakage;

class Account{
    String name;
    int acc_no;
    float amount;
    void insert(String name,int acc_no,float amount) {
        this.name = name;
        this.acc_no = acc_no;
        this.amount = amount;
    }
    void diposit(float money) {
        amount= amount+money;
        System.out.println(money+" diposited");
    }
    void withdrow(float money) {
        if(money>amount)
            System.out.println("insufficent balance");
        else
        {
            amount= amount- money;
            System.out.println(money+" withdraw");
        }
    }void cheakBalance(){
        System.out.println("your balance is "+amount);
    }
    void display() {
        System.out.println(name+" "+acc_no+" "+amount);
    }
}

public class Bank {
    public static void main(String[] args) {
        Account m1 = new Account();
        m1.insert("ashik", 69, 0);
        m1.diposit(4000);
        m1.cheakBalance();
        m1.diposit(100000);
        m1.display();
    }

}
