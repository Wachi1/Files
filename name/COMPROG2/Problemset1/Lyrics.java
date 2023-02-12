package Problemset1;

import java.util.*;

public class Lyrics {

	public static void main(String[] args) {
		Scanner lyrics = new Scanner(System.in);
		
		String name;
		String insects;
		String animal;
		String verb;
		String adjective;
		
		System.out.println("Input a name, insect, animal, verb and an adjective to replace up the missing lyrics of the song.");
		
		System.out.println("Name:");
		name = lyrics.next();
		
		System.out.println("Insect:");
		insects = lyrics.next();
		
		System.out.println("Animal:");
		animal = lyrics.next();
		
		System.out.println("Verb:");
		verb = lyrics.next();
		
		System.out.println("Adjective:");
		adjective = lyrics.next();
		
		System.out.println("\n");
		System.out.println("-----------------------------------------------------|");
		System.out.println("Take a little time "+ name);
		System.out.println("See the "+ insects +"'s color");
		System.out.println("Listen to the " + animal + " That were sent");
		System.out.println("To " + verb +" for me and you\n" + "Can you feel me");
		System.out.println("This is such a " + adjective + " place to be ");
		System.out.println("-----------------------------------------------------|");
		
		
		

}}
