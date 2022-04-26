import java.util.*;
public class simple_calculator {

    static Scanner sc=new Scanner(System.in);

    
    
        static int a(){
            System.out.println("Enter the value of a : ");
            int a=sc.nextInt();
            return a;
        }

        static int b(){
            System.out.println("Enter the value of a : ");
            int b=sc.nextInt();
            return b;
        }
        
      

    

    public static void main(String args[]){
        int a=0,b=0,result;
        
        
        System.out.println("1 Add two number");
        System.out.println("2 Multiply two number");
        System.out.println("3 Substract two number");
        System.out.println("4 Divide two number");
        System.out.println("\n\nEnter your choice : ");
        int choice=sc.nextInt();

        switch(choice){
            case 1:
                    
                    a=a();
                    b=b();
                    
                    System.out.println("Ans : "+ (result=a+b));
                    break;
            case 2:
                    a=a();
                    b=b();
                    
                    System.out.println("Ans : "+ (result=a*b));
                    break;
            case 3:
                    a=a();
                    b=b();
                    
                    System.out.println("Ans : "+ (result=a-b));
                    break;

            case 4:
                    a=a();
                    b=b();
                    
                    System.out.println("Ans : "+ (result=a/b));
                    break;
            default :
                    System.out.println("Invalid Choice");
        }

        
    }
    
}
