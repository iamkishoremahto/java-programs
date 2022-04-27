import java.util.*;
public class leap_yr_range {
  

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
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter Start year : ");
            int start_y=sc.nextInt();
            System.out.println("\nEnter End year : ");
            int end_y=sc.nextInt();
            int year=start_y;
            for(int i=1;i<=end_y;i++){
                if(leap_y(year)){
                    System.out.println(year);
                    
            }
            year++;
                }

        
        }
    }
    

