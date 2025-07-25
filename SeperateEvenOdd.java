//WAP to seperate even and odd no.of array

public class SeperateEvenOdd {
    public static void main(String[] args) {
        int a[]={12,3,6,7,8,9,0,33};
        int even[]=new int[a.length];  //creates a array to store even numbers
        int odd[]=new int[a.length];   //creates a array to store odd numbers
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){                  //checks the number is even or odd
                System.out.println("Even"+ a[i]);
                even[i]=a[i];
            }
            else{
                System.out.println("Odd"+ a[i]);
                odd[i]=a[i];
            }
        }
        System.out.println("Even");            //stores even value
        for(int i=0;i<even.length;i++){
            if(even[i]>0)        //to remove zero from list
            System.out.println(even[i]);
        }
        System.out.println("Odd Number");      //stores odd value
        for(int i=0;i<odd.length;i++){
            if(odd[i]>0)           //to remove zero from list 
            System.out.println(odd[i]);
        }
    }
    
}
