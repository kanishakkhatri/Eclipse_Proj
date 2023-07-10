package p3;

public class StringDemo {
	public static void main(String args[]) {
		String name="Suresh";
		System.out.println(name);
		
		String s=new String("Ramesh");
		System.out.println(s);

		System.out.println("My name is "+name.toUpperCase());
		System.out.println("My name is "+name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.trim().length());//to remove space
		System.out.println(""+name.replace("S", "Z"));
		System.out.println(s.startsWith("R"));
		System.out.println(s.endsWith("h"));
		System.out.println(s.concat(name));
		System.out.println(s.equals("ramesh"));
		System.out.println(s.equalsIgnoreCase("ramesh"));
		System.out.println(s.charAt(2));
	
	}
}
