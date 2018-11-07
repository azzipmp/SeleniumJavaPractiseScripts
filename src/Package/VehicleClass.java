package Package;

public class VehicleClass {
	 String name;
	String color;
	String model;
	int year;
	String type;
	
	
	
	public void start()
	{
		 System.out.print( "vehicle should start"); 
		 System.out.print("\n");
	 }
	
	 public void stop()
	 {
		 System.out.print( "vehicle should stop"); 
		 System.out.print("\n");
	 }
	
	 public static void main(String []args)
	 {
		// Following statement would create an object vehicle
			VehicleClass toyota= new VehicleClass();
			toyota.start();
			VehicleClass honda= new VehicleClass();
			honda.start();
	 }
	 
	
}
