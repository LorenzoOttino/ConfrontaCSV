package confrontaCsv;

public class Server {
	private String name;
	private int times;
	
	public Server(String name){
		this.name = name;
		this.times = 1;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getTimes() {
		return this.times;
	}

	public void increment() {
		this.times++;
	}
	
	public String toString() {
		return this.name + " " + times;
	}
}
