
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "November 15th";
		String dadsBirthday = "December 31st";
		String myBirthday = "April 11th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String input = JOptionPane.showInputDialog("Which birthday would you like?");
		// 3. Print out what the user typed
		System.out.println(input);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(input.equals("mom")) {
		System.out.println("November 15th");	
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		if(input.equals("dad")) {
		System.out.println("December 31st");	
		}
		// 6. if user asked for your name
			// print myBirthday
		if(input.equals("Your birthday")) {
		System.out.println("April 11th");	
		}
		//7. otherwise print "Sorry, I don't remember that person's birthday!"
		if(input.equals("Mine")) {
		System.out.println("Sorry, I don't remember that person's birthday!");	
		}
		
		
	} 
}
