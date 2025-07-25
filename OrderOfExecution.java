class Demo5{
    String name="Dinga";

    void m1(){
        System.out.println("M1 fun is called ");
    }
    Demo5(){
        System.out.println("No org cons is called");
    }
    static {
        System.out.println("Static block is called" );
    }
    {
        System.out.println("Non static block is called");
    }
}
public class OrderOfExecution {
    public static void main(String []args){
        new Demo5().m1();
    }
    
}
