import java.util.*;
public class calc {
    public static void main(String args []){
       
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("ENTER 1 FOR ADDITION");
        System.out.println("ENTER 2 FOR SUBTRACTION");
        System.out.println("ENTER 3 FOR MULTIPLICATION");
        System.out.println("ENTER 4 FOR DIVISION");
        
        int op = sc.nextInt();
        
        
        
        switch(op){
            case 1 : System.out.println(a+b);
            break;

            case 2 : System.out.println(a-b);
            break;

            case 3 : System.out.println(a * b);
            break;

            case 4 : if (b == 0){
                System.out.println("NUMBER CANNOT BE DIVIDED BY 0");
            } else {
                System.out.println(a/b);
            break;
            
            
            }
        }
    }
}   