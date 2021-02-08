public class CutomerThreadLocal extends Thread {
	static Integer custId = 0;

	private static ThreadLocal t1 = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};

	CutomerThreadLocal(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Executing with customer ID: " + t1.get());
	}

}
