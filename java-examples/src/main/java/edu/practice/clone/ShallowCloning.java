package edu.practice.clone;

public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning shallowObj = new ShallowCloning();

		Cat c = new Cat("lucy");
		Dog d1 = new Dog(c, "tomy");

		System.out.println("using d1 obj");
		shallowObj.show(d1);

		Dog d2 = (Dog) d1.clone();
		d2.getC().setCatName("lily");
		d2.setDogName("rio");

		System.out.println("\n aftr shallow cloning \n");

		System.out.println("using d1 obj");
		shallowObj.show(d1);

		System.out.println("using d2 obj");
		shallowObj.show(d2);

	}

	private void show(Object obj) {
		System.out.println("cat name is " + ((Dog) obj).getC().getCatName().toUpperCase() + " and dog name is  "
				+ ((Dog) obj).getDogName().toUpperCase());
	}

}
