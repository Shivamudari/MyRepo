package testScripts;

public class JavaExample25 {

	public static void main(String[] args) {

		String str = "Dhoni";
		String str2 = "dhoni";

		char a = str.charAt(3);
		System.out.println(a);

		int val = str.compareTo(str2);
		System.out.println(val);

		int val1 = str.compareToIgnoreCase(str2);
		System.out.println(val1);

		String str3 = "M.S.";
		String val2 = str3.concat(str);
		System.out.println(val2);

		String str4 = "chennai thala dhoni";
		boolean val3 = str4.contains("thala");
		System.out.println(val3);

		boolean val4 = str.equals(str2);
		System.out.println(val4);

		boolean val5 = str.equalsIgnoreCase(str2);
		System.out.println(val5);

		System.out.println(str.indexOf('n'));

		System.out.println(str4.lastIndexOf('a'));

		boolean val6 = str2.isEmpty();
		System.out.println(val6);

		int val7 = str4.length();
		System.out.println(val7);
	}

}
