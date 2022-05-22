package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MotoCycle extends Vehicle implements GasConsumer{
    private double capacityGasoline;
    private String typeMotorcycle;
    private String gasType;
    ArrayList<Document> documents;

    /**
     *  Objects the class TypeMotocycle.
     */
    private TypeMotocycle typeMotocycle;

    /**
     *  Objects the class StateVehicle.
     */
    private StateVehicle stateVehicle;

    /**
     *  Objects the class GasType.
     */
    private GasType gasTypeVehicle;

  /**
   * The MotoCycle method is the constructor of the entire class
   * @param id parameter inherited from the abstract class Vehicle.
   * @param priceBase parameter inherited from the abstract class Vehicle.
   * @param mark parameter inherited from the abstract class Vehicle.
   * @param model parameter inherited from the abstract class Vehicle.
   * @param cylinder parameter inherited from the abstract class Vehicle.
   * @param mileager parameter inherited from the abstract class Vehicle.
   * @param capacityGasoline Attribute the class.
   * @param licensePlate Attribute the class.
   * @param state Attribute the class.
   * @param typeMotorcycle Attribute the class.
   * @param gasType Attribute the class.
   * @param documents Attribute the class.
   * @param typeVehicle parameter inherited from the abstract class Vehicle.
   * @param typeCar parameter inherited from the abstract class Vehicle.
   * @param percentDiscount parameter inherited from the abstract class Vehicle.
   * @param status parameter inherited from the abstract class Vehicle.
   */
    public MotoCycle(int id, double priceBase, String mark, String model, double cylinder, 
                    double mileager,double capacityGasoline,String licensePlate, String state, 
                    String typeMotorcycle,String gasType, ArrayList<Document> documents, String typeVehicle, String typeCar, double percentDiscount, String status) {
        super(id, priceBase, mark, model, cylinder, mileager, licensePlate, state, typeVehicle, typeCar, percentDiscount, status);
        this.capacityGasoline = capacityGasoline;
        this.typeMotorcycle = typeMotorcycle;
        this.gasType = gasType;
        this.documents = documents;

        stateVehicle=null;
        if(state.equals("1")){
            stateVehicle = stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }


        typeMotocycle= null;

        if(typeMotorcycle.equals("1")){
            typeMotocycle = typeMotocycle.Cross;
        }else if(typeMotorcycle.equals("2")){
            typeMotocycle = typeMotocycle.Scooter;
        }else if(typeMotorcycle.equals("3")){
            typeMotocycle = typeMotocycle.Sporty;
        }else if(typeMotorcycle.equals("4")){
            typeMotocycle = typeMotocycle.Standard;
        }

        gasTypeVehicle = null;

        if(gasType.equals("1")){
            gasTypeVehicle=gasTypeVehicle.Extra;
        }else if(gasType.equals("2")){
            gasTypeVehicle=gasTypeVehicle.Current;
        }else if(gasType.equals("3")){
            gasTypeVehicle= gasTypeVehicle.Diesel;
        }
    }

    /**
     * The method is inherited the interface class GasConsumer
     */
    @Override
    public double calculateGasConsumer() {
        double total = 0;
        // Para motocicletas: capacidad del tanque * (cilindraje / 75)
        total= capacityGasoline*(super.getCylinder()/75);
        return total;
    }


    /**
     * @return double return the capacityGasoline
     */
    public double getCapacityGasoline() {
        return capacityGasoline;
    }

    /**
     * @param capacityGasoline the capacityGasoline to set
     */
    public void setCapacityGasoline(double capacityGasoline) {
        this.capacityGasoline = capacityGasoline;
    }

    /**
     * @return String return the typeMotorcycle
     */
    public String getTypeMotorcycle() {
        return typeMotorcycle;
    }

    /**
     * @param typeMotorcycle the typeMotorcycle to set
     */
    public void setTypeMotorcycle(String typeMotorcycle) {
        this.typeMotorcycle = typeMotorcycle;
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
     * @return TypeMotocycle return the typeMotocycle
     */
    public TypeMotocycle getTypeMotocycle() {
        return typeMotocycle;
    }

    /**
     * @param typeMotocycle the typeMotocycle to set
     */
    public void setTypeMotocycle(TypeMotocycle typeMotocycle) {
        this.typeMotocycle = typeMotocycle;
    }

    /**
     * @return StateVehicle return the stateVehicle
     */
    public StateVehicle getStateVehicle() {
        return stateVehicle;
    }

    /**
     * @param stateVehicle the stateVehicle to set
     */
    public void setStateVehicle(StateVehicle stateVehicle) {
        this.stateVehicle = stateVehicle;
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

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        DecimalFormat df=new DecimalFormat("###,###.##");
        return super.toString()+
               "Capacity gasoline : "+capacityGasoline+"\n"+
               "Consumer gasoline : "+df.format(calculateGasConsumer())+"\n"+
               "Type motocycle ...: "+ typeMotorcycle+ "\n"+
               "Gasoline type ....: "+gasType+"\n";
    }
}

