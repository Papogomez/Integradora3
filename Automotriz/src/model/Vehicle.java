package model;

import java.text.DecimalFormat;

public abstract class Vehicle{
    private int id;
    private double priceBase;
    private double salePrice;
    private String mark;
    private String model;
    private double cylinder;
    private double mileager;
    private String licensePlate;
    private String state;
    private String typeVehicle; // 1=Car , 2=MotorCycle
    private String typeVehicleName;
    private String typeCarName;
    private double percentDiscount;
    private String status;
    private String license;
    private String typeCar; // 1=Car in gas , 2=Car in hybrid, 3=Car is electric

    /**
     *  Objects the class StateVehicle.
     */
    private StateVehicle stateVehicle;

    /**
     * 
     * @param id Attribute the class.
     * @param priceBase Attribute the class.
     * @param mark Attribute the class.
     * @param model Attribute the class.
     * @param cylinder Attribute the class.
     * @param mileager Attribute the class.
     * @param licensePlate Attribute the class.
     * @param state Attribute the class.
     * @param typeVehicle Attribute the class.
     * @param typeCar Attribute the class.
     * @param percentDiscount Attribute the class.
     * @param status Attribute the class.
     */
    public Vehicle(int id, double priceBase, String mark, String model,double cylinder, double mileager, 
                   String licensePlate, String state, String typeVehicle, String typeCar, 
                   double percentDiscount, String status){
        this.id = id;
        this.priceBase = priceBase;
        this.salePrice = salePrice;
        this.mark = mark;
        this.model = model;
        this.cylinder = cylinder;
        this.mileager = mileager;
        this.licensePlate = licensePlate;
        this.state = state;
        this.typeVehicle = typeVehicle;
        this.typeCar = typeCar;
        this.percentDiscount = percentDiscount;
        this.status = status;

        stateVehicle = null;
        if(state.equals("1")){
            stateVehicle = stateVehicle.New;
        }else if(state.equals("2")){
            stateVehicle = stateVehicle.Used;
        }

        if (typeVehicle.equals("1")){
            typeVehicleName ="Car";
        } else if (typeVehicle.equals("2")){
            typeVehicleName ="MotorCycle";
        }

        if (typeCar.equals("1")){
            typeCarName ="Car in gas";
        } else if (typeCar.equals("2")){
            typeCarName ="Car in hybrid";
        }else if (typeCar.equals("3")){
            typeCarName ="Car is electric";
        }else{
            typeCarName ="Not apply";
        }

        if (licensePlate.equals("")){
            license = "Without assigning";
        } else{
            license = licensePlate;
        }
    }

    public void calculateSalePrice(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return double return the priceBase
     */
    public double getPriceBase() {
        return priceBase;
    }

    /**
     * @param priceBase the priceBase to set
     */
    public void setPriceBase(double priceBase) {
        this.priceBase = priceBase;
    }

    /**
     * @return double return the salePrice
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * @param salePrice the salePrice to set
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * @return String return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return double return the cylinder
     */
    public double getCylinder() {
        return cylinder;
    }

    /**
     * @param cylinder the cylinder to set
     */
    public void setCylinder(double cylinder) {
        this.cylinder = cylinder;
    }

    /**
     * @return double return the mileager
     */
    public double getMileager() {
        return mileager;
    }

    /**
     * @param mileager the mileager to set
     */
    public void setMileager(double mileager) {
        this.mileager = mileager;
    }

    /**
     * @return String return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    /**
     * @return String return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

   /**
     * @return String return the typeVehicle
     */
    public String getTypeVehicle() {
        return typeVehicle;
    }

    /**
     * @param typeVehicle the typeVehicle to set
     */
    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
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
     * @return String return the percentDiscount
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
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
  
    /**
     * @return The Method toString is to display the class information.
     */   
    public String toString(){
  
        String result="";
        String out="";
        String s="";
        DecimalFormat df=new DecimalFormat("###,###.##");

        if (state.equals("1")){
            result = "New";
        } else if(state.equals("2")){
            result = "Used";
        }

        if (status.equals("0")){ 
            s = "For sale";
        } else if(status.equals("1")){
            s = "Sold out";
        }

        out = "Id ...............: "+id+"\n"+
              "Type Vehicle .....: "+typeVehicleName+"\n"+
              "Type car .........: "+typeCarName+"\n"+
              "Price base .......: "+df.format(priceBase)+"\n"+
              "Sale price .......: "+df.format(salePrice)+"\n"+  
              "Mark .............: "+mark+"\n"+
              "Model ............: "+model+"\n"+
              "Cylinder .........: "+cylinder+"\n"+
              "Mileager .........: "+mileager+"\n"+
              "License plate ....: "+license+"\n"+
              "State ............: "+result+"\n"+
              "Percent discount .: "+percentDiscount+"\n"+
              "Status ...........: "+s+"\n";

        return out;
    }

}