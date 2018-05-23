package Main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import model.Model;

public class Writer {
	
	public Writer(Model model) throws ClassNotFoundException {
		try {
			FileOutputStream f = new FileOutputStream(new File("contracts.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

		// Write objects to file
			for ( Contract contract : model.getContracts() ) {
				o.writeObject(contract);
			}

			o.close();
			f.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream (Writer)");
		}
	}

}
