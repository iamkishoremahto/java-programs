import java.util.*;
public class percentage_to_cgpa {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        float eng,math,hindi,sci,comp,history;
        System.out.println("Please enter the marks out of 100 .");
        System.out.print("\nEnglish : ");
        eng= sc.nextInt();
        System.out.print("\nMath : ");
        math= sc.nextInt();
        System.out.print("\nHindi : ");
        hindi= sc.nextInt();
        System.out.print("\nScience : ");
        sci= sc.nextInt();
        System.out.print("\nComputer : ");
        comp= sc.nextInt();
        System.out.print("\nHistory : ");
        history= sc.nextInt();

        float total_marks=eng+math+hindi+sci+comp+history;

        float percentage= ((total_marks/600)*100);

        double cgpa= percentage/9.5;

        System.out.println("\nTotal Obtains Marks out of 600 : "+total_marks);
        System.out.println("\nPercentage : "+percentage+" %");
        System.out.println("\nCGPA : "+cgpa);
        
    }
    
}
