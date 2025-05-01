package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CompileTimeException {

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

		File file = new File("g:/test.txt");

		FileInputStream fileInputStream = new FileInputStream(file);

		// fileInputStream.close();

		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		URL url = new URL("www.google.com");

	}

}
