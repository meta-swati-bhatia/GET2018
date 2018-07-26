import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		String str;
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		char[] characters = str.toCharArray();
		Stack pStack = new Stack(100);
		for(int i = 0; i < characters.length / 2; i++){
			pStack.push(characters[i]);
		}
		int j;
		if(characters.length % 2 == 0)
			j = characters.length / 2;
		else
			j = characters.length / 2 + 1;
		for(int i = j; i < characters.length; i++){
			if(characters[i] != pStack.pop())
			{
				System.out.println("sorry.. not a palindrome");
				return;
			}
		}
		System.out.println("yes.. a palindrome");
	}

}
