import java.util.Stack;
import java.util.Scanner;

public class InBuiltStack {
    
    public static void main(String[] args) {
        Stack<Integer> Std_data = new Stack<>();
        
        Std_data.push(10);
        Std_data.push(20);
        Std_data.push(30);
        Std_data.push(40);
        Std_data.push(50);


        Std_data.pop();
        Std_data.pop();
        Std_data.pop();
        Std_data.pop();
        Std_data.pop();

        // System.out.println("This is error if you pop of empty stack");

        // Std_data.pop();

        int choice = 0;

        System.out.println("Choose 1 if you want to see the error");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choise :");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                Std_data.pop();
                break;
            
            case 2:
                System.out.println("Exit");
                break;

            default:
                break;
        }

        sc.close();

    }

}
