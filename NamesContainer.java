package confrontaCsv;

import java.util.ArrayList;

public class NamesContainer {
	private ArrayList<Server> items;
	
	public NamesContainer() {
		items = new ArrayList<>();
	}
	
	public boolean contains(String name) {
		boolean flag = false;
		for(Server i: items) {
			if(i.getName().compareTo(name) == 0) {
				flag = true;
				i.increment();
			}
		}
		return flag;
	}
	
	public void addServer(Server s) {
		items.add(s);
	}
	
	public void printAll() {
		for(Server s : items) {
			System.out.println(s.toString());
		}
	}

}
