package edu.practice.serialization;

/**
 * Object graph serialization i.e serializing multiple objects
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Tiger implements Serializable {
	Cat c = new Cat();
}

class Cat implements Serializable {
	Deer d = new Deer();
}

class Deer implements Serializable {
	String name = "hina";
}

public class SerializeDemo2 {

	public static void main(String[] args) throws Exception {
		Tiger t1 = new Tiger();

		FileOutputStream fos = new FileOutputStream("tiger.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);
		oos.close();

		FileInputStream fis = new FileInputStream("tiger.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

//		Tiger t2 = (Tiger) ois.readObject();

		Object o = ois.readObject();
		if (o instanceof Cat) {
			System.out.println("cat");
			Cat c2 = (Cat) o;
		}
		if (o instanceof Tiger) {
			Tiger t2 = (Tiger) o;
			System.out.println("tiger " + t2.c.d.name);
		}
		if (o instanceof Deer) {
			Deer d2 = (Deer) o;
			System.out.println("deer");
		}
		ois.close();

//		System.out.println("deer's name is " + o.c.d.name);

	}

}
