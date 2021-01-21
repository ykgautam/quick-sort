package edu.practice.serialization;

/**
 * serializing and deserializing a single object
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private transient String colour;

	public Dog(String name, String colour) {
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public String getColour() {
		return colour;
	}

}

public class SerializeDemo1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1 = new Dog("tony", "black");
		FileOutputStream fos = new FileOutputStream("dog.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		oos.close();

		FileInputStream fis = new FileInputStream("dog.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		ois.close();

		System.out.println("My dog's name is " + d2.getName().toUpperCase() + " and  his color is " + d2.getColour());

	}

}
