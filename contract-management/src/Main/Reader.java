package Main;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.Model;

public class Reader {

	public Reader(Model model) throws ClassNotFoundException, EOFException {

		try {
			FileInputStream fi = new FileInputStream(new File("contracts.txt"));
			ObjectInputStream oi = new ObjectInputStream(fi);

			// Read objects
			for(;;) {
				Contract contract = (Contract) oi.readObject();
				model.getContracts().add(contract);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream (Reader)");
		}
	}

}
