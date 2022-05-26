package interviewQuestions;

public class MultiplicationIfElse {

	public static void main(String[] args) {
		//print 1 to N
		//if the number is multiple of 3 print "FIZZ" instead of the number
		//if the number is multiple of 5 print "BUZZ" instead of the number
		//if the number is multiple of 3 and 5 print "FIZZ BUZZ" instead 
		                                                  //of the number

	int N = 20;
	for(int i=1; i<=N; i++){
		//System.out.println(i);
		 if(i%5==0 && i%3==0) {        //if(i%15==0)is divisible by both 3&5
			System.out.println("FIZZ BUZZ");//the combo becomes 1st and the rest else if
		}
		
		 else if(i%3==0) {
			System.out.println("FIZZ");
			}
		else if(i%5==0) {
			System.out.println("BUZZ");
		}
		
		else{
			System.out.println(i);
			
			
		}
	}
	
	
	
	
	
	
	
	}




}
