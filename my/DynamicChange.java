package my;


interface Service{
     void doService();
	 void calculatePrice();
}

interface ServiceFactory{
	Service getService();
}

class CleanHouse implements Service{
    public void doService(){
		System.out.println("Start a cleaning process of the house...");
		System.out.println("Finished the cleaning house service");
	}
	
	public void calculatePrice(){
		System.out.println("CalculatePrice from cleanHouse service");
	}
}

class CleanHouseFactory implements ServiceFactory{
	public Service getService(){
		return new CleanHouse();
	}
}

// Second variant of Interface Implementation

class CleanVehicle implements Service {
	public void doService(){
		System.out.println("Cleaning vehicle");
	}
	
	public void calculatePrice(){
		System.out.println("calculatePrice for cleaning vehicle service");
	}
}

class CleanVehicleFactory implements ServiceFactory{
	private static Service cleanVehicle = new CleanVehicle();
	public Service getService(){
		return cleanVehicle;
	}
}

public class DynamicChange{
	
	public static void serviceConsumer(ServiceFactory serviceFactory){
		Service s = serviceFactory.getService();
		System.out.println("Service has address=" + s); 
		s.doService();
		s.calculatePrice();
	}
	
	public static void main(String[] args){
			serviceConsumer(new CleanHouseFactory());
			System.out.println("");
			serviceConsumer(new CleanVehicleFactory());			
			System.out.println("");
			serviceConsumer(new CleanHouseFactory());
			System.out.println("");
			serviceConsumer(new CleanVehicleFactory());			
			System.out.println("");
	}
}
	


	
		