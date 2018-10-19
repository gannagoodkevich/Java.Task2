/*Main
 * 
 * hometask2-4
 * 
 * 19.10.2018
 * 
 * gannagoodkevich@gmail.com
 * 
 */

import java.util.Scanner;

public class Main {
public static void main(String[] obsc) {
	System.out.println("Your mood is: ");
	int mood = YourMood.GenRandom();
	if (mood==1) {
		System.out.println(":) - you feel good!");
	}
	if (mood==2) {
		System.out.println(":D - you feel marvelous!");
	}
	if (mood==3) {
		System.out.println(":/ - you feel puzzled!");
	}
	if (mood==4) {
		System.out.println(":| - you feel quite ok!");
	}
	if (mood==5) {
		System.out.println(":( - you feel upset!");
	}
	if (mood==6) {
		System.out.println("*_* - you feel adoring!");
	}
}
}
