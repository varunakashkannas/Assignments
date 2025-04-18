package assigments;

public class Assignment1_DataTypes {
	public static void main(String[] args) {
		// 1. Temperature of a city in degrees Celsius: 25.5
		float temp = 25.5f;
		System.out.println(" 1. Temperature of a city in degrees Celsius: " + temp);
		// 2. Whether a customer has placed an order: true or false
		Boolean order = true;
		Boolean not_order = false;
		System.out.println(" 2. Whether a customer has placed an order: " + not_order);
		// 3. Person's phone number: "123-456-7890"
		String PhoneNumber = "123-456-7890";
		System.out.println(" 3. Person's phone number: " + PhoneNumber);
		// 4. Amount of money in a customer's bank account: 1000.50
		float amt = 1000.50f;
		System.out.format(" 4. Amount of money in a customer's bank account: %.2f%n",amt);
		// 5. Person's email address: "john.doe@example.com"
		String email = "john.doe@example.com";
		System.out.println(" 5. Person's email address: " + email);
		// 6. Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double lat = 37.7749;
		double lon = -122.4194;
		System.out.println(" 6. Coordinates of a location (latitude, longitude): " + lat + "," + lon);
		// 7. Person's marital status: true or false
		Boolean Married = true;
		Boolean unmarried = false;
		System.out.println(" 7. Person's marital status: " + Married);
		// 8. Person's occupation: "Software Engineer"
		String work = "Software Engineer";
		System.out.println(" 8. Person's occupation: " + work);
		// 9. Person's favourite colour: "Blue"
		String color = "Blue";
		System.out.println(" 9. Person's favourite colour: " + color);
		// 10.Current year: 2023
		short year = 2023;
		System.out.println(" 10. Current year: " + year);
		// 11.Number of followers on a social media platform: 1,000,000
		int count = 1000000;
		System.out.println(" 11. Number of followers on a social media platform: " + count);
		// 12.Rating of a movie: 7.5
		float rate = 7.5f;
		System.out.println(" 12. Rating of a movie: " + rate);
		// 13.Person's blood type: 'A'
		char BloodType = 'A';
		System.out.println(" 13. Person's blood type:" + BloodType);
		// 14.Title of a book: "To Kill a Mockingbird"
		String stat = "To Kill a Mockingbird";
		System.out.println(" 14. Title of a book: " + stat);
		// 15.Number of employees in a company: 500
		short emp = 500;
		System.out.println(" 15. Number of employees in a company:" + emp);
		// 16.Time of an event: 2:30 PM
		double time = 2.30;
		System.out.println(" 16. Time of an event: " + time + " PM");
		// 17.Name of a country: "United States"
		String country = "United States";
		System.out.println(" 17. Name of a country: " + country);
		// 18.Person's eye color: "Brown"
		String col = "Brown";
		System.out.println(" 18. Person's eye color: " + col);
		// 19.Person's birthplace: "New York City"
		String birthplace = "New York City";
		System.out.println(" 19. Person's birthplace: " + birthplace);
		// 20.Distance between two cities: 200.5
		float distance = 200.5f;
		System.out.println(" 20. Distance between two cities:" + distance);

	}
}

/**
 2. Whether a customer has placed an order: true or false
 
      Boolean order = true;
      Boolean not_order = false;
      System.out.println(" 2. Whether a customer has placed an order: " + not_order);
      OUTPUT: 2. Whether a customer has placed an order: false
      DOUBT: Is the above  2 varaible(order & not_order) defining is correct way
                       OR
             Boolean Order = true; (is enough, which means order = false denotes not ordered)


16.Time of an event: 2:30 PM

		double time = 2.30;
		System.out.println(" 16. Time of an event: " + time + " PM");
		OUTPUT: 16. Time of an event: 2.3 PM
		EXPECTED:16. Time of an event: 2.30 PM 
		DOUBT: which data type we need to use when colon  : coming in between digits.
		
4. Amount of money in a customer's bank account: 1000.50

		float amt = 1000.50f;
		System.out.println(" 4. Amount of money in a customer's bank account: " + amt);
		OUTPUT:  4. Amount of money in a customer's bank account: 1000.5
		EXPECTED:  4. Amount of money in a customer's bank account: 1000.50
		DOUBT: i have used format print print option to get the two decimal points, but getting error, pls correct me
		
		float amt = 1000.50f;
		System.out.format(" 4. Amount of money in a customer's bank account: %.2f%n",amt);--> not working
		System.out.format(" 4. Amount of money in a customer's bank account:" + %.2f amt);--> not working
		
		      
		*/

