package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static Random r=new Random();;
static int smallestNum=50;
static int biggestNum=0;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		
		String[] names= {"1", "2","3","4","5"};
		
	
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2]="Jordan";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//6. make an array of 50 integers
		int [] numbers = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=r.nextInt(51);
		}
		//8. without printing the entire array, print only the smallest number in the array
	
	for(int number:numbers) {
	if(smallestNum>number) {
		smallestNum=number;
	}
	
	}
		System.out.println(smallestNum);
		
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		for(int number:numbers) {
			if(biggestNum<number) {
				biggestNum=number;
			}
			
			}
				System.out.println(biggestNum);
	}
}

