package model;

public class Soat extends Document{
    private double coverPrice;

    /**
     * The Method MechanicalTechnique is the constructor entire the class
     * @param number parameter inherited from the abstract class documents.
     * @param price parameter inherited from the abstract class documents.
     * @param year parameter inherited from the abstract class documents.
     * @param coverAmount parameter inherited from the abstract class documents.
     * @param image parameter inherited from the abstract class documents.
     * @param gasLevel parameter inherited from the abstract class documents.
     * @param coverProce Attribute the class.
     */
    public Soat(String number, double price, int year, double coverAmount, String image, int gasLevel) {
        super(number, price, year, coverAmount, gasLevel, image);
        this.coverPrice = coverAmount;
    }

    /**
     * @return double return the coverPrice
     */
    public double getCoverPrice() {
        return coverPrice;
    }

    /**
     * @param coverPrice the coverPrice to set
     */
    public void setCoverPrice(double coverPrice) {
        this.coverPrice = coverPrice;
    }

    /**
     * @return The Method toString is to display the class information.
     */   
    public String toString(){
        return super.toString()+
                "Cove price: "+coverPrice+"\n";
    }
}