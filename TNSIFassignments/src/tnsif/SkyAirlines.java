package tnsif;

import java.util.Scanner;

class Customer {
   private String name;
   private String source;
   private String destination;
   public Customer(String name, String source, String destination) {
       this.name = name;
       this.source = source;
       this.destination = destination;
   }

   public String getMessage() {
       return "Dear " + name + ", welcome onboard with service from " + source + " to " + destination + ". Thank you for choosing Sky Airlines. Enjoy your flight.";
   }
}

public class SkyAirlines {
	public static void main(String[] args)
	{
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

       System.out.print("Enter name: ");
       String name = scanner.nextLine();

       System.out.print("Enter source: ");
       String source = scanner.nextLine();

       System.out.print("Enter destination: ");
       String destination = scanner.nextLine();

       Customer customer = new Customer(name, source, destination);
       System.out.println(customer.getMessage());

       scanner.close();
	
}

}
