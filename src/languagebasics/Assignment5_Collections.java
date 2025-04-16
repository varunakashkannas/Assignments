package languagebasics;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections {
	public static void main(String args[]) {

		/**
		 * problem: Inside this Excel There are 3 TestCases with each Test case having 3
		 * rows of data. Now, Create Map<String, Map<String,String>> to store all the
		 * data and Print the data from Product details > Supplier Name > Office Depot
		 * from the Map<String, Map<String,String>>
		 */

		// Product Table
		Map<String, String> firstProduct = new HashMap<String, String>();
		firstProduct.put("Product ID", "P001");
		firstProduct.put("Name", "Laptop");
		firstProduct.put("Category", "Electronics");
		firstProduct.put("Price", "$1,200");
		firstProduct.put("Stock Quantity", "50");
		firstProduct.put("Supplier", "Tech Supplies");
		firstProduct.put("Warranty", "2 years");
		firstProduct.put("Rating", "4.5");
		firstProduct.put("Manufacturing Date", "15-01-2023");
		firstProduct.put("Expiry Date", "15-01-2025");

		Map<String, String> secondProduct = new HashMap<String, String>();
		secondProduct.put("Product ID", "P002");
		secondProduct.put("Name", "deskchair");
		secondProduct.put("Category", "furniture");
		secondProduct.put("Price", "$150");
		secondProduct.put("Stock Quantity", "100");
		secondProduct.put("Supplier", "Office Depot");
		secondProduct.put("Warranty", "1 year");
		secondProduct.put("Rating", "4");
		secondProduct.put("Manufacturing Date", "02-10-2023");
		secondProduct.put("Expiry Date", "N/A");

		Map<String, String> thirdProduct = new HashMap<String, String>();
		thirdProduct.put("Product ID", "P003");
		thirdProduct.put("Name", "coffee maker");
		thirdProduct.put("Category", "kitchen");
		thirdProduct.put("Price", "$75");
		thirdProduct.put("Stock Quantity", "200");
		thirdProduct.put("Supplier", "Kitchen World");
		thirdProduct.put("Warranty", "6 Months");
		thirdProduct.put("Rating", "4.2");
		thirdProduct.put("Manufacturing Date", "20-03-2023");
		thirdProduct.put("Expiry Date", "20-03-2024");

		List<Map<String, String>> products = new LinkedList<Map<String, String>>();
		products.add(firstProduct);
		products.add(secondProduct);
		products.add(thirdProduct);

		// Student Table

		Map<String, String> student1 = new HashMap<String, String>();
		student1.put("Name", "Jhon Doe");
		student1.put("Age", "20");
		student1.put("Gender", "Male");
		student1.put("Roll Number", "S12345");
		student1.put("Grade", "A");
		student1.put("Major", "Computer Science");
		student1.put("GPA", "3.8");
		student1.put("Email", "john@example.com");
		student1.put("Contact Number", "9999997777");
		student1.put("Address", "123 Elm St");

		Map<String, String> student2 = new HashMap<String, String>();
		student2.put("Name", "Jane Smith");
		student2.put("Age", "21");
		student2.put("Gender", "Female");
		student2.put("Roll Number", "S12346");
		student2.put("Grade", "B");
		student2.put("Major", "Mathematics");
		student2.put("GPA", "3.5");
		student2.put("Email", "jane@example.com");
		student2.put("Contact Number", "9876665666");
		student2.put("Address", "456 Oak St");

		Map<String, String> student3 = new HashMap<String, String>();
		student3.put("Name", "Mike Brown");
		student3.put("Age", "22");
		student3.put("Gender", "Male");
		student3.put("Roll Number", "S12347");
		student3.put("Grade", "A");
		student3.put("Major", "Physics");
		student3.put("GPA", "3.9");
		student3.put("Email", "mike@example.com");
		student3.put("Contact Number", "8787876546");
		student3.put("Address", "789 Pine St");

		List<Map<String, String>> students = new LinkedList<Map<String, String>>();
		students.add(student1);
		students.add(student2);
		students.add(student3);

		// Employee table

		Map<String, String> emp1 = new HashMap<String, String>();
		emp1.put("Employee ID", "E001");
		emp1.put("Name", "Alice Green");
		emp1.put("Age", "30");
		emp1.put("Gender", "Female");
		emp1.put("Department", "Engineering");
		emp1.put("Position", "Software Engineer");
		emp1.put("Salary", "75,000");
		emp1.put("Email", "alice@example.com");
		emp1.put("Contact Number", "9876543213");

		Map<String, String> emp2 = new HashMap<String, String>();
		emp2.put("Employee ID", "E002");
		emp2.put("Name", "Bob Johnson");
		emp2.put("Age", "35");
		emp2.put("Gender", "Male");
		emp2.put("Department", "Marketing");
		emp2.put("Position", "Marketing Manager");
		emp2.put("Salary", "85,000");
		emp2.put("Email", "bob@example.com");
		emp2.put("Contact Number", "9876543214");

		Map<String, String> emp3 = new HashMap<String, String>();
		emp3.put("Employee ID", "E003");
		emp3.put("Name", "Carol White");
		emp3.put("Age", "28");
		emp3.put("Gender", "Female");
		emp3.put("Department", "Sales");
		emp3.put("Position", "Sales Executive");
		emp3.put("Salary", "65,000");
		emp3.put("Email", "carol@example.com");
		emp3.put("Contact Number", "9876543215");

		List<Map<String, String>> employees = new LinkedList<Map<String, String>>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);

		Map<String, List<Map<String, String>>> alldetails = new LinkedHashMap<String, List<Map<String, String>>>();
		alldetails.put("product details", products);
		alldetails.put("student details", students);
		alldetails.put("employee details", employees);

		System.err.println("Assignment 5 collections list, Set & Map");
		System.out.println();
		System.out.println(" All product details " + alldetails.get("product details"));
		System.out.println();
		System.out.println(" All student details " + alldetails.get("student details"));
		System.out.println();
		System.out.println(" All employee details " + alldetails.get("employee details"));
		System.out.println();

		// calling using key value as HashMap allows only get(key value);
		System.out.println(" The supplier from second product is " + alldetails.get("product details").get(1).get("Supplier"));

	}
}
