package model;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class ControlParking{
    private ArrayList<Vehicle> vehicles;
	private ArrayList<Document> documents;
	private Vehicle parking[][];
    
	/**
	 * The method ControlParking
	 */
	public ControlParking() {
        vehicles = new ArrayList<Vehicle>();
		documents = new ArrayList<Document>();
		parking = new Vehicle[10][5];
    }
    

	/**
	 * The method findVehicle it is to find a vehicle within the arraylist 
	 * @param LicensePlate parameter from find the licensePlate the vehicle
	 * @return indexVehicle is the vehicle is found in the arraylist
	 */
    public int findVehicle(String LicensePlate){
		boolean flagVehicle= false;
		int indexVehicle=-1;
		
		for(int i=0; i< vehicles.size() && !flagVehicle; i++){
			if(vehicles.get(i) instanceof Vehicle){
				if(vehicles.get(i)!=null && ((Vehicle)vehicles.get(i)).getLicensePlate().equals(LicensePlate)){
					flagVehicle=true;
					indexVehicle = i;
				}
			}
		}
		return indexVehicle;
	}

	/**
	 * The method findVehicle it is to find a vehicle within the arraylist 
	 * @param id parameter from find the id the vehicle
	 * @return indexVehicle is the vehicle is found in the arraylist
	 */
    public int findVehicle(int id){
		boolean flagVehicle= false;
		int indexVehicle=-1;
		for(int i=0; i< vehicles.size() && !flagVehicle; i++){
			if(vehicles.get(i) instanceof Vehicle){
				if(vehicles.get(i)!=null && ((Vehicle)vehicles.get(i)).getId() == id){
					flagVehicle=true;
					indexVehicle = i;
				}
			}
		}
		return indexVehicle;
	}

	/**
	 * The method findVehicle it is to find a vehicle within the class vehicle
	 * @param id parameter from find the id the vehicle
	 * @return v is the vehicle is found in the arraylist
	 */
	public Vehicle findVehicleId(int id){
		boolean flagVehicle= false;
		Vehicle v=null;

		for(int i=0; i< vehicles.size() && !flagVehicle; i++){
			if(vehicles.get(i) instanceof Vehicle){
				if(vehicles.get(i)!=null && ((Vehicle)vehicles.get(i)).getId() == id){
					flagVehicle=true;
					v = vehicles.get(i);
				}
			}
		}
		return v;
	}

	/**
	 * The method findVehicleParking it is to find a vehicle within the class vehicle
	 * @param id parameter from find the id the vehicle
	 * @return v is the vehicle parking in the matrix
	 */
    public Vehicle findVehicleParking(int id){
		boolean flagVehicle= false;
		Vehicle v=null;

		for(int i=0; i<10 && !flagVehicle; i++){
			for(int j=0; j<5; j++){
				if (parking[i][j] != null && parking[i][j].getId() == id){
					flagVehicle=true;
					v = parking[i][j];
				}
			}
		}

		return v;
	}

	/**
	 * The method addCarElectric is to add a new electric car in the arraylist the vehicles
	 * @param id parameter the method constructor the class ElectricCar.
	 * @param priceBase parameter the method constructor the class ElectricCar.
	 * @param mark parameter the method constructor the class ElectricCar.
	 * @param model parameter the method constructor the class ElectricCar.
	 * @param cylinder parameter the method constructor the class ElectricCar.
	 * @param mileager parameter the method constructor the class ElectricCar.
	 * @param numDoor parameter the method constructor the class ElectricCar.
	 * @param windowPolarized parameter the method constructor the class ElectricCar.
	 * @param batteryDuration parameter the method constructor the class ElectricCar.
	 * @param licensePlate parameter the method constructor the class ElectricCar.
	 * @param state parameter the method constructor the class ElectricCar.
	 * @param typeCarsModel parameter the method constructor the class ElectricCar.
	 * @param typeCar parameter the method constructor the class ElectricCar.
	 * @param chargeType parameter the method constructor the class ElectricCar.
	 * @param documents parameter the method constructor the class ElectricCar.
	 * @param typeVehicle parameter the method constructor the class ElectricCar.
	 * @param percentDiscount parameter the method constructor the class ElectricCar.
	 * @param status parameter the method constructor the class ElectricCar.
	 */
	public void addCarElectric(int id, double priceBase, String mark, String model, double cylinder, double mileager,
		String numDoor, String windowPolarized,double batteryDuration,String licensePlate, String state, 
		String typeCarsModel,String typeCar,String chargeType, ArrayList<Document> documents, String typeVehicle, double percentDiscount, String status){
	
		int year=0;
		if (!model.isEmpty() && model != null){
			year = Integer.valueOf(model);
		}
			
		ElectricCar ec = new ElectricCar(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargeType, documents, typeVehicle, percentDiscount, status);
		vehicles.add(ec);

	}

	/**
	 * The method addCarGas is to add a new electric car in the arraylist the vehicles
	 * @param id parameter the method constructor the class GassCar.
	 * @param priceBase parameter the method constructor the class GassCar.
	 * @param mark parameter the method constructor the class GassCar.
	 * @param model parameter the method constructor the class GassCar.
	 * @param cylinder parameter the method constructor the class GassCar.
	 * @param mileager parameter the method constructor the class GassCar.
	 * @param numDoor parameter the method constructor the class GassCar.
	 * @param windowPolarized parameter the method constructor the class GassCar.
	 * @param capacityTank parameter the method constructor the class GassCar.
	 * @param licensePlate parameter the method constructor the class GassCar.
	 * @param state parameter the method constructor the class GassCar.
	 * @param typeCarsModel parameter the method constructor the class GassCar.
	 * @param typeCar parameter the method constructor the class GassCar.
	 * @param gasType parameter the method constructor the class GassCar.
	 * @param documents parameter the method constructor the class GassCar.
	 * @param typeVehicle parameter the method constructor the class GassCar.
	 * @param percentDiscount parameter the method constructor the class GassCar.
	 * @param status parameter the method constructor the class GassCar.
	 */
	public void addCarGas(int id, double priceBase, String mark, String model, double cylinder, 
		double mileager,String numDoor, String windowPolarized,double capacityTank,String licensePlate, 
		String state,String typeCarsModel,String typeCar,String gasType, ArrayList<Document> documents, 
		String typeVehicle, double percentDiscount, String status){

		int y=0;
		if (!model.isEmpty() && model != null){
			y = Integer.valueOf(model);
		}			

		GassCar gc = new GassCar(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, licensePlate, state, typeCarsModel, typeCar,gasType, documents, typeVehicle, percentDiscount, status);
		vehicles.add(gc);
		
	}

	/**
	 * The method addCarHybrid is to add a new electric car in the arraylist the vehicles,
	 * @param id parameter the method constructor the class HybridCar.
	 * @param price parameter the method constructor the class HybridCar.
	 * @param year parameter the method constructor the class HybridCar.
	 * @param yearExpired parameter the method constructor the class HybridCar.
	 * @param image parameter the method constructor the class HybridCar.
	 * @param priceBase parameter the method constructor the class HybridCar.
	 * @param mark parameter the method constructor the class HybridCar.
	 * @param model parameter the method constructor the class HybridCar.
	 * @param cylinder parameter the method constructor the class HybridCar.
	 * @param mileager parameter the method constructor the class HybridCar.
	 * @param numDoor parameter the method constructor the class HybridCar.
	 * @param windowPolarized parameter the method constructor the class HybridCar.
	 * @param capacityTank parameter the method constructor the class HybridCar.
	 * @param batteryDuration parameter the method constructor the class HybridCar.
	 * @param licensePlate parameter the method constructor the class HybridCar.
	 * @param state parameter the method constructor the class HybridCar.
	 * @param typeCarsModel parameter the method constructor the class HybridCar.
	 * @param typeCar parameter the method constructor the class HybridCar.
	 * @param chargeType parameter the method constructor the class HybridCar.
	 * @param gasType parameter the method constructor the class HybridCar.
	 * @param documents parameter the method constructor the class HybridCar.
	 * @param typeVehicle parameter the method constructor the class HybridCar.
	 * @param percentDiscount parameter the method constructor the class HybridCar.
	 * @param status parameter the method constructor the class HybridCar.
	 */
	public void addCarHybrid(int id, double price, String year,String yearExpired, String image,double priceBase, String mark, String model, double cylinder, double mileager,
		String numDoor, String windowPolarized,double capacityTank,double batteryDuration,
		String licensePlate, String state,String typeCarsModel,String typeCar,String chargeType,String gasType, ArrayList<Document> documents, String typeVehicle, double percentDiscount, String status){
		
		int y=0;
		if (!model.isEmpty() && model != null){
			y = Integer.valueOf(model);
		}		

		HybridCar hc = new HybridCar(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargeType, gasType, documents, typeVehicle, percentDiscount, status);
		vehicles.add(hc);
		
	}

	/**
	 * The method addMotocycle is to add a new electric car in the arraylist the vehicles.
	 * @param id parameter the method constructor the class MotoCycle.
	 * @param priceBase parameter the method constructor the class MotoCycle.
	 * @param mark parameter the method constructor the class MotoCycle.
	 * @param model parameter the method constructor the class MotoCycle.
	 * @param cylinder parameter the method constructor the class MotoCycle.
	 * @param mileager parameter the method constructor the class MotoCycle.
	 * @param capacityGasoline parameter the method constructor the class MotoCycle.
	 * @param licensePlate parameter the method constructor the class MotoCycle.
	 * @param state parameter the method constructor the class MotoCycle.
	 * @param typeMotorcycle parameter the method constructor the class MotoCycle.
	 * @param gasType parameter the method constructor the class MotoCycle.
	 * @param documents parameter the method constructor the class MotoCycle.
	 * @param typeVehicle parameter the method constructor the class MotoCycle.
	 * @param typeCar parameter the method constructor the class MotoCycle.
	 * @param percentDiscount parameter the method constructor the class MotoCycle.
	 * @param status parameter the method constructor the class MotoCycle.
	 */
	public void addMotocycle(int id, double priceBase, String mark, String model,double cylinder, 
							double mileager,double capacityGasoline,String licensePlate, String state, String typeMotorcycle,String gasType, ArrayList<Document> documents, String typeVehicle, String typeCar, double percentDiscount, String status){
		
		int y=0;
		if (!model.isEmpty() && model != null){
			y = Integer.valueOf(model);
		}									

		MotoCycle mc = new MotoCycle(id, priceBase, mark, model, cylinder, mileager, capacityGasoline, licensePlate, state, typeMotorcycle,gasType, documents, typeVehicle, typeCar, percentDiscount, status);
        vehicles.add(mc);
		
	}

	/**
	 * The method addDocument is to add a new electric car in the arraylist the documents.
	 * @param number parameter the method constructor the class Document.
	 * @param price parameter the method constructor the class Document.
	 * @param year parameter the method constructor the class Document.
	 * @param coverAmount parameter the method constructor the class Document.
	 * @param gasLevel parameter the method constructor the class Document.
	 * @param image parameter the method constructor the class Document.
	 */
	public void addDocument(String number, double price, int year, double coverAmount, int gasLevel, String image){
		documents.add(new Document(number, price, year, coverAmount, gasLevel, image));
	}

	/**
	 * The method it is to calculate the total sale price of a vehicle, but this mechanism will vary according to the type of vehicle
	 */
	public void calculateSalePrice(){

		boolean exit = false;
		double salePrice=0;
		double basePrice=0;
		double discount=0;

		for (int i=0; i<vehicles.size() && exit == false; i++){

			if(vehicles.get(i) != null){

				Vehicle v = (Vehicle)vehicles.get(i);
				salePrice = v.getPriceBase();
				basePrice = v.getPriceBase();

				if (v.getTypeVehicle().equals("1")){ // Car

					if (v.getState().equals("2")){ // Used
						salePrice = salePrice - (basePrice * 0.10);
					}
	
					if (v.getTypeCar().equals("1")){ // Car in gas
						GassCar gc = (GassCar)vehicles.get(i);
						if (expiredDocumentation(gc.getDocuments())) {
							salePrice = salePrice + 500000;
						}
						salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
						gc.setSalePrice(salePrice);
						vehicles.set(i, gc);
					}else if (v.getTypeCar().equals("2")){ // Car in hybrid
						HybridCar hc = (HybridCar)vehicles.get(i);
						salePrice = salePrice + (basePrice * 0.15);						
						if (expiredDocumentation(hc.getDocuments())) {
							salePrice = salePrice + 500000;
						}		
						salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));				
						hc.setSalePrice(salePrice);
						vehicles.set(i, hc);
					}else if (v.getTypeCar().equals("3")){ // Car is electric
						ElectricCar ec = (ElectricCar)vehicles.get(i);
						salePrice = salePrice + (basePrice * 0.20);
						if (expiredDocumentation(ec.getDocuments())) {
							salePrice = salePrice + 500000;
						}		
						salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
						ec.setSalePrice(salePrice);		
						vehicles.set(i, ec);		
					} 

				}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
					MotoCycle mc = (MotoCycle)vehicles.get(i);
					salePrice = salePrice + (basePrice * 0.04);	
					if (v.getState().equals("2")){ // Used
						salePrice = salePrice - (basePrice * 0.02);
					}
	
					if (expiredDocumentation(mc.getDocuments())) {
						salePrice = salePrice + 500000;
					}		
					
					salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
					mc.setSalePrice(salePrice);		
					vehicles.set(i, mc);					
				}

			}else{
				exit =true;
			}
		}

	}

	/**
	 * This method calculates the selling price for vehicles.
	 * @param id is the attribute with which the vehicle will be found.
	 * @return returns the sale price of the vehicle.
	 */
	public double calculateSalePrice(int id){

		double salePrice=0;
		double basePrice=0;
		int index=0;

		index = findVehicle(id);
		Vehicle v = (Vehicle)vehicles.get(index);

		salePrice = v.getPriceBase();
		basePrice = v.getPriceBase();

		if (v.getTypeVehicle().equals("1")){ // Car

			if (v.getState().equals("2")){ // Usado
				salePrice = salePrice - (basePrice * 0.10);
			}
	
			if (v.getTypeCar().equals("1")){ // Car in gas
				GassCar gc = (GassCar)v;
				if (expiredDocumentation(gc.getDocuments())) {
					salePrice = salePrice + 500000;
				}
				salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
			}else if (v.getTypeCar().equals("2")){ // Car in hybrid
				HybridCar hc = (HybridCar)v;
				salePrice = salePrice + (basePrice * 0.15);						
				if (expiredDocumentation(hc.getDocuments())) {
					salePrice = salePrice + 500000;
				}		
				salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));				
			}else if (v.getTypeCar().equals("3")){ // Car is electric
				ElectricCar ec = (ElectricCar)v;
				salePrice = salePrice + (basePrice * 0.20);
				if (expiredDocumentation(ec.getDocuments())) {
					salePrice = salePrice + 500000;
				}		
				salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
			} 

		}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
			MotoCycle mc = (MotoCycle)v;
			salePrice = salePrice + (basePrice * 0.04);	
			if (v.getState().equals("2")){ // Usado
				salePrice = salePrice - (basePrice * 0.02);
			}
			if (expiredDocumentation(mc.getDocuments())) {
				salePrice = salePrice + 500000;
			}		
			salePrice = salePrice - (salePrice * (v.getPercentDiscount()/100));
		}

		return salePrice;
	}

	/**
	 * The method expiredDocumentation it is to know if the documentation of a vehicle has already expired
	 * @param documents attribute to find vehicle documentation
	 * @return returns the result the document expiration
	 */
	public boolean expiredDocumentation(ArrayList<Document> documents) {
		boolean result = false;
		boolean exit = false;
		int indExpire = 0;
        LocalDate dateSystem; 
        int yearCurrent=0;

        dateSystem = LocalDate.now();
        yearCurrent = Integer.valueOf((String.valueOf(dateSystem)).substring(0,4));

		for (int i=0; i<documents.size() && exit == false; i++){
			
			Document d = (Document)documents.get(i);

			if (d.getYear() < yearCurrent){
				indExpire = 1;
			}
		}		

		if (indExpire == 1) {
			result = true;
		}
		return result;
	}

	/**
	 * The method getVehicle it is take all vehicles registered
	 * @return returns the vehicles take
	 */
	public String getVehicle(){

		String out = "";
		boolean exit = false;
		
		for(int i= 0; i< vehicles.size() && exit == false; i++){
			if(vehicles.get(i) != null){
				out += "\nVEHICLE # " + (i+1) + " ====================\n";
				out +=((Vehicle)vehicles.get(i)).toString();

				Vehicle v = (Vehicle)vehicles.get(i);

				if (v.getTypeVehicle().equals("1")){ // Car
					if (v.getTypeCar().equals("1")){ // Car in gas
						GassCar gc = (GassCar)vehicles.get(i);
						out += findDocuments(gc.getDocuments());
					}else if (v.getTypeCar().equals("2")){ // Car in hybrid
						HybridCar hc = (HybridCar)vehicles.get(i);
						out += findDocuments(hc.getDocuments());
					}else if (v.getTypeCar().equals("3")){ // Car is electric
						ElectricCar ec = (ElectricCar)vehicles.get(i);
						out += findDocuments(ec.getDocuments());
					} 
				}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
					MotoCycle mc = (MotoCycle)vehicles.get(i);
					out += findDocuments(mc.getDocuments());
				}

			}else{
				exit =true;
			}
		}


		return out;
	}

	/**
	 * the method getVehicle it is the take all vehicles registered for licensePlate.
	 * @param licensePlate attribute whith find the vehicle.
	 * @return returns the vehicles take for licensePlate.
	 */
	public String getVehicle(String licensePlate){
    	String out = "";
		
		Vehicle v = (Vehicle)vehicles.get(findVehicle(licensePlate));

		out += v.toString();

		if (v.getTypeVehicle().equals("1")){ // Car
			if (v.getTypeCar().equals("1")){ // Car in gas
				GassCar gc = (GassCar)vehicles.get(findVehicle(licensePlate));
				out += findDocuments(gc.getDocuments());
			}else if (v.getTypeCar().equals("2")){ // Car in hybrid
				HybridCar hc = (HybridCar)vehicles.get(findVehicle(licensePlate));
				out += findDocuments(hc.getDocuments());
			}else if (v.getTypeCar().equals("3")){ // Car is electric
				ElectricCar ec = (ElectricCar)vehicles.get(findVehicle(licensePlate));
				out += findDocuments(ec.getDocuments());
			} 
		}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
			MotoCycle mc = (MotoCycle)vehicles.get(findVehicle(licensePlate));
			out += findDocuments(mc.getDocuments());
		}

		return out;
	}

	/**
	 * the method getVehicle it is the take all vehicles registered for id.
	 * @param id attribute whith find the vehicle.
	 * @return returns the vehicles take for id.
	 */
	public String getVehicle(int id){
    	String out = "";
		
		Vehicle v = (Vehicle)vehicles.get(findVehicle(id));

		out += v.toString();

		if (v.getTypeVehicle().equals("1")){ // Car
			if (v.getTypeCar().equals("1")){ // Car in gas
				GassCar gc = (GassCar)vehicles.get(findVehicle(id));
				out += findDocuments(gc.getDocuments());
			}else if (v.getTypeCar().equals("2")){ // Car in hybrid
				HybridCar hc = (HybridCar)vehicles.get(findVehicle(id));
				out += findDocuments(hc.getDocuments());
			}else if (v.getTypeCar().equals("3")){ // Car is electric
				ElectricCar ec = (ElectricCar)vehicles.get(findVehicle(id));
				out += findDocuments(ec.getDocuments());
			} 
		}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
			MotoCycle mc = (MotoCycle)vehicles.get(findVehicle(id));
			out += findDocuments(mc.getDocuments());
		}

		return out;
	}

	/**
	 * the method getVehicleParking it is the get a vehicle the parking.
	 * @param id attribute whith find the vehicle.
	 * @return returns the vehicles take for id.
	 */
	public String getVehicleParking(int id){
    	String out = "";
		
		Vehicle v = findVehicleParking(id);

		if (v!=null){
			out += v.toString();

			if (v.getTypeVehicle().equals("1")){ // Car
				if (v.getTypeCar().equals("1")){ // Car in gas
					GassCar gc = (GassCar)findVehicleParking(id);
					out += findDocuments(gc.getDocuments());
				}else if (v.getTypeCar().equals("2")){ // Car in hybrid
					HybridCar hc = (HybridCar)findVehicleParking(id);
					out += findDocuments(hc.getDocuments());
				}else if (v.getTypeCar().equals("3")){ // Car is electric
					ElectricCar ec = (ElectricCar)findVehicleParking(id);
					out += findDocuments(ec.getDocuments());
				} 
			}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
				MotoCycle mc = (MotoCycle)findVehicleParking(id);
				out += findDocuments(mc.getDocuments());
			}
		}

		return out;
	}

	/**
	 * the method getVehicle it is the take all vehicles the class Vehicle.
	 * @param v class where the vehicle will be taken.
	 * @return returns the vehicles take for the class Vehicle.
	 */
	public String getVehicle(Vehicle v){
    	String out = "";
		
   	    out += v.toString();

		if (v.getTypeVehicle().equals("1")){ // Car
			if (v.getTypeCar().equals("1")){ // Car in gas
				GassCar gc = (GassCar)vehicles.get(findVehicle(v.getId()));
				out += findDocuments(gc.getDocuments());
			}else if (v.getTypeCar().equals("2")){ // Car in hybrid
				HybridCar hc = (HybridCar)vehicles.get(findVehicle(v.getId()));
				out += findDocuments(hc.getDocuments());
			}else if (v.getTypeCar().equals("3")){ // Car is electric
				ElectricCar ec = (ElectricCar)vehicles.get(findVehicle(v.getId()));
				out += findDocuments(ec.getDocuments());
			} 
		}else if (v.getTypeVehicle().equals("2")){ // MotorCycle
			MotoCycle mc = (MotoCycle)vehicles.get(findVehicle(v.getId()));
			out += findDocuments(mc.getDocuments());
		}

		return out;
	}

	/**
	 * the method getVehicle it is the take all vehicles registered.
	 * @param typeCar attribute with find the vehicle.
	 * @param fuelType attribute with find the vehicle.
	 * @param state attribute with find the vehicle.
	 * @return returns vehicles take
	 */
	public String getVehicle(String typeCar, String fuelType, String state){
		
		String out = "";
		String gasType="";
		boolean exit = false;
		GassCar gc;
		HybridCar hc;
		ElectricCar ec;
		MotoCycle mc;
		int counter=1;
		ArrayList<Document> documents=null;
		
		for(int i= 0; i< vehicles.size() && exit == false; i++){
			if(vehicles.get(i) != null){

				Vehicle v = (Vehicle)vehicles.get(i);

				if (v.getTypeVehicle().equals("1")){ // 1=Car

					if (v.getTypeCar().equals("1")){ // Car in gas
						gc = (GassCar)vehicles.get(i);
						gasType = gc.getGasType();
						documents = gc.getDocuments();
					}else if (v.getTypeCar().equals("2")){ // Car in hybrid
						hc = (HybridCar)vehicles.get(i);
						gasType = hc.getGasType();
						documents = hc.getDocuments();
					}else if (v.getTypeCar().equals("3")){ // Car is electric
						ec = (ElectricCar)vehicles.get(i);
						gasType = "";
						documents = ec.getDocuments();
					} 

				}if (v.getTypeVehicle().equals("2")){ //2=MotorCycle
					mc = (MotoCycle)vehicles.get(i);
					gasType = mc.getGasType();
					documents = mc.getDocuments();
				}

				if ((typeCar.equals("4")  || typeCar.equals(v.getTypeCar())) &&
					(fuelType.equals("4") || fuelType.equals(gasType))       && 
					(state.equals("3")    || state.equals(v.getState()))){
						out += "\nVEHICLE # " + counter + " ====================\n";
						out +=((Vehicle)vehicles.get(i)).toString();
						out += findDocuments(documents);
						counter += 1;
				}

			}else{
				exit =true;
			}
		}

		return out;
	}

	/**
	 * The method it is find documents in the arraylist document
	 * @param docs attribute to find the document
	 * @return show the result search documents
	 */
	public String findDocuments(ArrayList<Document> docs){
		String out="";
		boolean exit=false;
		DecimalFormat df=new DecimalFormat("###,###.##");

		for(int i= 0; i< docs.size() && exit == false; i++){
			if(docs.get(i) != null){
				Document d = docs.get(i);
				if (i==0){
					out += "\nINFORMATION SOAT\n";
					out += "Number ......: " + d.getNumber() + "\n" +
					       "Price .......: " + df.format(d.getPrice()) + "\n" +
					       "Year ........: " + d.getYear() + "\n" +
						   "Image .......: " + d.getImage() + "\n" +
						   "Cover Amount : " + d.getCoverAmount() + "\n";
				}
				if (i==1){
					out += "\nINFORMATION TECHNOMECHANICS\n";
					out += "Number ......: " + d.getNumber() + "\n" +
					       "Price .......: " + df.format(d.getPrice()) + "\n" +
					       "Year ........: " + d.getYear() + "\n" +
						   "Image .......: " + d.getImage() + "\n" +
						   "Gas Level ...: " + d.getGasLevel() + "\n";
				}
				if (i==2){
					out += "\nINFORMATION PROPERTY CARD\n";
					out += "Number ......: " + d.getNumber() + "\n" +
					       "Price .......: " + df.format(d.getPrice()) + "\n" +
					       "Year ........: " + d.getYear() + "\n" +
						   "Image .......: " + d.getImage() + "\n";
				}
			}else{
				exit =true;
			}
		}

		return out;
	}

	/**
	 * The method it is find documents in the document
	 * @param licencePlate attribute to find the document
	 * @return returns the find documents with licencePlate
	 */
	public String findDocuments(String licencePlate){
		String out="";
		boolean exit=false;
		GassCar gc;
		HybridCar hc;
		ElectricCar ec;
		MotoCycle mc;
		ArrayList<Document> documents=null;
		String lc="";
		boolean expiredDocument=false;

		for(int i= 0; i< vehicles.size() && exit == false; i++){
			if(vehicles.get(i) != null){

				Vehicle v = (Vehicle)vehicles.get(i);

				if (v.getTypeVehicle().equals("1")){ // 1=Car

					if (v.getTypeCar().equals("1")){ // Car in gas
						gc = (GassCar)vehicles.get(i);
						documents = gc.getDocuments();
						lc = gc.getLicensePlate();
					}else if (v.getTypeCar().equals("2")){ // Car in hybrid
						hc = (HybridCar)vehicles.get(i);
						documents = hc.getDocuments();
						lc = hc.getLicensePlate();
					}else if (v.getTypeCar().equals("3")){ // Car is electric
						ec = (ElectricCar)vehicles.get(i);
						documents = ec.getDocuments();
						lc = ec.getLicensePlate();
					} 

				} else if (v.getTypeVehicle().equals("2")){ // 2=MotorCycle
					mc = (MotoCycle)vehicles.get(i);
					documents = mc.getDocuments();
					lc = mc.getLicensePlate();
				}
				
				if (licencePlate.equals(lc)){
					expiredDocument = expiredDocumentation(documents);
					if (expiredDocument == true){
						out += "\nThe documents are expired\n";
					}else{
						out += "\nThe documents are up to date\n";
					}
					out += findDocuments(documents);
				}

			}else{
				exit =true;
			}
		}

		return out;
	}

	/**
	 * The method it is find documents in the document
	 * @param id attribute to find the document
	 * @return returns the find documents with id
	 */
	public String findDocuments(int id){
		String out="";
		boolean exit=false;
		GassCar gc;
		HybridCar hc;
		ElectricCar ec;
		MotoCycle mc;
		ArrayList<Document> documents=null;
		boolean expiredDocument=false;

		for(int i= 0; i< vehicles.size() && exit == false; i++){
			if(vehicles.get(i) != null){

				Vehicle v = (Vehicle)vehicles.get(i);

				if (id == v.getId()){

					if (v.getTypeVehicle().equals("1")){ // 1=Car

						if (v.getTypeCar().equals("1")){ // Car in gas
							gc = (GassCar)vehicles.get(i);
							documents = gc.getDocuments();
						}else if (v.getTypeCar().equals("2")){ // Car in hybrid
							hc = (HybridCar)vehicles.get(i);
							documents = hc.getDocuments();
						}else if (v.getTypeCar().equals("3")){ // Car is electric
							ec = (ElectricCar)vehicles.get(i);
							documents = ec.getDocuments();
						} 

					} else if (v.getTypeVehicle().equals("2")){ // 2=MotorCycle
						mc = (MotoCycle)vehicles.get(i);
						documents = mc.getDocuments();
					}

					if (expiredDocument == true){
						out += "\nThe documents are expired\n";
					}else{
						out += "\nThe documents are up to date\n";
					}
					out += findDocuments(documents);
					exit=true;
				}
				
			}else{
				exit =true;
			}
		}

		return out;
	}	
	
	/**
	 * Eliminate document in arraylist documents
	 */
	public void clearDocuments(){
		documents = new ArrayList<Document>();
	}

	/**
	 * The method calculateImage it is calaculate the image depend the type document
	 * @param arrayImage matrix the image
	 * @param type type the documents
	 * @return returns arrayimage in the position the matrix
	 */
	public String calculateImage(String arrayImage[][], int type){

		String out="";

		if (type == 1){ // Calculate SOAT
		
			for (int i=0; i<arrayImage.length; i++){
				out += arrayImage[i][0];
				for (int j=1; j<arrayImage.length; j++){
					if (i==(arrayImage.length-1)){
						out += arrayImage[i][j];
					}
				}
			}

		} else if (type == 2){ // Calculate Technomechanics

			for(int i=0; i<arrayImage.length; i++){
				for (int j=0; j<arrayImage.length; j++){
					if (i==0 && j < (arrayImage.length - 1)) {
						out += arrayImage[i][j];
					}
					if ((i+j)==(arrayImage.length - 1)){
						out += arrayImage[i][j];
					}
					if (j>0 && i==(arrayImage.length - 1)) {
						out += arrayImage[i][j];
					}
				}
			}
			
		} else if (type == 3){ // Calculate Property Card
			
			int number=0;

			for(int i=(arrayImage.length-1); i>=0; i--){
				for (int j=(arrayImage.length-1); j>=0; j--){
					number = i + j;
					number = number % 2;
					if (number==0 && (i+j)>0) { // Even number
						out += arrayImage[i][j];
					}
				}
			}

		}

		return out;

	}

	/**
	 * The method stringImage it is the 
	 * @param arrayImage
	 * @return
	 */
	public String stringImage(String arrayImage[][]){
		String out="";

		out = "{";
		for (int i=0; i<arrayImage.length; i++){
			out += "{";
			for (int j=0; j<arrayImage.length; j++){
				out += arrayImage[i][j];
				if (j < (arrayImage.length-1)){
					out += ",";
				}
			}
			out += "}";
			if (i < (arrayImage.length-1)){
				out += ",";
			}
		}

		out += "}";
		return out;
	}
	
	/**
	 * the method addParqueadero is about adding a vehicle in the parking lot depending on the model
	 * @param vehicle attribue to find the vehicule in the class Vehicle
	 * @param model attribute to find the model vehicle
	 */
	public void addParqueadero(Vehicle vehicle, String model){

		int year=0;
		boolean exit=false;

		if (!model.isEmpty() && model != null){
			year = Integer.valueOf(model);
		}

		for (int i=0; i<10 && exit==false; i++){
			switch(year){
				case 2014:
					if (parking[i][0] == null){
					    parking[i][0] = vehicle;
					    exit=true;
					}
					break;
				case 2013:
					if (parking[i][1] == null){
						parking[i][1] = vehicle;
						exit=true;
					}				
		   		    break;
				case 2012:
					if (parking[i][2] == null){
						parking[i][2] = vehicle;
						exit=true;
					}				
				    break;
				case 2011:
					if (parking[i][3] == null){
						parking[i][3] = vehicle;
						exit=true;
					}
				    break;
				default:
					if (parking[i][4] == null){
						parking[i][4] = vehicle;
						exit=true;
					}
				    break;
			}
		}

	}

	/**
	 * The method is used to create the model that the vehicle will have
	 * @return returns model the parking
	 */
	public String parkingMap(){
		String out="";

		out = "\nPARKING MAP:\n";
		out += "X=Car, O=No Car\n\n";
		out += "2014 2013 2012 2011 <2011\n";
		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){

				if (parking[i][j] == null){
					out += " O ";
				}else {
					out += " x ";
				}
			}
			out += "\n";
		}

		return out;
	}

	/**
	 * The method listVehicles it is a list of all vehicles
	 * @param year1 attribute to find first year the vehicle
	 * @param year2 attribute to find second year the vehicle
	 * @return show vehicles list
	 */
	public String listVehicles(String year1, String year2){
		String out="";
		String licensePlate="";
		int yearNum1=0;
		int yearNum2=0;
		int yearCar=0;

		yearNum1 = Integer.valueOf(year1);
		yearNum2 = Integer.valueOf(year2);

		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){
				if (parking[i][j] != null){
					Vehicle v = parking[i][j];
					yearCar = Integer.valueOf(v.getModel());
					if (yearCar >= yearNum1 && yearCar <= yearNum2){
						out += "\nVEHICLE ====================\n";
						out += getVehicleParking(v.getId());
					}
				}
			}
		}

		return out;
	}

	/**
	 * The method oldestNewestVehicle it is a 
	 * @return
	 */
	public String oldestNewestVehicle(){
		String out="";
		int idOldest=0;
		int idNewest=0;
		int yearCar=0;
		int yearCarOldest=9999;
		int yearCarNewest=0;

		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){
				if (parking[i][j] != null){
					Vehicle v = parking[i][j];
					yearCar = Integer.valueOf(v.getModel());
					if (yearCar < yearCarOldest) {
						yearCarOldest = yearCar;
						idOldest = v.getId();
					}
					if (yearCar > yearCarNewest) {
						yearCarNewest = yearCar;
						idNewest = v.getId();
					}
				}
			}
		}

		out += "\nVEHICLE OLDEST ====================\n";
		out += getVehicleParking(idOldest);
		out += "\nVEHICLE NEWEST ====================\n";
		out += getVehicleParking(idNewest);
		
		return out;
	}

	/**
	 * The method occupancyRate show the porcentage the ocuppacity in the parking
	 * @return returns porcentage the ocuppacity
	 */
	public String occupancyRate(){
		String out="";
		double count=0;
		double percentage=0;

		for(int i=0; i<10; i++){
			for(int j=0; j<5; j++){
				if (parking[i][j] != null){
					count += 1;
				}
			}
		}

		percentage = (count/50)*100;
		out += "\nPERCENTAJE OF OCCUPATION : " + percentage + "%\n";
		out += "\nParking spaces available : " + (50-count);
		out += "\nBusy parking lots .......: " + (count);

		if (percentage == 100){
			out += "\n\nParking full, needs to be enlarged.\n\n";
		}
		else{
			out += "\n\nThere are parking available.\n\n";
		}

		return out;
	}	

	/**
	 * The method sellVehicles it is to sell a vehicle taking the id and the document
	 * @param id attribute to find a vehicle
	 * @param doc attribute to find a vehicle
	 * @return sells the vehicles
	 */
	public String sellVehicle(int id, Document doc){
		String out="";
		boolean flagVehicle= false;
		GassCar gc;
		HybridCar hc;
		ElectricCar ec;
		MotoCycle mc;
		double salePrice=0;
		DecimalFormat df=new DecimalFormat("###,###.##");

		for(int i=0; i< vehicles.size() && !flagVehicle; i++){
			if(vehicles.get(i) instanceof Vehicle){
				if(vehicles.get(i)!=null && ((Vehicle)vehicles.get(i)).getId() == id){
					flagVehicle=true;
					Vehicle v = vehicles.get(i);

					if (v.getStatus().equals("1")){
						out += "\nThe vehicle has already been sold";
					}else {
						ArrayList<Document> docs;
						if (v.getTypeVehicle().equals("1")){ // 1=Car

							if (v.getTypeCar().equals("1")){ // Car in gas
								gc = (GassCar)vehicles.get(i);
								docs = gc.getDocuments();
								docs.add(doc);
								gc.setDocuments(docs);
								gc.setStatus("1");
								if (gc.getSalePrice() == 0){
									gc.setSalePrice(calculateSalePrice(v.getId()));
								}
								salePrice = gc.getSalePrice();
								vehicles.set(i,gc);
							}else if (v.getTypeCar().equals("2")){ // Car in hybrid
								hc = (HybridCar)vehicles.get(i);
								docs = hc.getDocuments();
								docs.add(doc);
								hc.setStatus("1");
								hc.setDocuments(docs);
								if (hc.getSalePrice() == 0){
									hc.setSalePrice(calculateSalePrice(v.getId()));
								}		
								salePrice = hc.getSalePrice();						
								vehicles.set(i,hc);
							}else if (v.getTypeCar().equals("3")){ // Car is electric
								ec = (ElectricCar)vehicles.get(i);
								docs = ec.getDocuments();
								docs.add(doc);
								ec.setStatus("1");
								ec.setDocuments(docs);
								if (ec.getSalePrice() == 0){
									ec.setSalePrice(calculateSalePrice(v.getId()));
								}		
								salePrice = ec.getSalePrice();						
								vehicles.set(i,ec);
							} 
		
						} else if (v.getTypeVehicle().equals("2")){ // 2=MotorCycle
							mc = (MotoCycle)vehicles.get(i);
							docs = mc.getDocuments();
							docs.add(doc);
							mc.setStatus("1");
							mc.setDocuments(docs);
							if (mc.getSalePrice() == 0){
								mc.setSalePrice(calculateSalePrice(v.getId()));
							}					
							salePrice = mc.getSalePrice();		
							vehicles.set(i,mc);
						}

						out += "\nVehicle sold without problems for a value of : " + df.format(salePrice);
					}
				}
			}
		}

		if (out.equals("")) {
			out += "\nVehicle not found";
		}

		return out;
	}

	/**
	 * The method parkingVehicles it is to automatically park all used vehicles that are registered
	 * @return parking the vehicle
	 */
	public String parkingVehicles(){
		String out="";
		boolean exit=false;
		int year=0;
		GassCar gc;
		HybridCar hc;
		ElectricCar ec;
		MotoCycle mc;

		for(int i=0; i< vehicles.size() && exit==false; i++){
			if(vehicles.get(i) != null){

				Vehicle v = vehicles.get(i);

				year=0;
				if (!v.getModel().isEmpty() && v.getModel() != null){
					year = Integer.valueOf(v.getModel());
				}

				if (v.getState().equals("2") && year < 2015 && v.getStatus().equals("0")) { // 2=Used car

					if (v.getTypeVehicle().equals("1")){ // 1=Car
						if (v.getTypeCar().equals("1")){ // Car in gas
							gc = (GassCar)vehicles.get(i);
							addParqueadero(gc, v.getModel());
						}else if (v.getTypeCar().equals("2")){ // Car in hybrid
							hc = (HybridCar)vehicles.get(i);
							addParqueadero(hc, v.getModel());
						}else if (v.getTypeCar().equals("3")){ // Car is electric
							ec = (ElectricCar)vehicles.get(i);
							addParqueadero(ec, v.getModel());
						} 
					} else if (v.getTypeVehicle().equals("2")){ // 2=MotorCycle
						mc = (MotoCycle)vehicles.get(i);
						addParqueadero(mc, v.getModel());
					}

					vehicles.remove(i);
				}

			}
			else{
				exit=true;
			}
		}

		return out;
	}

	
	public ArrayList<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(ArrayList<Document> documents) {
		this.documents = documents;
	}


}
