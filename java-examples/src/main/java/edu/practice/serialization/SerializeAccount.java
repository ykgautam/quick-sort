package edu.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private transient String pwd;

	public Account(String userName, String pwd) {
		super();
		this.userName = userName;
		this.pwd = pwd;
	}

	String getUserName() {
		return userName;
	}

	String getPwd() {
		return pwd;
	}

}

public class SerializeAccount {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Account a1 = new Account("Yash", "pavi");
		System.out.println("my user name is " + a1.getUserName() + " and my password is " + a1.getPwd());

		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();

		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();

		ois.close();
		System.out.println("my user name is " + a2.getUserName() + " and my password is " + a2.getPwd());

	}

}
