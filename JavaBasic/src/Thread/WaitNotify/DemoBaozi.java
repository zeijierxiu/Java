package Thread.WaitNotify;

public class DemoBaozi {

	public static void main(String[] args) {
		Baozi bz = new Baozi();
		new BaoziPu(bz).start();
		new ChiHuo(bz).start(); 

	}

}
