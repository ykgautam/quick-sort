package edu.practice.hashequals;

public class Test {
	public static void main(String[] args) {

		Human yash = new Human(100, "yash"); 
		Human raja = new Human(101, "raja");
		Human akash = yash;

		System.out.println(yash == raja);
		System.out.println(yash.equals(raja));

		int hashcodeValue = yash.hashCode();
		System.out.println("yash's obj hashcode is : " + hashcodeValue);
		System.out.println("raja's obj hashcode is : " + raja.hashCode());

		String yk = new String("yash");
		int ykHashcodeValue = yk.hashCode();
		System.out.println("hashcode value of yash : " + ykHashcodeValue);

		String mohit = new String("mohit");
		int mohitHashcodeValue = mohit.hashCode();
		System.out.println("hashcode value of mohit : " + mohitHashcodeValue);

		// str1 and str2 gives same hashcode values
		String str1 = "FB";
		String str2 = "Ea";
		System.out.println(str1.hashCode() + " " + str2.hashCode());
	}	
}
