package model;

public class Car extends Vehicle{
    private String numDoor;
    private String windowPolarized;
    private String typeCarsModel;
    private String typeCar;
    private double percentDiscount;
    
    /**
     *  Objects the class TypeCarModel.
     */
    private TypeCarModel typeCarModel;
    
    /**
     *  Objects the class StateVehicle.
     */
    private StateVehicle stateVehicle;


  /**
   * The method Car is the constructor entired the class
   * @param id parameter inherited from the abstract class Vehicle.
   * @param priceBase parameter inherited from the abstract class Vehicle.
   * @param mark parameter inherited from the abstract class Vehicle.
   * @param model parameter inherited from the abstract class Vehicle.
   * @param cylinder parameter inherited from the abstract class Vehicle.
   * @param mileager parameter inherited from the abstract class Vehicle.
   * @param numDoor Attribute the class.
   * @param windowPolarized Attribute the class.
   * @param licensePlate Attribute the class.
   * @param state Attribute the class.
   * @param typeCarsModel Attribute the class.
   * @param typeCar Attribute the class.
   * @param typeVehicle Attribute the class.
   * @param percentDiscount Attribute the class.
   * @param status parameter inherited from the abstract class Vehicle.
   */
    public Car(int id, double priceBase, String mark, String model, double cylinder, 
                double mileager,String numDoor, String windowPolarized,String licensePlate, String state,String typeCarsModel,String typeCar, String typeVehicle, double percentDiscount, String status) {
        super(id, priceBase, mark, model, cylinder, mileager, licensePlate, state, typeVehicle, typeCar, percentDiscount, status);
        this.numDoor = numDoor;
        this.windowPolarized = windowPolarized;
        this.typeCarsModel = typeCarsModel;
        this.typeCar = typeCar;
        this.percentDiscount = percentDiscount;
        
        typeCarModel=null;
        if(typeCarsModel.equals("1")){
            typeCarModel=typeCarModel.Sedan;
        }else if(typeCarsModel.equals("2")){
            typeCarModel = typeCarModel.PickupTruck;
        }

        stateVehicle=null;
        if(state.equals("1")){
            stateVehicle= stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }
    }

    /**
     * @return String return the numDoor
     */
    public String getNumDoor() {
        return numDoor;
    }

    /**
     * @param numDoor the numDoor to set
     */
    public void setNumDoor(String numDoor) {
        this.numDoor = numDoor;
    }

    /**
     * @return String return the windowPolarized
     */
    public String getWindowPolarized() {
        return windowPolarized;
    }

    /**
     * @param windowPolarized the windowPolarized to set
     */
    public void setWindowPolarized(String windowPolarized) {
        this.windowPolarized = windowPolarized;
    }

    /**
     * @return String return the typeCarsModel
     */
    public String getTypeCarsModel() {
        return typeCarsModel;
    }

    /**
     * @param typeCarsModel the typeCarsModel to set
     */
    public void setTypeCarsModel(String typeCarsModel) {
        this.typeCarsModel = typeCarsModel;
    }

    /**
     * @return String return the typeCar
     */
    public String getTypeCar() {
        return typeCar;
    }

    /**
     * @param typeCar the typeCar to set
     */
    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    /**
     * @return double return the percentDiscount
     */
    public double getPercentDiscount() {
        return percentDiscount;
    }

    /**
     * @param percentDiscount the percentDiscount to set
     */
    public void setPercentDiscount(double percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    /**
     * @return TypeCarModel return the typeCarModel
     */
    public TypeCarModel getTypeCarModel() {
        return typeCarModel;
    }

    /**
     * @param typeCarModel the typeCarModel to set
     */
    public void setTypeCarModel(TypeCarModel typeCarModel) {
        this.typeCarModel = typeCarModel;
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
     * @return The Method toString is to display the class information.
    */    
    public String toString(){
        String result="No";
        if (windowPolarized.equals("1")){
            result = "Yes";
        }
        return super.toString()+
               "Num door .........: "+numDoor+"\n"+
               "Window polarized .: "+result+"\n"+
               "Type model car ...: "+ typeCarModel;
    }

}
