/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

public class ASCIIArt {
	public static void main (String [] args) {
		System.out.println("THIS IS MY ASCII ART!!!!");
		printRain();
		printRain();
		System.out.println("/        /        /        /   0    /        /        /       /");
		System.out.println("    \\        \\       \\        ||| \\        \\        \\      \\ ");
		System.out.println("/        /      /        :####   ####  /       /        /        /");
		System.out.println("   \\      \\      \\    :####         ####  \\       \\      \\");
		System.out.println("/      /       /    ####               ####          /        /   ");
		System.out.println("   \\         \\   ####                     ####  \\      \\");
		System.out.println("/      /        ####                       ####      /       /");
		System.out.println("         \\    ####                           ####  \\      \\");
		System.out.println(" /      /    ####                             ####    /       /");
		System.out.println("   \\        ####                               ####      \\   ");
		System.out.println("/      /   ####                                 ####        /");
		System.out.println("   \\      ####                                   ####          \\ ");
		System.out.println("/      /  ####                                   ####    /");
		printBottom();
		printStem();
		printHandle();
	}
		
			public static void printRainForward() {
				System.out.println("/        /        /        /        /        /        /        /");
			}
			public static void printRainBack() {
				System.out.println("    \\        \\        \\        \\        \\        \\        \\");
			}
			public static void printRain() {
				printRainForward();
				printRainBack();
			}
			public static void printStem() {
				print99Forward();
				print99Back();
				print99Forward();
				print99Back();
				print99Forward();
				print99Back();
				print99Forward();
				print99Back();
				print99Forward();
				print99Back();
				print99Forward();
			}
			public static void print99Forward() {
				System.out.println("     /                       99                           \\");
			}
			public static void print99Back() {
				System.out.println(" \\                           99                               /");
			}
			public static void printHandle() {
				System.out.println("                	     99   99");
				System.out.println("                	      99 99");
				System.out.println("                 	       999");
				
			}
			public static void printBottom() {
				System.out.println("	  --    --    --    --    --    --    --    -");
				System.out.print("\\        /  ");
				printCurve();
				System.out.println("\\        /");
				System.out.println("       \"o\"   \"o\"   \"o\"   \"o\"   \"o\"   \"o\"   \"o\"   \"o\"  \"o\"");
			}
			public static void printCurveParts() {
				System.out.print("\\\\//  ");
				}
			public static void printCurve() {
				printCurveParts();
				printCurveParts();
				printCurveParts();
				printCurveParts();
				printCurveParts();
				printCurveParts();
				printCurveParts();
	}
}