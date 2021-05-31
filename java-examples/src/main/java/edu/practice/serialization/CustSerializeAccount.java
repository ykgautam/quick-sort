package edu.practice.serialization;

/**
 * customized serialization 
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userName;
	transient private String pwd;
	transient private int pin;

	public Account1(String userName, String pwd, int pin) {
		super();
		this.userName = userName;
		this.pwd = pwd;
		this.pin = pin;
	}

	public String getUserName() {
		return userName;
	}

	public String getPwd() {
		return pwd;
	}

	public int getPin() {
		return pin;
	}

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epwd = "123" + getPwd();
		os.writeObject(epwd);

		int epin = 1111 + pin;
		os.writeInt(epin);

	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);

		int epin = is.readInt();
		pin = epin - 1111;
	}

}

public class CustSerializeAccount {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Account1 a1 = new Account1("Yashgautam", "gtm", 1234);
		System.out.println("my user name is " + a1.getUserName() + " and my password is " + a1.getPwd());

		FileOutputStream fos = new FileOutputStream("cust_account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		oos.close();

		FileInputStream fis = new FileInputStream("cust_account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 a2 = (Account1) ois.readObject();

		ois.close();
		System.out.println("my user name is " + a2.getUserName() + " and my password is " + a2.getPwd() + " and pin is "
				+ a2.getPin());

	}

}
