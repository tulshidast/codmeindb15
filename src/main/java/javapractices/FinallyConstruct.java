package javapractices;

public class FinallyConstruct {

	public static void main(String[] args) {

		FinallyConstruct finallyConstruct = new FinallyConstruct();
		char c = finallyConstruct.getCharacterFromSpecifiedIndex("Welcome", 3);
		System.out.println("Character = " + c);

	}

	public char getCharacterFromSpecifiedIndex(String s, int index) {
		char c = 0;
		try {
			c = s.charAt(index);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please provide valid index");
		} catch (Exception e) {

		} finally {
			System.out.println("Finally block always executed");
		}
		return c;
	}

}
