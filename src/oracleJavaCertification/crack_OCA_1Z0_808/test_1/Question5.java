package oracleJavaCertification.crack_OCA_1Z0_808.test_1;

public class Question5 {

	public static void main(String[] args) {
		
	    int i =100;
	    float f = 100.100f;
	    double d = 123;
	    
	    // Which of the following assignments won't compile?
	    
	    // i = f; Not compile because required casting
	    
	    f = i;
	    
	    d = f;
	    
	    // f = d; Not compile because required casting
	    
	    d = i;
	    
	    // i = d; Not compile because required casting

	}

}
