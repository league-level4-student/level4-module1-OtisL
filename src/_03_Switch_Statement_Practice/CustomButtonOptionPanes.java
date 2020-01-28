package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("have fun on your last weekend day");
			break;
		case "Monday":
			System.err.println("oh no worst day 5 boring work days for you :(");
			break;
		case "Tuesday":
			System.out.println("4 days to go");
			break;
		case "Wednesday": 
			System.out.println("Halfway there! What will you do for the midway point?");
			break;
		case "Thursday":
			System.out.println("Happy Friday Eve!");
			break;
		case "Friday":
			System.out.println("HAPPY FRIDAY HAVE FUN@!T@^T@N!&*YHFHJOIN RYEGTHE EELEAGUEEGFHB");
			break;
		}
	}
}
