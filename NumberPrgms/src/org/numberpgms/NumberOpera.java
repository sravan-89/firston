package org.numberpgms;

public class NumberOpera {
public static void main(String[] args) {

	int num = 1224;
	int res = 1;
	while (num >0) {
		int a = num%10;
		res = res*a;
		num = num/10;
	}
	System.out.println(res);
	
	//Armstrong number 
	
//	int  a = 343;
//	int armNo = a;
//	int res = 0;
//	while (a>0) {
//		int b =a%10;
//		res = res+(b*b*b);
//		a= a/10;
//			}
//	if (armNo == res) {
//		System.out.println("the given number is armstrong :" +res);
//	} else {
//       System.out.println("the given number is not armstrong :" +res );
//	}
	//digit count of a number 
//	int a  = 10000; 
//	int res = 0;
//	while (a>0) {
//		res++;
//		a=a/10;
//	}
//		System.out.println(res);
		
	//fibannoic series
	
//	int a = 0, b=1;
//	for (int i = 1; i <10; i++) {
//		int c =a+b;
//		System.out.println(c);
//		a=b;
//		b=c;
	//reverse of number	 
//	int num =3475;
//	int res = 0;
//	while (num >0) {
//		int a = num %10;
//		res = (res*10)+a;
//		num = num/10;
//		}
//	System.out.println(res);
	
	//palindrome or not
//	int num = 343;
//	int pal = num;
//	int res = 0;
//	while (num>0) {
//		int a = num%10;
//		res = (res*10)+a;
//		num = num/10;
//		}
//	if (pal ==res) {
//		System.out.println("the given no is palindrome " +res);
//	} else {
//		System.out.println("the given no is not palindrome " +res);
//
//	}
	//sum of digits in given number 
//	int num = 8211;
//	int res = 0;
//	while (num>0) {
//		int a = num%10;
//		res = res+a;
//		num = num/10;
//	}
//	System.out.println(res);
}	
}

