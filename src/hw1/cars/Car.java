package hw1.cars;

public class Car {
	private void startElectricity(){
        System.out.println("Electricity started");
    }

    private void startCommand(){
        System.out.println("Command started");
    }

    private void startFuelSystem(){
        System.out.println("FuelSystem started");
    }


    public void run(){
        this.startElectricity();
        this.startFuelSystem();
        this.startCommand();
    }
}
