package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null,"Once upon a time, there was a little boy named Mana. He liked to hum all the time. When I say all the time, I mean, ALL THE TIME! One day he decided to take a hike in the desert.\n But his mom said,'Mana, it's too dangerous to take a hike by yourself.' However, his sister Alo loved to go on hikes. So she said, 'Oh, Mom, I can go with him!' But Mom was so worried that they would die by themselves.");
String input = JOptionPane.showInputDialog("Should Mom go with them, or should all of them just stay home?");
if(input.equals("Yes, Mom should go with them.")) {

 }
if(input.equals("No, they should all just stay home.")) {
JOptionPane.showMessageDialog(null,"Mom decided they should all just stay home, so they continued to do schoolwork and do workouts with their Auntie.\n But it was nice when they did workouts with their Auntie because would always give them a treat afterwards, like ice cream!\n			THE END!!!");
	}
}








}