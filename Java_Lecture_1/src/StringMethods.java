
public class StringMethods {

	public static void main(String[] args) {
		String str = "This is the test String";
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Welcome";
		String str4 = "";
		String str5 = "       Spaces all around       ";
		String str6 = "Hello";
		
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.concat(" This is the appended String"));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("a"));
		System.out.println(str.startsWith("This"));
		System.out.println(str.startsWith("Not"));
		System.out.println(str.endsWith("String"));
		System.out.println(str.endsWith("True"));
		System.out.println(str1.equals(str2));
		System.out.println(str.equals(str2));
		
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf("q"));
		System.out.println(str.isEmpty());
		System.out.println(str4.isEmpty());
		System.out.println(str5.trim());
		System.out.println(str6.replace("e", "a"));
		
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 10));
		
		char [] charArray = str.toCharArray();
		for(int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
			
		}
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
	}
	
}
