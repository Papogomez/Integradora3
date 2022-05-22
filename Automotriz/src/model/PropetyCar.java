package model;

public class PropetyCar extends Document {
    /**
     * The Method MechanicalTechnique is the constructor entire the class
     * @param number parameter inherited from the abstract class documents.
     * @param price parameter inherited from the abstract class documents.
     * @param year parameter inherited from the abstract class documents.
     * @param coverAmount parameter inherited from the abstract class documents.
     * @param image parameter inherited from the abstract class documents.
     */
    public PropetyCar(String number, double price, int year, double coverAmount, int gasLevel, String image) {
        super(number, price, year, coverAmount, gasLevel, image);
    }

    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        return super.toString();
    }
}