package org.arrayones;

import java.util.Scanner;

public class ArrayProgr {
	public static void main(String[] args) {
		
		//Rotation of Array 
		int [] a = {1,2,3,4,5};
		int [] rotationArray = new int [a.length];
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter no of Rotation");
		int noofRotation = s.nextInt();
		int totalRotation = noofRotation;
		int i =0;
		while (totalRotation<a.length) {
			rotationArray[i]= a[totalRotation];
			i++;
			totalRotation++;
		}
		totalRotation=0;
		while (totalRotation<noofRotation) {
			rotationArray[i]= a[totalRotation];
			totalRotation++;
			i++;
		}
		for (int j = 0; j < rotationArray.length; j++) {
			System.out.println(rotationArray[j]+" ");
		}
		
		//find the 0 with the next number 
//		int  [] a = {91,0,93,0,95,0};
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i]==0) {
//				sum = a[i-1]+1;
//			} else {
//             sum = a[i];
//			}
//		} 
//		System.out.println(sum);
//		
//		find the missing number form the array 
//		int a[]  = {1,3,4,5,6,7};
//		 int len = a.length+1;
//		 int sum = (len*(len+1))/2;
//		 for (int i = 0; i < a.length; i++) {
//			sum = sum - a[i];
//		}
//		 System.out.println(sum);
//		 
		//to get a duplicate value from given array
		
//		int [] a = {1,2,1};
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}
		
		
		// Array ascending 
	
//		int []a= {-10,3,4,-56,23,2,1};
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i]>a[j]) {
//					int temp = a[i];
//					a[i] =a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		for (int i  = 0;  i< a.length;i ++) {
//			System.out.println(a[i]);
//		}
//	}

	}

}
