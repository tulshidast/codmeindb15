package javapractices;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Admin/Pictures/testing.txt");

		// file.createNewFile();

		// file .delete();

		System.out.println(file.length());

		System.out.println(file.getPath());

		System.out.println(file.canExecute());

		System.out.println(file.exists());

		System.out.println(file.getName());

		System.out.println(file.isFile());

		FileWriter fileWriter = new FileWriter(file);

		fileWriter.write("Welcom to codmeind");

		fileWriter.close();

		System.out.println(file.length());

		FileReader fileReader = new FileReader(file);

		int i;
		while ((i = fileReader.read()) != -1) {
			System.out.print((char) i);
		}

		fileReader.close();

	}

}
