package DelayQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;

public class Main {
	public static void main(String[] args) {
		BlockingQueue<Produto> c = new DelayQueue<Produto>();
		Produtor p1 = new Produtor(c, 1);
		Consumidor c1 = new Consumidor(c, 1);
		
		p1.start();
		c1.start();
	}
}
