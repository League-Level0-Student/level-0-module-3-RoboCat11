package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Once upon a time, there was a little boy named Mana. He liked to hum all the time. When I say all the time, I mean, ALL THE TIME! One day he decided to take a hike in the desert.\n But his mom said,'Mana, it's too dangerous to take a hike by yourself.' However, his sister Alo loved to go on hikes. So she said, 'Oh, Mom, I can go with him!' But Mom was so worried that they would die by themselves.");
		String input = JOptionPane.showInputDialog("Should Mom go with them, or should all of them just stay home?");
		if (input.equals("Mom should go with them.")) {
			String input1 = JOptionPane.showInputDialog("Mom decided she should go with Mana and Alo, because she knew Alo loved to go on hikes.\n 'Okay, we'll start the hike tomorrow morning.' Mana looked at Alo.'Thank you so much, Alo! Now we get to go on a hike!'\n The next morning, they started on the hike.'Okay, you guys all packed up and ready to go ?'Mom asked.\n 'Yes Mom!' Mana and Alo came racing out of their bedroom. But they all forgot the most important thing when hiking- water!\n So they started out to the Sahara Desert, and Mana kept on humming all the way there. It was a three-day travel, and the only time Mana didn't hum was when he was snoring.\n 'Hey, kids don't forget all of your things you packed, because we're going to be camping here to get a good view of the stars.\n So Mom, Mana and Alo walked all the way to the middle of the desert, away from the car. ' Mana eventually got thirsty, so he asked Mom,'Mom, can I have some water, please?'\n'What? No, I thought you were the one who was bringing the water!'\n Then Alo stopped walking, and turned around to face both of them. 'Wait, so none of you guys brought water? I didn't either!' Everyone began to panic.\n The car was a long way off, but they could still see it. Then Mana remembered something from science. 'Hey! We can just look around for an oasis!'\n So they all looked around to see if there was an oasis anywhere. Then Alo spotted one far off in the distance. Should they go back to the car, or to the oasis?");
			if(input.equals("Oasis")) {
			String input2 = JOptionPane.showInputDialog("They decided to go to the oasis, because it was closer. So when they got to the oasis, they collapsed and drank the water, and rested under the palm trees for the the night. When they awoke the next morning, they made sure to hydrate themselves and then started on their journey back to the car.\n Before they did, though, Mom collected water in the palm leaves and Alo tied into a little package of water. Then they started walking to the car; it was a long journey, but they were a ble to reach it.\n But then, when Mom went to go start the car, she saw that she only had 30 miles left! She knew there was a gas station when you get on the freeway, but she also knew she would have to purchase a hotel because it was a three-day travel back home. Should she purchase a hotel, or go to the gas station?");	
			}
			if(input.equals("Gas station")){
			String input3 = JOptionPane.showInputDialog("Mom decided they should go to the gas station. So they started driving and tried to make there. Luckily they got there, and then she purchased a hotel, and was able to get home safely.																														THE END!!!");	
			if(input.equals("Hotel")) {
			JOptionPane.showMessageDialog(null,"Mom decided she should purchase a hotel, so she got on her phone, and started looking for the closest hotels to the Sahara desert. However, she forgot to turn off the car! So when she finally saw and picked the hotel, she was going to start driving, but she found out the car was dead.\n																																						THE END!!!");		
				}
			}
			if(input.equals("Car")) {
			JOptionPane.showMessageDialog(null,"They decided to go to the car so they could rest when they got there too. So they walked and walked; Mana kept on humming all the way there until he eventually ran out of breath. Alo was closer to the car than Mom and Mana, so when she cam close enough, she sprinted there, but looked in the window and found that there was no water! Meanwhile, Mana and Mom were too tired and fainted. Alo feeling very dizzy, fainted just like the others, and they all died of thirst.\n																										                 					THE END!!!");	
			}
		}
		if (input.equals("They should all just stay home.")) {
			JOptionPane.showMessageDialog(null,"Mom decided they should all just stay home, so they continued to do schoolwork and do workouts with their Auntie.\n But it was nice when they did workouts with their Auntie because would always give them a treat afterwards, like ice cream!\n																																																																																														THE END!!!");
		}
	}
}