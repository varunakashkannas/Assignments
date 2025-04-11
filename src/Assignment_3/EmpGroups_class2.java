package Assignment_3;

//Print using object creation of class1

public class EmpGroups_class2 {
	public static void main(String[] args) {
		Employees_class1 obj = new Employees_class1(); //Doubt: can object name be anything that user can provide
		
		String[] Empname = {obj.name[0],obj.name[1],obj.name[2]}; //keeping object name as reference, copying here in class 2
		int[] EmpID = {obj.id[0],obj.id[1],obj.id[2]};
		
		System.err.println("Assignment_3 10/APR/2025");
		System.out.println();
		System.out.println("Employee Name:" + Empname[0] + "," + " Employee Id:" + EmpID[0]);//since the value is stored class2 variables Empname & EmpID, calling directly
		System.out.println("Employee Name:" + Empname[1] + "," + " Employee Id:" + EmpID[1]);
		System.out.println("Employee Name:" + Empname[2] + "," + " Employee Id:" + EmpID[2]);

	}

}

//Print using multiple inheritance child class 2 parent as class 1
/**public class EmpGroups_class2 extends Employees_class1 {
	public static void main(String[] args) {
		EmpGroups_class2 obj = new EmpGroups_class2();
		String[] Empname = {obj.name[0],obj.name[1],obj.name[2]}; //keeping object name as reference, copying here in class 2
		int[] EmpID = {obj.id[0],obj.id[1],obj.id[2]};
		
		System.err.println("Assignment_3 10/APR/2025");
		System.out.println();
		System.out.println("Employee Name:" + Empname[0] + "," + " Employee Id:" + EmpID[0]);//since the value is stored class2 variables Empname & EmpID, calling directly
		System.out.println("Employee Name:" + Empname[1] + "," + " Employee Id:" + EmpID[1]);
		System.out.println("Employee Name:" + Empname[2] + "," + " Employee Id:" + EmpID[2]);
		
	}
} */
