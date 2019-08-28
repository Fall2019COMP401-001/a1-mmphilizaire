package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//read in number of items
		int count1 = scan.nextInt();
		
		//creates arrays for item names
		String[] items = new String[count1];
		
		//read items names and add to array
		for(int i = 0; i < count1; i++) {
			items[i] = scan.next();
			scan.nextDouble();
		}
		
		//read in number of customers
		int count2 = scan.nextInt();
		
		//creates arrays for # customers and # bought for each item
		int[] customers = new int[count1];
		int[] total = new int[count1];
		
		for(int i = 0; i < count2; i++){
			//ignore name
			scan.next();
			scan.next();
			
			//read number of items
			int num = scan.nextInt();

			for(int j = 0; j < num; j++) {
				//read quantity and item
				int quant = scan.nextInt();
				String item = scan.next();
				
				//find index of item
				int index = indexOf(items, item);
				
				//update arrays
				customers[index] += 1;
				total[index] += quant;
			
			}
		}
		
		//close scanner
		scan.close();
		
		//print output
		for(int i = 0; i < items.length; i++) {
			if(total[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			}
			else {
				System.out.println(customers[i] + " customers bought " + total[i] + " " + items[i]);
			}
		}	
	}
	
	public static int indexOf(String[] items, String item) {
		for(int i = 0; i < items.length; i++) {
			if(items[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}
	
}
