import java.util.*;
public class armstrong_function{
    public static boolean isarmstrong(int num){
        int temp=num,pow=0,sum=0;
        int temp1=num;

        // Calculating number of digits

        while(temp>0){
            pow++;
            temp=temp/10;
        }

        // finding is armstrong or not

        while(temp1>0){
            int position=temp1%10;
            sum+=Math.pow(position,pow);
            temp1=temp1/10;
        }

        if(sum==num){
            return true;
        }
        else{
            return false;
        }

    }

        // Main method
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if(isarmstrong(num)){
            System.out.println(num+" is armstrong number.");
        }
        else{
            System.out.println(num+" is not a armstrong number. ");
        }
    }
}