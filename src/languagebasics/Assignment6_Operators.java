package languagebasics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/** Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
marks [75, 80, 82] Add 10 marks to each students using assignment operators and
store it into another array, after adding 10 marks identify the average marks of all
students */

public class Assignment6_Operators {
	public static void main(String[] args) {
		//Using Array
		
		String [] student = new String [3];
				student[0] = "Suresh";
		student[1] = "Mahesh";
		student[2] = "Naresh";
		
		int [] marks = new int[3];
		marks[0] = 75; marks[0]+=10;
		marks[1] = 80; marks[1]+=10;
		marks[2] = 82; marks[2]+=10;
		
		int [] newMarks = new int[3];
		newMarks[0] = marks[0];
		newMarks[1] = marks[1];
		newMarks[2] = marks[2];
		
		float avg = ((newMarks[0]+newMarks[1]+newMarks[2])/3);
		
		System.err.println( " Assignement6_Operators ");
		System.out.println();
		System.out.println(" The new marks are " + newMarks[0] + "," + newMarks[1] + ","+ newMarks[2]);
		System.out.println(" The average of marks is " + avg);
		System.out.println();
		
		// another way using ArrayList
		
		System.err.println("Using Array list");
		
		List<Integer> mark = new ArrayList<Integer>();
		mark.add(0,75);
		mark.add(1,80);
		mark.add(2,82);
		
		List<String> stu = new ArrayList<String>();
		stu.add(0,"Suresh");
		stu.add(1,"Ramesh");
		stu.add(2,"Naresh");
		
			
		
		Map<String, Integer> merge = new LinkedHashMap<String, Integer>();
		int m1,m2,m3; 
		merge.put(stu.get(0),m1=mark.get(0)+10);
		merge.put(stu.get(1),m2=mark.get(1)+10);
		merge.put(stu.get(2),m3=mark.get(2)+10);
		float avg1 = ((m1+m2+m3)/3);
		
		System.out.println("The Student name & their Marks are " + merge);
		System.out.println();
		System.out.println(" The average of marks is " + avg1 );
		
		
	}

}
