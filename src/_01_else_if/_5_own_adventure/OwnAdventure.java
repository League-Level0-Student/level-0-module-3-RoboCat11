package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null,"Once upon a time, there was a little boy named Mana. He liked to hum all the time. When I say all the time, I mean, ALL THE TIME! One day he decided to take a hike in the desert.\n But his mom said,'Mana, it's too dangerous to take a hike by yourself.' However, his sister Alo loved to go on hikes. So she said, 'Oh, Mom, I can go with him!' But Mom was so worried that they would die by themselves.");
String input = JOptionPane.showInputDialog("Should Mom go with them, or should all of them just stay home?");
if(input.equals("Mom should go with them.")) {
String input1 = JOptionPane.showInputDialog("Mom decided she should go with Mana and Alo, because she knew Alo loved to go on hikes.\n 'Okay, we'll start the hike tomorrow morning.' Mana looked at Alo.'Thank you so much, Alo! Now we get to go on a hike!'\n The next morning, they started on the hike.'Okay, you guys all packed up and ready to go ?'Mom asked.\n 'Yes Mom!' Mana and Alo came racing out of their bedroom. But they all forgot the most important thing when hiking- water!\n So they started out to the Sahara Desert, and Mana kept on humming all the way there. It was a three-day travel, and the only time Mana didn't hum was when he was snoring.\n 'Hey, kids don't forget all of your things you packed, because we're going to be camping here to get a good view of the stars.\n So Mom, Mana and Alo walked all the way to the middle of the desert, away from the car. ' Mana eventually got thirsty, so he asked Mom,'Mom, can I have some water, please?'\n'What? No, I thought you were the one who was bringing the water!'\n Then Alo stopped walking, and turned around to face both of them. 'Wait, so none of you guys brought water? I didn't either!' Everyone began to panic.\n The car was a long way off, but they could still see it. Then Mana remembered something from science. 'Hey! We can just look around for an oasis!'\n So they all looked around to see if there was an oasis anywhere. Then Alo spotted one far off in the distance. Should they go back to the car, or to the oasis?");
 }
if(input.equals("They should all just stay home.")) {
JOptionPane.showMessageDialog(null,"Mom decided they should all just stay home, so they continued to do schoolwork and do workouts with their Auntie.\n But it was nice when they did workouts with their Auntie because would always give them a treat afterwards, like ice cream!\n																																																																																														THE END!!!");
	}
}








}