package project.app_1;

import java.util.Scanner;

public class Task_1 {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

        checkException();

    }
    private static String getData(){
        System.out.print("Input a number: ");
        return sc.nextLine();
    }

    private static void checkException(){
        try{
            String input = getData();
            int number = Integer.parseInt(input);
            System.out.println("Your number: " + number);

        } catch (NumberFormatException e){
            System.out.println("Incorrect type of data!\n" + e);
        }
    }
}
