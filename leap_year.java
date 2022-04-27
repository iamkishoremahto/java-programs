import java.util.*;
public class leap_year {

    public static boolean leap_y(int year){
        int y=year;
        if(y%4==0 && y%100 == 0 && y%400 ==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year=sc.nextInt();
        if(leap_y(year)){
            System.out.println(year+" Leap Year ");
        }
        else
        {
            System.out.println(year +" is not a leap year");
        }
    }
     
    

    
}
