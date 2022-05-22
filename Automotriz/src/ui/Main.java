package ui;
//import model.ControlParking;
import model.ControlParking;
import model.Document;
import model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	private ControlParking parking;
	private Scanner sc;
    ArrayList<Document> documents;
	
	public Main(){ 
        parking = new ControlParking();
        //initialized scanner
        sc= new Scanner(System.in);
    }
	public static void main(String [] args) {
		
		System.out.println("Starting app");
		// create a object the class main
		Main ppal= new Main();
		
        
		int option=0;
		
		do{
			option= ppal.showMenu();
			ppal.executeOperation(option);
			

		}while (option!=0);
		
	}
	

	public int showMenu() {
		int option=0;

		System.out.println(
				"\nSelect an option to start\n" +
				"(1) Register vehicle\n" +
				"(2) Calculate price\n"+
				"(3) Show report vehicle\n"+
                "(4) Show document State\n"+  
                "(5) Map parking\n"+
                "(6) Show occupancy parking\n"+
                "(7) Sell vehicle\n"+
                "(8) Parking unsold vehicles\n"+
				"(0) Exit"+"\n"+
                "Enter option"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	
    /**
	 * Method that is responsible for calling the methods that resolve each of the requirements of the application
	 * @param operation, int is the number entered by the user (it has not been validated)
	 */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;

		case 1:
            registerVehicle();
			break;

		case 2:
            showPriceTotal();
			break;
	
		case 3:
            showReportVehicle();
			break;

        case 4:
            showDocumentStatuses();
            break;

        case 5:
            generateMapParking();
            break;

        case 6:
            generateOccupancyReportParking();
            break;

        case 7:
            sellVehicle();
            break;

        case 8:
            parkingUnsoldVehicles();            
            break;    

		default:
			System.out.println("Error, optionn invalid");
		
		}
	}

    /**
     * The method is responsible for registering all the data of the vehicles and saving them in the database
     */
    public void registerVehicle(){
        int id=0;
        double priceBase=0;
        String mark ="";
        String model="";
        double cylinder=0;
        double mileager=0;
        String licensePlate=""; 
        String state="";
        boolean ch = false;
        String numDoor="";
        String windowPolarized="";
        String typeVehicle="";
        String typeCar="";
        boolean chs= false;
        String typeMotorcycle="";
        String typeCarsModel="";
        double capacityTank=0;
        double batteryDuration=0;
        String gasType="";
        String chargerType="";
        double priceDocument=0;
        String year="";
        String image="";
        String dateExpired="";
        int yearDocument=0;
        int indInformation='0'; 
        double coverAmount=0;
        int gasLevel=0;
        String number="";
        double percentDiscount=0;
        String status="0";
        String arrayImageSOAT[][]={{"1","9","8","0"},{"3","11","2","5"},{"4","21","6","22"},{"12","4","6","1"}};
        String arrayImageTECH[][]={{"3","0","9","33"},{"4","7","11","2"},{"3","17","8","1"},{"42","13","1","6"}};

        System.out.println("ID :");
        id = sc.nextInt();

        Vehicle v1 = parking.findVehicleId(id);
        Vehicle v2 = parking.findVehicleParking(id);
        if (v1 != null || v2 != null){
            System.out.println("Error, the vehicle already exists");
        }
        else {

            sc.nextLine();
            while(ch==false){
                System.out.println("What is Vehicle: 1=Car , 2=MotorCycle");
                typeVehicle=sc.nextLine();
                if(!typeVehicle.equals("1") && !typeVehicle.equals("2")){
                    System.out.println("Error, please try option");
                }else{
                    ch=true;
                }
            
            }

            chs=false;
            while(chs==false){    
                System.out.println("State: 1=New , 2=Used");
                state = sc.nextLine();
                if(!state.equals("1") && !state.equals("2")){
                    System.out.println("Error, please try option");
                }else{
                    chs=true;
                }
            }

            chs=false;
            if(typeVehicle.equals("1")){ // Car
                while(chs==false){    
                    System.out.println("What is car: 1=Car in gas , 2=Car in hybrid, 3=Car is electric");
                    typeCar= sc.nextLine();           
                    if(!typeCar.equals("1") && !typeCar.equals("2") && !typeCar.equals("3")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 
                if(typeCar.equals("1")){ // Car in gas
                    
                    chs=false;
                    while(chs==false){
                        System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                        typeCarsModel = sc.nextLine();
                        if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }
                    System.out.println("Price base");
                    priceBase = sc.nextDouble();

                    System.out.println("Model");
                    sc.nextLine();
                    model= sc.nextLine();

                    System.out.println("Mark");
                    mark=sc.nextLine();
            
                    System.out.println("Cylinder");
                    cylinder = sc.nextDouble();

                    System.out.println("Mileage");
                    mileager= sc.nextDouble();

                    if (state.equals("1")) { // 1=Nuevo
                        licensePlate ="";
                        sc.nextLine();
                    } else if (state.equals("2")){ // 2=Usado
                        System.out.println("License plate");
                        sc.nextLine();
                        licensePlate= sc.nextLine();
                    }

                    System.out.println("Number the door");
                    numDoor = sc.nextLine();

                    System.out.println("Capacity tank(Gallons)");
                    capacityTank = sc.nextDouble();

                    sc.nextLine();
                    chs=false;
                    while(chs==false){    
                        System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                        gasType = sc.nextLine();
                        if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    } 

                    chs=false;
                    while(chs==false){
                        System.out.println("Does your car have tinted window? 1=Yes , 2= No");
                        windowPolarized= sc.nextLine();
                        if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                        chs=true;
                        }
                        
                    }

                    System.out.println("Additional percentage discount:");
                    percentDiscount = sc.nextDouble();

                    indInformation = 1;
            
                }else if(typeCar.equals("2")){ // Car in hybrid
                    
                    chs=false;
                    while(chs==false){    
                        System.out.println("State: 1=New , 2=Used");
                        state = sc.nextLine();
                        if(!state.equals("1") && !state.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }

                    chs=false;
                    while(chs==false){
                        System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                        typeCarsModel = sc.nextLine();
                        if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }
                
                    System.out.println("Price base");
                    priceBase = sc.nextDouble();

                    System.out.println("Model");
                    sc.nextLine();
                    model= sc.nextLine();

                    System.out.println("Mark");
                    mark=sc.nextLine();
            
                    System.out.println("Cylinder");
                    cylinder = sc.nextDouble();

                    System.out.println("Mileager");
                    mileager= sc.nextDouble();

                    if (state.equals("1")) { // 1=Nuevo
                        licensePlate ="";
                    } else if (state.equals("2")){ // 2=Usado
                        System.out.println("License plate");
                        sc.nextLine();
                        licensePlate= sc.nextLine();
                    }

                    System.out.println("Number the door");
                    numDoor = sc.nextLine();

                    System.out.println("Capacity tank(Gallons)");
                    capacityTank = sc.nextDouble();

                    System.out.println("Battery duration (km)");
                    batteryDuration = sc.nextDouble();

                    sc.nextLine();
                    chs=false;
                    while(chs==false){    
                        System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                        gasType = sc.nextLine();
                        if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }

                    chs=false;
                    while(chs==false){    
                        System.out.println("Battery type: 1=Normal , 2=Fast");
                        chargerType = sc.nextLine();
                        if(!chargerType.equals("1") && !chargerType.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    } 

                    chs=false;
                    while(chs==false){
                        System.out.println("Does your car have tinted window? 1=Yes , 2= No");
                        windowPolarized= sc.nextLine();
                        if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                        
                    }
                    
                    System.out.println("Additional percentage discount:");
                    percentDiscount = sc.nextDouble();

                    indInformation = 1;

                }else if(typeCar.equals("3")){ // Car is electric
                    chs=false;
                    while(chs==false){
                        System.out.println("What is type vehicle: 1=Sedan , 2=Pickup Truck");
                        typeCarsModel = sc.nextLine();
                        if(!typeCarsModel.equals("1") && !typeCarsModel.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }

                    chs=false;
                    while(chs==false){    
                        System.out.println("State: 1=New , 2=Used");
                        state = sc.nextLine();
                        if(!state.equals("1") && !state.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }
                
                    System.out.println("Price base");
                    priceBase = sc.nextDouble();

                    System.out.println("Model");
                    sc.nextLine();
                    model= sc.nextLine();

                    System.out.println("Mark");
                    mark=sc.nextLine();
            
                    System.out.println("Cylinder");
                    cylinder = sc.nextDouble();

                    System.out.println("Mileager");
                    mileager= sc.nextDouble();

                    if (state.equals("1")) { // 1=Nuevo
                        licensePlate ="";
                    } else if (state.equals("2")){ // 2=Usado
                        System.out.println("License plate");
                        sc.nextLine();
                        licensePlate= sc.nextLine();
                    }

                    System.out.println("Number the door");
                    numDoor = sc.nextLine();

                    System.out.println("Battery duration (km)");
                    batteryDuration = sc.nextDouble();

                    sc.nextLine();
                    chs=false;
                    while(chs==false){    
                        System.out.println("Battery type: 1=Normal , 2=Fast");
                        chargerType = sc.nextLine();
                        if(!chargerType.equals("1") && !chargerType.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    } 

                    chs=false;
                    while(chs==false){
                        System.out.println("Does your car have polarized window? 1=Yes , 2= No");
                        windowPolarized= sc.nextLine();
                        if(!windowPolarized.equals("1") && !windowPolarized.equals("2")){
                            System.out.println("Error, please try option");
                        }else{
                            chs=true;
                        }
                    }

                    System.out.println("Additional percentage discount:");
                    percentDiscount = sc.nextDouble();

                    indInformation = 1;
                }

            }else if(typeVehicle.equals("2")){ // MotorCycle
                
                chs=false;
                while(chs==false){
                    System.out.println("Whats type motocycle is: 1=Standard , 2=Sporty , 3=Scooter , 4=Cross");
                    typeMotorcycle=sc.nextLine();
                    if(!typeMotorcycle.equals("1")&& !typeMotorcycle.equals("2") && !typeMotorcycle.equals("3") && !typeMotorcycle.equals("4")){
                        System.out.println("Error, please try option");
                    }else{
                    chs=true;
                    }
                }
                
                chs=false;
                while(chs==false){    
                    System.out.println("State: 1=New , 2=Used");
                    state = sc.nextLine();
                    if(!state.equals("1") && !state.equals("2")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 

                System.out.println("Price base");
                priceBase = sc.nextDouble();
                
                System.out.println("Model");
                sc.nextLine();
                model= sc.nextLine();
                
                System.out.println("Mark");
                mark=sc.nextLine();
            
                System.out.println("Cylinder");
                cylinder = sc.nextDouble();
                
                System.out.println("Mileager");
                mileager= sc.nextDouble();
                
                if (state.equals("1")) { // 1=Nuevo
                    licensePlate ="";
                } else if (state.equals("2")){ // 2=Usado
                    System.out.println("License plate");
                    sc.nextLine();
                    licensePlate= sc.nextLine();
                }

                System.out.println("Capacity tank(Gallons)");
                capacityTank = sc.nextDouble();
                
                sc.nextLine();
                chs=false;
                while(chs==false){    
                    System.out.println("Gasoline type: 1=Extra , 2=Current , 3= Diesel");
                    gasType = sc.nextLine();
                    if(!gasType.equals("1") && !gasType.equals("2") && !gasType.equals("3")){
                        System.out.println("Error, please try option");
                    }else{
                        chs=true;
                    }
                } 
                
                System.out.println("Additional percentage discount:");
                percentDiscount = sc.nextDouble();

                indInformation = 1;
            } 

            // Record documentation information

            if (documents != null) {
                documents = null;
            } 
            if (parking.getDocuments() != null) {
                parking.clearDocuments();
            }
            
            System.out.println("\n*** Information of SOAT ****\n");

            chs=false;
            while(chs==false){    
                System.out.println("Price:");
                priceDocument = sc.nextDouble();
                if(priceDocument == 0){
                    System.out.println("Error, you must enter the Price");
                }else{
                    chs=true;
                }
            } 

            chs=false;
            while(chs==false){    
                System.out.println("Year:");
                yearDocument = sc.nextInt(); 
                if(yearDocument == 0){
                    System.out.println("Error, you must enter the Year");
                }else{
                    chs=true;
                }
            }         

            chs=false;
            while(chs==false){    
                System.out.println("Cover amount:");
                coverAmount = sc.nextDouble(); 
                if(coverAmount == 0){
                    System.out.println("Error, you must enter the Cover Amount");
                }else{
                    chs=true;
                }
            }         

            gasLevel=0;
            number = parking.calculateImage(arrayImageSOAT, 1);
            image = parking.stringImage(arrayImageSOAT); 
            parking.addDocument(number, priceDocument, yearDocument, coverAmount, gasLevel, image);

            System.out.println("\n*** Information of Technomechanics ****\n");

            chs=false;
            while(chs==false){    
                System.out.println("Price:");
                priceDocument = sc.nextDouble();
                if(priceDocument == 0){
                    System.out.println("Error, you must enter the Price");
                }else{
                    chs=true;
                }
            } 

            chs=false;
            while(chs==false){    
                System.out.println("Year:");
                yearDocument = sc.nextInt(); 
                if(yearDocument == 0){
                    System.out.println("Error, you must enter the Year");
                }else{
                    chs=true;
                }
            }         

            chs=false;
            while(chs==false){    
                System.out.println("Gas Level:");
                gasLevel = sc.nextInt(); 
                if(yearDocument == 0){
                    System.out.println("Error, you must enter the Gas Level");
                }else{
                    chs=true;
                }
            }         

            coverAmount=0;
            number = parking.calculateImage(arrayImageTECH, 2);
            image = parking.stringImage(arrayImageTECH); 
            parking.addDocument(number, priceDocument, yearDocument, coverAmount, gasLevel, image);

            if (indInformation == 1){

                ArrayList<Document> d = parking.getDocuments();

                if (typeVehicle.equals("1")) { // Car

                    if (typeCar.equals("1")){ // Car in gas
                        parking.addCarGas(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, licensePlate, state, typeCarsModel, typeCar, gasType, d, typeVehicle, percentDiscount, status);
                    }else if (typeCar.equals("2")){ // Car in hybrid
                        parking.addCarHybrid(id, priceDocument,year,dateExpired,image,priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, capacityTank, 
                                            batteryDuration, licensePlate, state, typeCarsModel, typeCar, chargerType, gasType, d, typeVehicle, percentDiscount, status);
                    }else if (typeCar.equals("3")) { // Car is electric
                        parking.addCarElectric(id, priceBase, mark, model, cylinder, mileager, numDoor, windowPolarized, batteryDuration, licensePlate, state, 
                                                typeCarsModel, typeCar, chargerType, d, typeVehicle, percentDiscount, status);
                    }

                } else if (typeVehicle.equals("2")) { // MotorCycle
                    parking.addMotocycle(id, priceBase, mark, model, cylinder, mileager, capacityTank, licensePlate, state, typeMotorcycle, gasType, d, typeVehicle, typeCar, percentDiscount, status);
                }
            }
        }
    }
    
    /**
     * the method showPriceTotal is for show total price call the method calculateSalePrice
     */
	public void showPriceTotal() {
		
		System.out.println();
        parking.calculateSalePrice();
		
	}

    /**
     * The method showReporVehicle it is for show data vehicle
     */
    public void showReportVehicle(){

        boolean chs=false;
        String typeCar="";
        String fuelType="";
        String state="";

        System.out.println("\nVEHICLE REPORT\n");
        System.out.println("Criteria:");

        while(chs==false){    
            System.out.println("a. Type of vehicle: 1=Car in gas , 2=Car in hybrid, 3=Car is electric, 4=All");
            typeCar= sc.nextLine();           
            if(!typeCar.equals("1") && !typeCar.equals("2") && !typeCar.equals("3") && !typeCar.equals("4")){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        } 

        chs=false;
        while(chs==false){    
            System.out.println("b. Fuel type: 1=Extra , 2=Current , 3= Diesel, 4=All");
            fuelType = sc.nextLine();
            if(!fuelType.equals("1") && !fuelType.equals("2") && !fuelType.equals("3") && !fuelType.equals("4")){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        } 

        chs=false;
        while(chs==false){    
            System.out.println("c.Vehicle Status: 1=New , 2=Used, 3=All");
            state = sc.nextLine();
            if(!state.equals("1") && !state.equals("2") && !state.equals("3")){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        }

        System.out.println(parking.getVehicle(typeCar, fuelType, state));
    }

    /**
     * The method showDocumentStatuses it is for show the status the documents
     */
    public void showDocumentStatuses(){
        boolean chs=false;
        int id=0;

        chs=false;
        while(chs==false){    
            System.out.println("enter the vehicle Id :");
            id = sc.nextInt();
            if(id == 0){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        }

        System.out.println(parking.findDocuments(id));
    }

    /**
     * the method generateMapParking it is for generate map parking
     */
    public void generateMapParking(){
        System.out.println(parking.parkingMap());
    }
    
    /**
     * the method generateOccupancyReportParking it is for show the occupacity available the parking
     */
    public void generateOccupancyReportParking(){
 
        String response="";
        String year1="";
        String year2="";
        boolean chs=false;

        System.out.println("\nOCCUPANCY REPORT\n");
        System.out.println("Criteria:");

        while(chs==false){    
            System.out.println("a. List of vehicles (and their information) given a range of years");
            System.out.println("b. Data of the oldest and newest vehicle");
            System.out.println("c. Parking occupancy rate");
            response= sc.nextLine();
            if(!response.equals("a") && !response.equals("b") && !response.equals("c")){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        }         

        if (response.equals("a")){
            System.out.println("Range of years:");
            chs=false;
            while(chs==false){    
                System.out.println("Year 1:");
                year1 = sc.nextLine();
                if(year1.equals("")){
                    System.out.println("Error, please enter year");
                }else{
                    chs=true;
                }
            }
            chs=false;
            while(chs==false){    
                System.out.println("Year 2:");
                year2 = sc.nextLine();
                if(year2.equals("")){
                    System.out.println("Error, please enter year");
                }else{
                    chs=true;
                }
            }
            System.out.println(parking.listVehicles(year1, year2));
        }else if(response.equals("b")){
            System.out.println(parking.oldestNewestVehicle());
        }else if (response.equals("c")){
            System.out.println(parking.occupancyRate());
        }
        
    }

    /**
     * The method sellVehicle it is for sell vehicles
     */
    public void sellVehicle(){
        boolean chs=false;
        int id=0;
        double priceDocument=0;
        int yearDocument=0;
        double coverAmount=0;
        int gasLevel=0;
        String number="";
        String image="";
        String arrayImageCARD[][]={{"1","9","8","0"},{"3","11","2","5"},{"4","21","6","22"},{"12","4","6","1"}};

        chs=false;
        while(chs==false){    
            System.out.println("Enter the ID of the vehicle to sell :");
            id = sc.nextInt();
            if(id == 0){
                System.out.println("Error, please try option");
            }else{
                chs=true;
            }
        }

        Vehicle v = (Vehicle)parking.findVehicleId(id);

        if (v != null){
            if (v.getStatus().equals("1")){
                System.out.println("\nThe vehicle has already been sold");
            } 
            else{

                System.out.println("\n*** Information of Property Card ****\n");

                chs=false;
                while(chs==false){    
                    System.out.println("Price:");
                    priceDocument = sc.nextDouble();
                    if(priceDocument == 0){
                        System.out.println("Error, you must enter the Price");
                    }else{
                        chs=true;
                    }
                } 
        
                chs=false;
                while(chs==false){    
                    System.out.println("Year:");
                    yearDocument = sc.nextInt(); 
                    if(yearDocument == 0){
                        System.out.println("Error, you must enter the Year");
                    }else{
                        chs=true;
                    }
                }         
        
                coverAmount=0;
                gasLevel=0; 
                number = parking.calculateImage(arrayImageCARD, 3);
                image = parking.stringImage(arrayImageCARD); 
        
                Document d = new Document(number, priceDocument, yearDocument, coverAmount, gasLevel, image);
        
                System.out.println(parking.sellVehicle(id, d));            
            }
        }
        else{
            System.out.println("Vehicle not found.");            
        }

    }

    /**
     * The method parkingUnsoldVehicles it is for show message the parking vehicles in the map
     */
    public void parkingUnsoldVehicles(){
        System.out.println(parking.parkingVehicles());
        System.out.println("Parked vehicles");
    }

}