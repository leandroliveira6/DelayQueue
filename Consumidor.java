package DelayQueue;

import java.util.concurrent.BlockingQueue;

public class Consumidor extends Thread{
	private BlockingQueue<Produto> estoque;
	private int id;
	                          
	public Consumidor(BlockingQueue<Produto> c, int id) {
		estoque = c;
		this.id = id;
	}

	public void run() {
	    for (int i = 0; i < 10; i++) {
	        try {
	        	Produto p = estoque.take(); //InterruptedException
				System.out.println("Comsumidor "+id+" consumiu o " + p.getValor() + ", "+p.getTempoDecorido()+"s ap�s in�cio da produ��o!");
	        } 
	        catch (InterruptedException e) { 
	        	System.exit(1);
	        }
	    }
	}
}
