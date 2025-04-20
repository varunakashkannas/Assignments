package assigments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment8_ConditionalStatementsandLoops {
	public static void main(String[] args) {

		List<Integer> transactions = new ArrayList<Integer>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		int cr = 0;	int creditAmt = 0; int susCredit = 0;	
		int dt = 0; int debitAmt = 0; int susDebit = 0;
				
		for (int i = 0; i < 8; i++) 
		{
			if (transactions.get(i) > 0) 
			{cr++;   creditAmt = creditAmt + transactions.get(i);}
			else 
			{dt++;   debitAmt = debitAmt + transactions.get(i);}
		}
		System.err.println(" Assignment_8");
		System.out.println();
		System.out.println(" 1) The total no.of Credit Transactions are " + cr);
		System.out.println("    The total no.of Debit Transactions are " + dt);
		System.out.println();
		System.out.println(" 2) The total Amount Credited " + creditAmt);
		System.out.println("    The total Amount Debited " + debitAmt);
		System.out.println();
		System.out.println(" 3) Total Remaining Balance = " + (creditAmt + debitAmt));
		System.out.println();
		
		for(int j=0; j<8; j++)
		{ if(transactions.get(j) >= 10000) { susCredit++; System.out.println(" 4) Suspicious Credit transaction Amount = " + transactions.get(j));}
		else if (transactions.get(j) <= -10000) { susDebit++; System.out.println("    Suspicious Debit transaction Amount = " + transactions.get(j));}
		}
		System.out.println( "    Total No.of Suspicious Credit = " + susCredit);
		System.out.println( "    Total No.of Suspicious Debit = " + susDebit);
		
		
	}}
		