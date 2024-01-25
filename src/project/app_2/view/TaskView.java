package project.app_2.view;

import java.util.Scanner;

public class TaskView {

    public static double[] dayPrice = new double[5];
    public static Scanner sc = new Scanner (System.in);

    public static void getDay(){

        int counter = 0;
        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday"};
        System.out.println("Enter prices for each day:");
        for (String day : days){
            counter++;
            System.out.print(counter + ") " + day + ": ");
            dayPrice[counter - 1] = sc.nextDouble();

        }
    }
}
