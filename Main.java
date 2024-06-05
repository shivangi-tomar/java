import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number of subjects ");
        int numofsub=sc.nextInt();
        int totalmarks=0;
        for(int i=1;i<=numofsub;i++){
            System.out.println( "Here Enter the Marks of subject "+i+" out of 100 :");
            int marks=sc.nextInt();
            totalmarks+=marks;
        }
        double averagepercentage=(double)totalmarks/numofsub;
        
        char grade ;
        if(averagepercentage>=90){
            grade='A';
        } else if (averagepercentage>=80) {
            grade='B';
        } else if (averagepercentage>=70) {
            grade='C';
        } else if (averagepercentage>=60) {
            grade='D';
        }
        else {
            grade='F';
        }
        System.out.println("Here are Total Marks :"+totalmarks);
        System.out.println("Average percentage :"+averagepercentage);
        System.out.println("Your Grade is: "+grade);
        sc.close();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}