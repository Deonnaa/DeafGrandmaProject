package entities;

import java.util.Random;

public class Grandma {
	public String[] heardYa = { "Back in my day, things were quite different!", "Kids these days! You youngsters have it easy!",
			"Well butter me up stick me in the oven and call me a biscuit!" };
	public String[] whuh = { "Speak up, dear; my hearing isn't what it used to be!", "My ears are on vacation!",
			"I have a PhD in What Did You Say" };
	public String[] goodBye = { "Remember, I'm just a phone call away!", "Finally!", "Adios" };

//	most specific to more general last if most general condition

	public String gmaSays(String whatISayToGma) {
		Random rand = new Random();
		String response = "";

		if (whatISayToGma.equals(whatISayToGma.toUpperCase()) && (whatISayToGma.equals("GOODBYE"))) {
			response = goodBye[rand.nextInt(3)];
		} else if (whatISayToGma.equals(whatISayToGma.toUpperCase())) {
			response = heardYa[rand.nextInt(3)];
		} else {
			response = whuh[rand.nextInt(3)];
		}
		return response;
	}

}
