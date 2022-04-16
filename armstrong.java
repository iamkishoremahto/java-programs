import java.util.*;

public class armstrong {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number : ");
    int num = sc.nextInt();
    int pow=0;
    int temp=num;
    int sum=0;
    while(temp>0){
        
            pow++;
            temp=temp/10;

        
    }

    int temp1=num;
    while(temp1>0){
        int t=temp1%10;
        sum+=Math.pow(t,pow);
        temp1=temp1/10;
    }
    if(num==sum){
        System.out.println(num + " is an armstrong number");
    }
    else
    {
        System.out.println(num + " is not an armstrong number");
    }
    
    }
}
