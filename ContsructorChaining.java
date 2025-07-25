class Demo1{
    Demo1(){
        System.out.println("Demo1 class no org conds called ");
    }
}

class Demo2 extends Demo1{
Demo2(){
    this(10);
    System.out.println("No org cons is called ");
}
Demo2(int x){
    this("Deeksha");
    System.out.println("Int org cons is called");
}
Demo2(String s){
    super();
    System.out.println("String org cons is called");
}
}
public class ContsructorChaining {
    public static void main(String args[]){
        new Demo2();
    }
}
