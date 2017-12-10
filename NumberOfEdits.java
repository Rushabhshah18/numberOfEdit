package developingInterestInCoding;

import java.util.Scanner;
/*
 * 
 * @Author Rushabh Shah
 */
public class NumberOfEdits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string which you want it as base");
		String str1=sc.nextLine();
		System.out.println("Enter second string which you want to be compared");
		String str2=sc.nextLine();
		
		//converting string to character array
		char [] c1=str1.toCharArray();
		char [] c2=str2.toCharArray();
		
		 //intializing the variable to count the edits required
		int numberOfEdits=0;
		
		//checking if the length is different it can generate errors
		if(c1.length<c2.length) {
			
			//if the length is different then creating new variable
			//which stores difference
			int len=c2.length-c1.length;
			
			//indexing through the character array
		for(int index=0;index<str1.length();index++) {
		
			//checking if the values of the characters at given indexes are same or not
				if(c1[index]!=c2[index]) {
					numberOfEdits++;
				} 
		}
		numberOfEdits=numberOfEdits+len;
		}else {
			
			//if the length is different then creating new variable
			//which stores difference
			int len=c1.length-c2.length;
			for(int index=0;index<str2.length();index++) {
				
				//checking if the values of the characters at given indexes are same or not
					if(c1[index]!=c2[index]) {
						numberOfEdits++;
					} 
				
			}
			//adding the difference of the size 
			//because the difference in size is also cause of change
			numberOfEdits=numberOfEdits+len;
		}
		
		System.out.println("changes required are:"+numberOfEdits);
	}

}
