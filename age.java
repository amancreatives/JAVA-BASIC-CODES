import java.util.Scanner;

public class age {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("ELIGIBLE FOR VOTING");
        } else {
            System.out.println("NOT ELIGIBLE FOR VOTING");
        }
    }
}
