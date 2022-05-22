package model;

public class Document{
    private String number;
    private double price;
    private int year;
    private double coverAmount;
    private int gasLevel;
    private String image;
    
    /**
     * The method Document is the constructor of entire class
     * @param number Attribute the class
     * @param price Attribute the class
     * @param year Attribute the class
     * @param coverAmount Attribute the class
     * @param gasLevel Attribute the class
     * @param image Attribute the class
     */
    public Document(String number, double price, int year, double coverAmount, int gasLevel, String image) {
        this.number = number;
        this.price = price;
        this.year = year;
        this.coverAmount = coverAmount;
        this.gasLevel = gasLevel;
        this.image = image;
    }
    
    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return int return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return double return the coverAmount
     */
    public double getCoverAmount() {
        return coverAmount;
    }

    /**
     * @param coverAmount the coverAmount to set
     */
    public void setCoverAmount(double coverAmount) {
        this.coverAmount = coverAmount;
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
     * @return String return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return The Method toString is to display the class information.
    */   
    public String toString(){
        return "Number: "+number+"\n"+
                "Price: "+price+"\n"+
                "Year: "+year+"\n"+
                "Cover amount"+coverAmount+"\n"+
                "Gas Level"+gasLevel+"\n"+
                "Image: "+image+"\n";
    }
}