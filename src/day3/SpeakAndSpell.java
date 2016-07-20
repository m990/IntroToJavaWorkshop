package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		 speak("Mandlebrot");
		 String answer = JOptionPane.showInputDialog("Spell what you heard.");
		// 2. Catch the user's answer in a String
		
		// 3. If the user spelled the word correctly, speak "correct"
		 if (answer.equals("Mandlebrot")){
			 speak("Correct.");
		 }
		 else{
			 speak("Wrong.");
		 }
		 speak("Mediocre");
		 String answer2 = JOptionPane.showInputDialog("Spell what you heard.");
		// 2. Catch the user's answer in a String
		
		// 3. If the user spelled the word correctly, speak "correct"
		 if (answer2.equals("Mediocre")){
			 speak("Correct.");
		 }
		 else{
			 speak("Wrong.");
		 }
		// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	
	 speak("Sushi");
	 String answer3 = JOptionPane.showInputDialog("Spell what you heard.");
	// 2. Catch the user's answer in a String
	
	// 3. If the user spelled the word correctly, speak "correct"
	 if (answer3.equals("Sushi")){
		 speak("Correct.");
	 }
	 else{
		 speak("Wrong.");
	 }
		 speak("Cheese");
		 String answer4 = JOptionPane.showInputDialog("Spell what you heard.");
		// 2. Catch the user's answer in a String
		
		// 3. If the user spelled the word correctly, speak "correct"
		 if (answer4.equals("Cheese")){
			 speak("Correct.");
		 }
		 else{
			 speak("Wrong.");
	 }}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 }



