package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Reads in number of customers
		int count = scan.nextInt();
		
		//Create arrays to store customer first and last name
		String[] first = new String[count];
		String[] last = new String[count];
		
		//Create array to store cost
		double[] costs = new double[count];
		
		//Reads input for each customer
		for(int i = 0; i < count; i++) {
			//adds first + last name to array
			first[i] = scan.next();
			last[i] = scan.next();
			
			//gets number of items
			int items = scan.nextInt();
			
			//computes the total cost and adds to array
			double sum = 0;
			for(int j = 0; j < items; j++) {
				int num = scan.nextInt();
				scan.next();
				double cost = scan.nextDouble();
				sum += num*cost;
			}
			costs[i] = sum;
		}
		
		//prints output
		for(int i = 0; i < count; i++) {
			System.out.println(first[i].charAt(0) + ". " + last[i] + ": " + String.format("%.2f", costs[i]));
		}
		
	}
}
