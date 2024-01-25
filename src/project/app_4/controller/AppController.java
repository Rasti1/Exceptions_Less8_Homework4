package project.app_4.controller;

import project.app_4.view.AppView;

public class AppController {

    AppView view = new AppView();

    public void checkTemperature(){

        AppView.getOutput();

        try {
            int temperature = view.getTemperature();
            if (temperature < -10 || temperature > 35) {
                throw new TemperatureOutOfRangeException("\nThe device cannot operate outside " +
                        "the temperature range (-10 to +35).");
            } else if (temperature <= 10){
                System.out.println("It's cold outside. Dress warmly.");
            } else if (temperature <= 17){
                System.out.println("Dress lightly.");
            } else {
                System.out.println("It's hot outside. Dress appropriately. ");
            }
        } catch (TemperatureOutOfRangeException e) {
            System.out.println("\nTemperature Error: " + e);
        }
    }

    public static class TemperatureOutOfRangeException extends Exception {
        public TemperatureOutOfRangeException(String message) {
            super(message);
        }
    }
}

