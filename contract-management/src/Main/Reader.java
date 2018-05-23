package Main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Model;

public class Reader {

	public Reader(Model model) throws ClassNotFoundException {

		try {
			FileInputStream fi = new FileInputStream(new File("contracts.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			while( fi.read() != -1) {
				Contract contract = (Contract) oi.readObject();
				model.getContracts().add(contract);
			}
			
			oi.close();
			fi.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream (Reader)");
		}
	}

}
