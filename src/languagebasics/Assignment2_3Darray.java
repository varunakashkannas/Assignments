package languagebasics;

public class Assignment2_3Darray {
	public static void main(String[] args) {
	
	String [][][] marks = new String [5][2][6];
	marks [0][0][0] = "Mathematics I";
	marks [0][0][1] = "Physics";
	marks [0][0][2] = "Chemistry";
	marks [0][0][3] = "Computer Programming";
	marks [0][0][4] = "Engineering Drawing";
	marks [0][0][5] = "Basic Electrical Eng.";
	
	marks [0][1][0] = "Pass(78)";
	marks [0][1][1] = "Pass(85)";
	marks [0][1][2] = "Fail(21)";
	marks [0][1][3] = "Pass(74)";
	marks [0][1][4] = "Pass(88)";
	marks [0][1][5] = "Pass(79)";
	
	marks [1][0][0] = "Mathematics II";
	marks [1][0][1] = "Mechanics";
	marks [1][0][2] = "Environmental Sci.";
	marks [1][0][3] = "Basic Electronics";
	marks [1][0][4] = "Engineering Physics";
	marks [1][0][5] = "Engineering Graphics";
	
	marks [1][1][0] = "Pass(82)";
	marks [1][1][1] = "Pass(77)";
	marks [1][1][2] = "Pass(93)";
	marks [1][1][3] = "Fail(19)";
	marks [1][1][4] = "Fail(24)";
	marks [1][1][5] = "Pass(90)";
	
	marks [2][0][0] = "Data Structures";
	marks [2][0][1] = "Discrete Mathematics";
	marks [2][0][2] = "Digital Electronics";
	marks [2][0][3] = "Operating Systems";
	marks [2][0][4] = "Signals and Systems";
	marks [2][0][5] = "Object-Oriented Prog.";
	
	marks [2][1][0] = "Pass(88)";
	marks [2][1][1] = "Pass(81)";
	marks [2][1][2] = "Pass(76)";
	marks [2][1][3] = "Fail(32)";
	marks [2][1][4] = "Pass(85)";
	marks [2][1][5] = "Pass(78)";
	
	marks [3][0][0] = "Algorithms";
	marks [3][0][1] = "Computer Networks";
	marks [3][0][2] = "Database Systems";
	marks [3][0][3] = "Microprocessors";
	marks [3][0][4] = "Communication Eng.";
	marks [3][0][5] = "Software Engineering";
	
	marks [3][1][0] = "Pass(91)";
	marks [3][1][1] = "Pass(73)";
	marks [3][1][2] = "Fail(19)";
	marks [3][1][3] = "Pass(80)";
	marks [3][1][4] = "Pass(76)";
	marks [3][1][5] = "Pass(87)";
	
	marks [4][0][0] = "Probability & Stats";
	marks [4][0][1] = "MachineLearning";
	marks [4][0][2] = "Compiler Design";
	marks [4][0][3] = "Theory of Computation";
	marks [4][0][4] = "Embedded Systems";
	marks [4][0][5] = "Computer Graphics";
	
	marks [4][1][0] = "Pass(86)";
	marks [4][1][1] = "Pass(88)";
	marks [4][1][2] = "Pass(84)";
	marks [4][1][3] = "Pass(95)";
	marks [4][1][4] = "Pass(73)";
	marks [4][1][5] = "Pass(90)";
	
	System.err.println("Assignment_2 3D Array - 10/APR/2024 ");
	System.out.println("=====================================");
	//System.out.println(marks.length);
	//Print Semester 2 Subject 4 and Subject 5 names.
	System.out.println("Semester 2 Subject 4 is " + marks[1][0][3] + " and Subject 5 is " + marks[1][0][4]);
	//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
	System.out.println("Semester 4 Status/Marks of Subject 3 is " + marks[3][1][2] + " and Semester 4 Status/Marks of Subject 6 is " + marks[3][1][5]);
	
	

	

}
}
