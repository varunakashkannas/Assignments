package languagebasics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {

		/** 1. Create Lists with area of top 5 largest cities. Print the total area of
		 * the 3rd and 4th cities combined.*/

		List<String> city = new ArrayList<String>();
		city.add("mumbai");
		city.add("delhi");
		city.add("chennai");
		city.add("coimbatore");
		city.add("kolkata");

		List<Integer> area = new ArrayList<Integer>();
		area.add(10000);
		area.add(20000);
		area.add(30000);
		area.add(40000);
		area.add(50000);
		System.err.println("Assignment_4 Collections");
		System.out.println();
		System.out.println(" 1) The 3rd and 4th city name is " + city.get(2) + " and " + city.get(3)
				+ "  & Total area of 3rd & 4th city is " + (area.get(2) + area.get(3)));

		/** 2.Create a set of the top 10 most visited tourist attractions in the world
		 * and print out all of them and its size */

		List<String> touristPlaces = new LinkedList<String>();
		touristPlaces.add("A");
		touristPlaces.add("B");
		touristPlaces.add("C");
		touristPlaces.add("D");
		touristPlaces.add("E");
		touristPlaces.add("F");
		touristPlaces.add("G");
		touristPlaces.add("H");
		touristPlaces.add("I");
		touristPlaces.add("J");
		System.out.println(" 2) List of Tourist Places" + touristPlaces + " and Size = " + touristPlaces.size());

		/** 3.Create an array of 10 numbers (any 10 numbers) and print out the Average of
		 * 5th and 6th Value. */
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		numbers.add(600);
		numbers.add(700);
		numbers.add(800);
		numbers.add(900);
		numbers.add(1000);
		numbers.add(100);
		numbers.add(200);
		System.out.println( " 3) The Average of fifth & sixth Value is " + ((numbers.get(4)+ numbers.get(5))/2));
		//System.out.println( " 3) The Average of fifth & sixth Value is " + Average(numbers.get(4), numbers.get(5)));
		
		/** 4. Create a list of the top 5 highest-grossing movies of all time and print out the third
		movie on the list. */
		
		List<String> movies = new LinkedList<String>();
		movies.add("bollywood");
		movies.add("tollywood");
		movies.add("mollywood");
		movies.add("kollywood");
		movies.add("sandalwood");
		System.out.println(" 4) The third movie on the list " + movies.get(2));
		
				
		

	}
}
		
		
		
		
		
		
		
		
		