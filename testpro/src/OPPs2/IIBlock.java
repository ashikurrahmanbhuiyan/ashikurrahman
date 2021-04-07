package OPPs2;
class superClass{
    void eat(){
        System.out.println("eating");
    }
}
public class IIBlock extends superClass{
    IIBlock(){
        System.out.println("ashik");
    }
    {
        System.out.println("mahi");
    }
    public static void main(String[] args) {
        IIBlock obj = new IIBlock();
    }
}
