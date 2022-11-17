package week3day1;

public class PalindromeString {

	public static void main(String[] args) {
		String word="madam";
		char[] charArray=word.toCharArray();
		String rev="";
		for (int i = charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];
			}
		if(word.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			 System.out.println("Not palindrome");
		}
	}


		
	
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */


	}


