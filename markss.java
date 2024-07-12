import java.util.*;
public class markss {
    public static void main(String args []){
         Scanner  sc = new Scanner(System.in);
         int input;

         do {
            int marks = sc.nextInt();
            if(marks >= 90 && marks <= 100) {
                System.out.println("THIS IS GOOD");
            } else if (marks >=60 && marks <=89) {
                System.out.println("THIS IS ALSO GOOD");
            } else if (marks >=0 && marks <=59){
                System.out.println("THIS IS GOOD AS WELL");
            }  else {
                System.out.println("INVALID");
            }
            
            System.out.println("WANT TO CONTINUE ? (yes (1) or no(0))");
            input = sc.nextInt();
        } while(input == 1);
    }
}       