package testpackages;

import java.util.ArrayList;

import javapractices.DemoProtected;
import javapractices.test.TestPackage;

//import javapractices.GenericUtils;
//import javapractices.MathUtils;

//import javapractices.*;

public class TestAccess extends DemoProtected {

	public static void main(String[] args) {

		javapractices.GenericUtils genericUtils = new javapractices.GenericUtils();
		genericUtils.printMsg();

		javapractices.MathUtils mathUtils = new javapractices.MathUtils();
		System.out.println(mathUtils.add(10, 20));

		TestPackage testPackage = new TestPackage();
		testPackage.testingPackage();

		System.out.println(Math.min(10, 20));

		ArrayList<String> arrayList = new ArrayList<String>();
		
		TestAccess testAccess = new TestAccess();
		testAccess.div();		
		testAccess.add();

	}

}
