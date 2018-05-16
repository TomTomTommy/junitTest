package snakecamel;

public class SnakeCamelUtil {

	public static String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			if(!words[i].isEmpty())
			sb.append(capitalize(words[i]));
		}
		return new String(sb);
	}

	public static String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < camelcase.length(); i++) {
			char c = camelcase.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(camelcase.substring(j, i));
				if (sb.length() > 0) {
					sb.append("_");
				}
				sb.append(Character.toLowerCase(c));
				j = i+1;
			}
		}
		sb.append(camelcase.substring(j));
		return new String(sb);
	}

	static String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	static String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}

	 public static void main(String[] args) {
		System.out.println(capitalize(" "));
		if(capitalize(" ").matches(" "))
			System.out.println("OK!");

		System.out.println(capitalize("a"));
		if(capitalize("a").matches("A"))
			System.out.println("OK!");

		System.out.println(capitalize("xyz"));
		if(capitalize("xyz").matches("Xyz"))
			System.out.println("OK!");

		System.out.println(uncapitalize(" "));
		if(uncapitalize(" ").matches(" "))
			System.out.println("OK!");

		System.out.println(uncapitalize("A"));
		if(uncapitalize("A").matches("a"))
			System.out.println("OK!");

		System.out.println(uncapitalize("Xyz"));
		if(uncapitalize("Xyz").matches("xyz"))
			System.out.println("OK!");

		System.out.println(snakeToCamelcase("abc"));
		if(snakeToCamelcase("abc").matches("Abc"))
			System.out.println("OK!");

		System.out.println(snakeToCamelcase("abc_def"));
		if(snakeToCamelcase("abc_def").matches("AbcDef"))
			System.out.println("OK!");

		System.out.println(snakeToCamelcase("abc_def_gh"));
		if(snakeToCamelcase("abc_def_gh").matches("AbcDefGh"))
			System.out.println("OK!");

		System.out.println(snakeToCamelcase("abc_def"));
		if(snakeToCamelcase("abc_def").matches("AbcDef"))
			System.out.println("OK!");

		System.out.println(snakeToCamelcase("_abc_def__"));
		if(snakeToCamelcase("_abc_def__").matches("AbcDef"))
			System.out.println("OK!");

		System.out.println(camelToSnakecase("Abc"));
		if(camelToSnakecase("Abc").matches("abc"))
			System.out.println("OK!");

		System.out.println(camelToSnakecase("AbcDef"));
		if(camelToSnakecase("AbcDef").matches("abc_def"))
			System.out.println("OK!");

		System.out.println(camelToSnakecase("AbcDefGh"));
		if(camelToSnakecase("AbcDefGh").matches("abc_def_gh"))
			System.out.println("OK!");
	}
}
