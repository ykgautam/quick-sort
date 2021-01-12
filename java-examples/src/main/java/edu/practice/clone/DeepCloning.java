package edu.practice.clone;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCloning deepObj = new DeepCloning();

		Cat c = new Cat("lucy");
		Dog d1 = new Dog(c, "tomy");

		System.out.println("using d1 obj");
		deepObj.show(d1);

		Dog d2 = (Dog) d1.cloneD();
		d2.setDogName("rio");
		d2.getC().setCatName("lily");

		System.out.println("\n aftr deep cloning \n");

		System.out.println("using d1 obj");
		deepObj.show(d1);
		System.out.println("using d2 obj");
		deepObj.show(d2);
	}

	private void show(Object obj) {
		System.out.println("cat name is " + ((Dog) obj).getC().getCatName().toUpperCase() + " and dog name is  "
				+ ((Dog) obj).getDogName().toUpperCase());
	}
}
