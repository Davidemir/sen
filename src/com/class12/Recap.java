package com.class12;

public class Recap {

	public static void main(String[] args) {
		
		int [][] arr = {
				
				{ 1, 2, 3},
				{ 10, 20 ,30 },
				{ 100, 200 ,300 },
		
		};
		System.out.println("............. with advanced loop..............");
		
		for(int[] numbers: arr) {//how many arrays we have?
			
			for(int num: numbers) {//0 //1  //2
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		System.out.println("................. with for loop................");
		//loop through each element inside 2D Array==> each element=array
		for (int i=0; i<arr.length; i++) {
			//loop through each single array
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
