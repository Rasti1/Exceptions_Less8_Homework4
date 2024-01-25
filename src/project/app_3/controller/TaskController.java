package project.app_3.controller;

import project.app_3.view.TaskView;


public class TaskController {
    TaskView view = new TaskView();

    public void checkData() {
        TaskView.getOutput();
        try {
            if (view.getSum() < 2500) {
                System.out.println("Thanks for the purchase! Come again, we're waiting!");
            } else {
                throw new IllegalArgumentException("\nLooks like there is not enough money on your card." +
                        " Sorry.");
            }
        } catch(IllegalArgumentException e){
            System.out.println("\nCause of error: " + e);
        }
        TaskView.sc.close();
    }
}
