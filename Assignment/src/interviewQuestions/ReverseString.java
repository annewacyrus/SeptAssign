package interviewQuestions;

public class ReverseString {

	public static void main(String[] args) {
		String word = "xyz";
		//word.toCharArray();//mention that its a character Array and where to save it
		char[]myArray = word.toCharArray();
	
	
		//for(int i=0;i<word.length();i++) {
		//System.out.println(myArray[i]);	//i-index
		
	//for(int i=word.length()-1; i>=0; i--) {
		//System.out.println(myArray[i]);	
		
		String reverseWord = "";//create a string variable-reverseWord=empty
		for(int i=word.length()-1; i>=0; i--) {
		reverseWord = reverseWord + myArray[i];	
			
		System.out.println("Reverse word:"+ reverseWord);
		
		if(word.equalsIgnoreCase(reverseWord)) {
			System.out.println("Palindrome");
		}
		else {System.out.println("Not Palindrome");
		}
		
		
		}
		
		}
		
		
		}


