public class ThreadLocalDemo1 {
	public static void main(String[] args) {
		CutomerThreadLocal c1 = new CutomerThreadLocal("Customer Thread-1");
		CutomerThreadLocal c2 = new CutomerThreadLocal("Customer Thread-2");
		CutomerThreadLocal c3 = new CutomerThreadLocal("Customer Thread-3");
		CutomerThreadLocal c4 = new CutomerThreadLocal("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
