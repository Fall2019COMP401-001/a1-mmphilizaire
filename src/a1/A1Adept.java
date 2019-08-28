package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//read in number of items
		int count1 = scan.nextInt();
		
		//creates arrays for item names and price
		String[] items = new String[count1];
		double[] prices = new double[count1];
		
		//read items and prices and add to array
		for(int i = 0; i < count1; i++) {
			items[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		
		//read in number of customers
		int count2 = scan.nextInt();
		
		//creates arrays for names + cost
		String[] first = new String[count2];
		String[] last = new String[count2];
		double[] costs = new double[count2];
		
		for(int i = 0; i < count2; i++){
			//input first and last name
			first[i] = scan.next();
			last[i] = scan.next();
			
			//read number of items
			int num = scan.nextInt();
			//create double for sum
			double sum = 0;
			for(int j = 0; j < num; j++) {
				//read quantity and name of item
				int quant = scan.nextInt();
				String item = scan.next();
				//find price of item and insert into array
				sum += quant * prices[indexOf(items, item)];
			}
			costs[i] = sum;
		}
		
		//close scanner
		scan.close();
		
		//prints output
		int max = maxIndex(costs);
		int min = minIndex(costs);
		double avg = average(costs);
		System.out.println("Biggest: " + first[max] + " " + last[max] + " (" + String.format("%.2f", costs[max]) + ")");
		System.out.println("Smallest: " + first[min] + " " + last[min] + " (" + String.format("%.2f", costs[min]) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
	}
	
	public static int indexOf(String[] items, String item) {
		for(int i = 0; i < items.length; i++) {
			if(items[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}
	
	public static int maxIndex(double costs[]) {
		double max = costs[0];
		int maxIndex = 0;
		for(int i = 1; i < costs.length; i++) {
			if(costs[i] > max) {
				max = costs[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
	public static int minIndex(double costs[]) {
		double min = costs[0];
		int minIndex = 0;
		for(int i = 1; i < costs.length; i++) {
			if(costs[i] < min) {
				min = costs[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
	
	public static double average(double costs[]) {
		double sum = 0;
		for(int i = 0; i < costs.length; i++) {
			sum += costs[i];
		}
		return (sum / costs.length);
	}
	
	
}
