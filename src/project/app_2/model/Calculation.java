package project.app_2.model;

import project.app_2.view.TaskView;

public class Calculation {


    public static void getResult (){

        double sum = 0;
        for (double price : TaskView.dayPrice) {
            sum += price;
        }
        System.out.println("Total price during five days: " + sum);

    }
}
