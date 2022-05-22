package model;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class GassCar extends Car implements GasConsumer{
    private double capacityTank;
    private String gasType;
    ArrayList<Document> documents;

    /**
     *  Objects the class GasType.
     */
    private GasType gasTypeVehicle;

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
     * @param capacityTank Attribute the class.
     * @param licensePlate parameter inherited from the abstract class car.
     * @param state parameter inherited from the abstract class car.
     * @param typeCarsModel parameter inherited from the abstract class car.
     * @param typeCar parameter inherited from the abstract class car.
     * @param gasType Attribute the class.
     * @param documents parameter inherited from the abstract class car.
     * @param typeVehicle parameter inherited from the abstract class car.
     * @param percentDiscount parameter inherited from the abstract class car.
     * @param status parameter inherited from the abstract class car.
     */
    public GassCar(int id, double priceBase, String mark, String model, double cylinder, 
                    double mileager,String numDoor, String windowPolarized,double capacityTank,String licensePlate, 
                    String state,String typeCarsModel,String typeCar,String gasType, ArrayList<Document> documents, String typeVehicle, double percentDiscount, String status) {
        super(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, licensePlate, state, typeCarsModel, typeCar, typeVehicle, percentDiscount, status);
        this.capacityTank = capacityTank;
        this.gasType = gasType;
        this.documents = documents;
        
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
        //Para autos a gasolina: capacidad del tanque * (cilindraje / 150)  
        total= capacityTank*(super.getCylinder()/150);
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

    
    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }
    
    /**
     * @param gasTypeVehicle the gasTypeVehicle to set
     */
    public void setGasTypeVehicle(GasType gasTypeVehicle) {
        this.gasTypeVehicle = gasTypeVehicle;
    }
    
    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        DecimalFormat df=new DecimalFormat("###,###.##");

        String result="";
        if (gasType.equals("1")){
            result = "Extra";
        } else if(gasType.equals("2")){
            result = "Current";
        }else if(gasType.equals("3")){
            result = "Diesel";
        }

        return  super.toString()+
                "\nCapacity tank ....: "+capacityTank+"\n"+
                "Consumer gasoline : "+df.format(calculateGasConsumer())+"\n"+
                "Gasoline type ....: "+result+"\n";
    
    }
}