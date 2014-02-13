package stack;

public class CapitalAfterDot {

	public static void main(String[] args) {

		String text = "I like fruits. i like banana. jon like you";
		
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			
			if (c>'a' & c<'z') {
				c-=32;
			}
		}

		System.out.println(text);
	}

}
