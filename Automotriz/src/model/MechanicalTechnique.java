package model;

public class MechanicalTechnique extends Document {
    private int gasLevel;

    /**
     * The Method MechanicalTechnique is the constructor entire the class
     * @param number parameter inherited from the abstract class documents.
     * @param price parameter inherited from the abstract class documents.
     * @param year parameter inherited from the abstract class documents.
     * @param coverAmount parameter inherited from the abstract class documents.
     * @param image parameter inherited from the abstract class documents.
     * @param gasLevel Attribute the class.
     */
    public MechanicalTechnique(String number, double price, int year, double coverAmount, String image,int gasLevel) {
        super(number, price, year, coverAmount, gasLevel, image);
        this.gasLevel = gasLevel;
    }

    /**
     * @return int return the gasLevel
     */
    public int getGasLevel() {
        return gasLevel;
    }

    /**
     * @param gasLevel the gasLevel to set
     */
    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        return super.toString()+
                "Level gas: "+gasLevel+"\n";
    }

    

}