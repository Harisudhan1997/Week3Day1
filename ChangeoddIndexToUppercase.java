package week3day1;

public class ChangeoddIndexToUppercase {
	public static void main(String[] args) {
		String word="changeme";
				char[]charArray=word.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					if(i%2!=0) {
						System.out.println(Character.toUpperCase(charArray[i]));
					}
						else {
							System.out.println(charArray[i]);
						}
					}
					
				}
		
	}


