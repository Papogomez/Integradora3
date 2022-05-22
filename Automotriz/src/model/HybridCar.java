package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class HybridCar extends Car implements GasConsumer{
    private double capacityTank;
    private double batteryDuration;
    private String chargeType;
    private String gasType;
    ArrayList<Document> documents;

    /**
     *  Objects the class GasType.
     */
    private GasType gasTypeVehicle;

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
     * @param gasType Attribute the class.
     * @param capacityTank Attribute the class.
     * @param documents  Attribute the class.
     * @param typeVehicle parameter inherited from the abstract class car.
     * @param percentDiscount parameter inherited from the abstract class car.
     * @param status parameter inherited from the abstract class car.
     */
    public HybridCar(int id, double priceBase, String mark, String model, double cylinder, double mileager,
                    String numDoor, String windowPolarized,double capacityTank,double batteryDuration,
                    String licensePlate, String state,String typeCarsModel,String typeCar,String chargeType,
                    String gasType, ArrayList<Document> documents, String typeVehicle, double percentDiscount, String status) {
        super(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar, typeVehicle, percentDiscount, status);
        this.capacityTank = capacityTank;
        this.batteryDuration = batteryDuration;                
        this.chargeType = chargeType;
        this.documents = documents;
        this.gasType = gasType;
        
        gasTypeVehicle = null;

        if(gasType.equals("1")){
            gasTypeVehicle=gasTypeVehicle.Extra;
        }else if(gasType.equals("2")){
            gasTypeVehicle=gasTypeVehicle.Current;
        }else if(gasType.equals("3")){
            gasTypeVehicle= gasTypeVehicle.Diesel;
        }

        chargeTypeVehicle = null;
        
        if(chargeType.equals("1")){
            chargeTypeVehicle = chargeTypeVehicle.Normal;
        }else if(chargeType.equals("2")){
            chargeTypeVehicle = chargeTypeVehicle.Fast;
        }
    }

    /**
     * The method is inherited the interface class GasConsumer
     */
    @Override
    public double calculateGasConsumer() {
        //Para autos híbridos: capacidad del tanque * (cilindraje / 180
        double total = 0;

        total = capacityTank * (super.getCylinder()/180);
        return total;
    }

    /**
     * The method is inherited the interface class BatteryConsumer
     */
    public double calculateBatteryConsumer(){
        double total=0;
        // Si el tipo de cargador es rápido: duración batería * (cilindraje / 200)
        // Si el tipo de cargador es normal: (duración batería + 7) * (cilindraje / 200) 

        if(chargeType.equals("1")){ // 1=Normal
            total=((batteryDuration+7)*(super.getCylinder()/200));
        }else if(chargeType.equals("2")){ // 2=Fast
            total=batteryDuration*(super.getCylinder()/200);
        }

        return total;
    }


    /**
     * @return double return the capacityTank
     */
    public double getCapacityTank() {
        return capacityTank;
    }

    /**
     * @param capacityTank the capacityTank to set
     */
    public void setCapacityTank(double capacityTank) {
        this.capacityTank = capacityTank;
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
     * @return String return the gasType
     */
    public String getGasType() {
        return gasType;
    }

    /**
     * @param gasType the gasType to set
     */
    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    /**
     * @return GasType return the gasTypeVehicle
     */
    public GasType getGasTypeVehicle() {
        return gasTypeVehicle;
    }

    /**
     * @param gasTypeVehicle the gasTypeVehicle to set
     */
    public void setGasTypeVehicle(GasType gasTypeVehicle) {
        this.gasTypeVehicle = gasTypeVehicle;
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

    public String toString(){
        DecimalFormat df=new DecimalFormat("###,###.##");
        return super.toString()+"\nCapacity tank ....: "+ capacityTank+"\n"+
                                "Consumer battery .: "+df.format(calculateBatteryConsumer()) +"\n"+
                                "Duration battery .: "+batteryDuration+"\n"+
                                "Gasoline type ....: "+gasTypeVehicle+"\n"+
                                "Consumer gasoline : "+df.format(calculateGasConsumer())+"\n"+
                                "Charger type .....: "+ chargeTypeVehicle+"\n";
    }
}
