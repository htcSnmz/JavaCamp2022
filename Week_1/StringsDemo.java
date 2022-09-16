package Week_1;

public class StringsDemo {

	public static void main(String[] args) {

		String message = "The weather is very nice today.";

		/*
		 * System.out.println("Eleman sayısı: " + message.length());
		 * System.out.println("5. eleman: " + message.charAt(4));
		 * System.out.println(message.concat(" Hurray!")); System.out.println(message);
		 * System.out.println(message.startsWith("T"));
		 * System.out.println(message.startsWith("t"));
		 * System.out.println(message.endsWith("."));
		 * System.out.println(message.startsWith("c"));
		 * 
		 * char[] characters = new char[3]; message.getChars(0, 3, characters, 0);
		 * System.out.println(characters);
		 * 
		 * System.out.println(message.indexOf("w"));
		 * System.out.println(message.indexOf("zo"));
		 * System.out.println(message.lastIndexOf("y"));
		 */

		System.out.println(message.replace(" ", "-"));
		System.out.println(message);
		System.out.println(message.substring(2));
		System.out.println(message.substring(2,6));

		for (String word : message.split(" ")) {
			System.out.println(word);
		}

		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());

		message = "     The weather is very nice today.     ";
		System.out.println(message.trim());

	}

}
