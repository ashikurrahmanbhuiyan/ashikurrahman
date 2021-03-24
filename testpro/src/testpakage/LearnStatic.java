package testpakage;
class Counter{
   static int count = 0;
    Counter(){
        count++;
        System.out.println(count);
    }
    static void change(){
        count=100;
    }
}
        class LearnStatic {
            public static void main(String[] args) {
                Counter c1 = new Counter();
                Counter c2 = new Counter();
                Counter.change();
                Counter c3 = new Counter();
            }
 }