package project.app_2.utils;

import java.util.InputMismatchException;

import project.app_2.model.Calculation;
import project.app_2.view.TaskView;

public class Exception {
    public void checkException() {

        try {
                TaskView.getDay();
                Calculation.getResult();
        } catch (InputMismatchException e) {
                System.out.println("Incorrect price value! Please, try again.\n" + e);
        }
    }
}
