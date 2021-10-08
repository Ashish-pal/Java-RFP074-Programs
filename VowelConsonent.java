package vowel_consonent;

import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your character: ");
		
		ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		System.out.println("Alphabet is vowel");
		break;
		default:
		System.out.println("Alphabet is consonent");
		System.exit(0);
		}
		
	}

}
