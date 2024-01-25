package project.app_3.view;

import java.util.Scanner;

public class TaskView {
    public static final Scanner sc = new Scanner (System.in);
    public static void getOutput(){
        System.out.println("Welcome in our shop."
                + "Insert the cart into the terminal.");
    }
    public static int getSum(){
        System.out.print("\nInput total price from your check: ");
        return sc.nextInt();
    }
}
