import java.util.Arrays;

public class Occurences {
	public static void splitString(String sentence) {
		int count = 0;
		String result[] = sentence.split(" ");
		System.out.println(Arrays.toString(result));

		for (int i = 0; i < result.length; i++) {
			count++;

		}
		System.out.println("words in given sentence is:" + count);
	}
	public static void reverseString(String sentence) {
		String reversedString="";
		String result[] = sentence.split(" ");
		System.out.println(Arrays.toString(result));
		for(String reverse:result) {
			reversedString=reverse+reversedString;
		}
		System.out.println("reversed string is:"+reversedString);
	}
	public static void main(String[] args) {
		Occurences.splitString("rajesh is a good boy");
		Occurences.reverseString("rajesh is good");
		
	}

}
