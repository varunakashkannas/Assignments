package assigments;

public class Assignment7_ConditionalStatements {
	public static void main(String[] args) {
		String customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed = true;
		float debtToIncomeRatio = 35.0f;
		System.err.println(" Assignment 7 Conditional Statements");
		System.out.println();

		if (creditScore >= 750) {
			System.out.println(customerName + "...Your Loan is approved");
		} else if (creditScore >= 650 && creditScore <= 750 && income > 50000) {
			if (isEmployed == true) {
				if (debtToIncomeRatio < 40) {
					System.out.println(customerName + "...Your Loan is approved");
				} else {
					System.out.println(customerName + " ...Sorry! Your Loan is denied");
				}
			} else {
				System.out.println(customerName + "...Sorry! Your Loan is denied");
			}
		}

		else {
			System.out.println(customerName + "...Sorry! Your Loan is denied");
		}

	}
}
