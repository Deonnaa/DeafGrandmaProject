package app;

import java.util.Scanner;

import entities.Grandma;

public class GammieApp {
	public static void main (String[] args) {
		Grandma gammie = new Grandma();
		Scanner sc = new Scanner(System.in);
		String Str = "";
		do {
			System.out.println("You are talking to your Deaf Grandma. Say something or type 'GOODBYE' to exit.");
			Str = sc.next();
			
			System.out.println(gammie.gmaSays(Str));
		} while (!Str.equals("GOODBYE"));
	sc.close();
	}
}