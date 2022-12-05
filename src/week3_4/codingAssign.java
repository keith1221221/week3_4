package week3_4;

public class codingAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A
		int [] ages =  {3, 9, 23, 64, 2, 8, 28, 92};
		int length = ages.length -1;
		int diff = ages[0] - ages[length];
		
		
		System.out.println("The first answer is " + diff);
		
		int [] ages2 =  {3, 9, 23, 64, 2, 8, 28, 92, 17};
		int length2 = ages2.length -1;
		int diff2 = ages2[0] - ages2[length2];
		
		System.out.println("The second answer is " + diff2);
	//B	
		double sum = 0.0;
	for (int age : ages2) {
		sum += age;
	}
	//C
	double avg = sum / ages2.length;
	System.out.println("The average is " + avg);
	
	// Question 2
	//A
	int sum2 = 0;
	double avg2 = 0.0;
	String [] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	for ( String name : names) {
		sum2 += name.length();
		avg2 = sum2 / names.length;
	}
	System.out.println("The average is " + avg2);
	//B
	String concat = "";
	for (String name: names) {
		 concat += name;
		
	}
	System.out.println(" " + concat + " ");
	
	//3
//	int length = ages.length -1;
	
	//4 
//	arrayName[0];
	
	//5
	int [] namesLengths = new int [ages.length];
	for ( String name : names) {
		int nameLength = name.length();
		System.out.println(nameLength);
	
		
	}
	
	//6
//		int total6 = 0;
//	for (int len : namesLengths) {
//		total6 += len;
//		System.out.println(len);
//	}//System.out.println(total6);
	
	//7
	
//	public static String concatWord(String word, int n) {
		
//	}
	
//8
	String fullName = createFullName("Bob","ross");
	System.out.println(fullName);
	
	

	}
	//8
	public static String createFullName( String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;}
		
		//9
		public static boolean sumOfInts( int[] numbers) {
			int sum = 0;
			for ( int num : numbers) {
				sum += num;}
			
				if (sum > 100) {
					return true;
				}
				else {
					return false;}
			}
		//10
		public static double average(int [] input) {
			int sum = 0;
			double avg = 0.0;
			for ( double num : input) {
				sum += num;
			 avg = sum / input.length;
			}
			return avg;
		}
		//11
		public static boolean greaterThan(double [] input, double [] input2) {
			double sum = 0;
			for ( double num1 : input) {
				sum += num1;}
		
		double sum2 = 0;
		for ( double num2 : input2) {
			sum2 += num2;}
		if ( sum > sum2) {
			return true;
		}
		else {
			return false;
		}
	}
		//12
		public static boolean willBuyDrink( boolean isHotOutside, double moneyInPocket) {
			if ( isHotOutside == true && moneyInPocket > 10) {
				return true;
			}
			else {
				return false;
			}
		}
}
