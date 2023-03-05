package sampleproject;

public class Vowels {

	public static void main(String[] args) {
		
		String s="mayuri jadahv prabhakar";
		System.out.println(s.length());
		int count =0;
		for(int i=0; i<s.length();i++) {
		char s1 = s.charAt(i);
		if(s1=='a'|| s1=='e' || s1=='i' || s1=='o' || s1=='u') {
			count++;
			System.out.println(s.charAt(i));
			}
		}
		
		System.out.println("the given string has "+ count +" vowels");
	}

}
