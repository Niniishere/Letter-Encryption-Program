// -------------------------------------------------------
// Assignment 1 Question 2
// Written by: Hao Yi Liu (40174210)
// Date: 05/02/2021
// For COMP 248 Section W 2204 - Winter 2021
// -------------------------------------------------------
import java.util.Scanner;
public class Question2final 
{
//This program prompts the user for two words with 3 characters and will output the encrypted word
	public static void main(String[] args)
	{
		System.out.println("**************************************");
		System.out.println("Welcome to Letter Encryption Program"); //printing the welcome message
		System.out.println("**************************************");
		Scanner in=new Scanner(System.in); //inputing the words from the user
		System.out.println("\nEnter the first word with 3 characters: ");
		String word1=in.next(); //inputing user's first word using the variable word1 to describe the first word
		System.out.println("Enter the second word with 3 characters: ");
		
		String word2=in.next(); //using the variable word2 to describe the second word
		System.out.println("\nThe length of the word " + word1 + " is "+ word1.length()+"."); //printing the length of the first word
		System.out.println("The length of the word " + word2 + " is "+ word2.length()+"."); //printing the length of the first word
		String result1=  ""+word1.charAt(2)+word2.charAt(2)+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1); //merging the two words together and creating a new word
		System.out.println("\nThe encrypted word is: " +result1+ "."); //displaying the new word
		System.out.println("\nGenerating the encrypted word... ");
		String result2=  ""+word1.charAt(1)+word2.charAt(1)+word1.charAt(0)+word2.charAt(0)+word1.charAt(2)+word2.charAt(2); //Swapping the digits
		System.out.println("\nThe encrypted word is: " +result2 +"."); //displaying the new encrypted word
		
		System.out.println("\nThank you for using Letter Encryption Program! "); //displaying a farewell message
		
		

	}

}
