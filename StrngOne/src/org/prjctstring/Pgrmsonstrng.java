package org.prjctstring;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Pgrmsonstrng {
public static void main(String[] args) {

	//number count in given string
	
	String s = "ja2vapr34gra4mme6";
     int sum = 0;

     for (int i = 0; i < s.length(); i++) {
		char c = s.charAt(i);
		
		
		if (c>='0'&&c<='9') {
			int ncv = Character.getNumericValue(c);
			sum = sum+ncv;
		}
	}
	System.out.println("Sum of given numbers from the string : " +sum);
	//string vowels 
//	 String s = "javaprogramee";
//	 int vowelscount = 0;
//	 int conscount = 0;
//	 for (int i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
//			vowelscount++;
//		} else {
//            conscount++;
//		}
//	}
//	System.out.println("No of vowels in the given string :" +vowelscount);
//	System.out.println("No of constants in given string : " +conscount);
	
	// string *
//	String s = "seleneiume";
//	String output = " ";
//	int count = 0;
//	
//	for (int i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (c == 'e') {
//			count++;
//			for (int j = 0; j < count; j++) {
//				output = output+'*';
//				}
//		} else {
//           output = output+c;
//		}
//	}
//	System.out.println(output);
//	String s = "2+3+4-5*20/10";
//	char[] c = s.toCharArray();
//	char d = c[0];
//	int ncv = Character.getNumericValue(d);
//	for (int i = 0; i < c.length; i++) {
//		char e =c[i];
//		switch (e) {
//		case '+':
//			int ncv1 = Character.getNumericValue(c[i+1]);
//			ncv = ncv+ncv1;
//			break;
//		case '-':
//			int ncv2 = Character.getNumericValue(c[i+1]);
//			ncv = ncv-ncv2;
//			break;
//		case '*':
//			int ncv3 = Character.getNumericValue(c[i+1]);
//			ncv = ncv*ncv3;
//			break;
//		case '/':
//			int ncv4 = Character.getNumericValue(c[i+1]);
//			ncv = ncv/ncv4;
//			break;
//		default:
//			break;
//		}
//	}
//	System.out.println(ncv);
//	String s  =  "java programee with selenium is java ";
//	String [] split = s.split(" ");
//	String output = " ";
//	for (String string : split) {
//		for (int i = 0; i < string.length(); i++) {
//			if (i==0) {
//				output = output+Character.toUpperCase(string.charAt(i));
//			} else {
//				output = output+string.charAt(i);
//             }
//		}
//		output = output+" ";
//	}
//	System.out.println(output);
//	String s = "AbC@123gMail.com";
//	String output = " ";
//	for (int i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (Character.isUpperCase(c)) {
//			output = output+Character.toLowerCase(c);
//		} else {
//            output = output+Character.toUpperCase(c);
//		}
//		System.out.println(output);
//	}
	
//	special characters finding 
//	
//	String s  = "abC@!123@fiAl.com";
//	int smallcount = 0;
//	int capscount = 0;
//	int specialcount = 0;
//	int numbercount = 0;
//	String small = "";
//	String caps = "";
//	String special = "";
//	String number = "";
//	for (int i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (c>='a'&&c<='z') {
//			smallcount++;
//			small = small+c;
//		}else if(c>='A'&&c<='Z') {
//		capscount++;
//		caps=caps+c;
//	}else if (c>='0'&&c<='9') {
//		numbercount++;
//		number = number+c;
//	}else {
//	specialcount++;
//	special = special+c;
//	}
//		System.out.println(smallcount +" "+small);
//		System.out.println(capscount +" "+caps);
//		System.out.println(specialcount+" "+special);
//		System.out.println(numbercount+" "+number);
	
		
//	String Occurance 
//	String s =  "java is imp one java will be java java";
//	Map<String, Integer> mp = new LinkedHashMap<String,Integer>();
//	String [] split = s.split(" ");
//	for (String string : split) {
//		if (mp.containsKey(string)) {
//			Integer integer = mp.get(string);
//			mp.put(string, integer+1);
//		} else {
//			mp.put(string,1);
//		}
//	}
//	Set<Entry<String,Integer>> entryset = mp.entrySet();
//	for (Entry<String, Integer> entry : entryset) {
//		System.out.println(entry);
//	}
//	count of string
//	String s =  "javaa";
//	Map<Character, Integer> mp = new LinkedHashMap<Character,Integer>();
//	for (int i = 0; i < s.length(); i++) {
//		char c = s.charAt(i);
//		if (mp.containsKey(c)) {
//			Integer integer = mp.get(c);
//			mp.put(c, integer+1);
//		} else {
//			mp.put(c,1);
//		}
//	}
//	Set<Entry <Character, Integer> > entryset = mp.entrySet();
//	for (Entry<Character, Integer> entry : entryset) {
//		System.out.println(entry);
//	}
	
	//Reverse of a string
//	String s = "java programme";
//	String output = "";
//	String[] split = s.split(" ");
//	
//	for (String string : split) {
//		for (int i = string.length()-1; i >= 0; i--) {
//			char charAt = string.charAt(i);
//			output = output+charAt;
//			}
//	 output = output+" ";
//	}
//	System.out.println(output);
	
	// reverse of a string
	
//	String s = "javaa";
//	String output = "";
//	for (int i = s.length()-1; i >=0; i--) {
//		char charat = s.charAt(i);
//		output = output+charat;
//		}
//	System.out.println("the reverse of given string : "+output + "  yes it is working");
	 
	// given strng is a palindrome or not
	
//	String s =  "smadasmsa";
//	String Output = "";
//	for (int i = s.length()-1; i >=0 ; i--) {
//		char charAt = s.charAt(i);
//		Output = Output+charAt;
//		}
//	if (s.equals(Output)) {
//		System.out.println("The given string is palindrome :"  +Output);
//		
//	} else {
//System.out.println("the given string is not palindrome : "  +Output);
//	}
}

}

