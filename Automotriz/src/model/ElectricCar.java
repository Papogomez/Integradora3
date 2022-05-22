package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ElectricCar extends Car implements BatteryConsumer{
    private double batteryDuration;
    private String chargeType;
    ArrayList<Document> documents;

    /**
     *  Objects the class ChargeType.
     */
    private ChargeType chargeTypeVehicle;
    
    /**
     *  The Car method is the constructor of the entire class
     * @param id parameter inherited from the abstract class car.
     * @param priceBase parameter inherited from the abstract class car.
     * @param mark parameter inherited from the abstract class car.
     * @param model parameter inherited from the abstract class car.
     * @param cylinder parameter inherited from the abstract class car.
     * @param mileager parameter inherited from the abstract class car.
     * @param numDoor parameter inherited from the abstract class car.
     * @param windowPolarized parameter inherited from the abstract class car.
     * @param batteryDuration Attribute the class.
     * @param licensePlate parameter inherited from the abstract class car.
     * @param state parameter inherited from the abstract class car.
     * @param typeCarsModel parameter inherited from the abstract class car.
     * @param typeCar parameter inherited from the abstract class car.
     * @param chargeType Attribute the class.
     * @param documents parameter inherited from the abstract class car.
     * @param typeVehicle parameter inherited from the abstract class car.
     * @param percentDiscount parameter inherited from the abstract class car.
     * @param status parameter inherited from the abstract class car.
     */
    public ElectricCar(int id, double priceBase, String mark, String model, double cylinder, double mileager,
                        String numDoor, String windowPolarized,double batteryDuration,String licensePlate, String state, 
                        String typeCarsModel,String typeCar,String chargeType, ArrayList<Document> documents, String typeVehicle, double percentDiscount, String status) {
        super(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar, typeVehicle, percentDiscount, status);
        this.batteryDuration = batteryDuration;
        this.chargeType = chargeType;
        this.documents = documents;
        
        chargeTypeVehicle = null;

        if(chargeType.equals("1")){
            chargeTypeVehicle = chargeTypeVehicle.Normal;
        }else if(chargeType.equals("2")){
            chargeTypeVehicle = chargeTypeVehicle.Fast;
        }
    }


    /**
     * The method is inherited the interface class BatteryConsumer
     */
    @Override
    public double calculateBatteryConsumer() {
       double total = 0;
        //Si el tipo de cargador es rápido: (duración batería + 13) * (cilindraje / 100)
        //Si el tipo de cargador es normal: (duración batería + 18) * (cilindraje / 100)

        if(chargeType.equals("1")){
            total= ((batteryDuration+ 18) * (super.getCylinder()/100));
        }else if(chargeType.equals("2")){
            total = ((batteryDuration+ 13)* (super.getCylinder()/100));
        }

        return total;
    }

    /**
     * @return double return the batteryDuration
     */
    public double getBatteryDuration() {
        return batteryDuration;
    }

    /**
     * @param batteryDuration the batteryDuration to set
     */
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    /**
     * @return String return the chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * @param chargeType the chargeType to set
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    /**
     * @return ChargeType return the chargeTypeVehicle
     */
    public ChargeType getChargeTypeVehicle() {
        return chargeTypeVehicle;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    /**
     * @param chargeTypeVehicle the chargeTypeVehicle to set
     */
    public void setChargeTypeVehicle(ChargeType chargeTypeVehicle) {
        this.chargeTypeVehicle = chargeTypeVehicle;
    }

    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        DecimalFormat df=new DecimalFormat("###,###.##");
        return  super.toString()+"\n"+ 
                "Battery duration .: "+batteryDuration+"\n"+
                "Consumer battery .: "+df.format(calculateBatteryConsumer())+"\n";
    
    }



}