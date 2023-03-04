package sampleproject;

public class SimpleProgram {

	public static void main(String[] args) {
		
String actual = "selenium";
		
		System.out.println(actual.length());
		
		String reverse ="";
		
		for(int i = actual.length()-1; i>=0; i--) {
			
		reverse= reverse+actual.charAt(i);
		}
		
        System.out.println("actaul string: " + actual);
        
        System.out.println("reverse string: " + reverse);
	}

	}


