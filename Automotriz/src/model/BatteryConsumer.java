package model;

public interface BatteryConsumer{
    /*
     This method will be inherited by the classes that need it and it is used to calculate the battery consumption
    */
    public double calculateBatteryConsumer();
}