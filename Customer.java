public class Customer {
    public static void main(String []args){
        phonepe p = phonepe.getObj();
        System.out.println(p.hashCode());
         phonepe p1 = phonepe.getObj();
        System.out.println(p1.hashCode());
        phonepe p2 = phonepe.getObj();
        System.out.println(p2.hashCode());
        phonepe p3 = phonepe.getObj();
        System.out.println(p3.hashCode());
        

    }
    
}
