package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac object) {
		switch(object) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "taurus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "cancer");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "scorpio");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "sagittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "pisces");
			break;
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac[] options = {Zodiac.ARIES, Zodiac.TAURUS, Zodiac.GEMINI, Zodiac.CANCER, Zodiac.LEO, Zodiac.VIRGO, 
				Zodiac.LIBRA, Zodiac.SCORPIO, Zodiac.SAGITTARIUS, Zodiac.CAPRICORN, Zodiac.AQUARIUS, Zodiac.PISCES};

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		Zodiac choice = options[input];
		horoscope(choice);
	}
}
