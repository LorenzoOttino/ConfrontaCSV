package confrontaCsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;


public class Finder {

	public static void main(String[] args) {
		NamesContainer allNames;
		LinkedList<String> directories;
		BufferedReader br;
		int i;
		String name;
		
		allNames = new NamesContainer();
		directories = new LinkedList<String>();
		
		directories.add("C:\\Users\\Gino\\Documents\\Downloads\\L1.csv");
		//directories.add("C:\\Users\\Gino\\Documents\\Downloads\\Q1.csv");
		//directories.add("C:\\Users\\Gino\\Documents\\Downloads\\V1.csv");
		
		for(String s : directories) {
			try {
				br = new BufferedReader(new FileReader(s));
		        String line;
		        System.out.println("Checking file" + s + "...");
		        i = 0;
		        while ((line = br.readLine()) != null) {
		        	if(i == 0) {
		        		i++;
		        	}else {
		        		name = line.split(",")[0];
		        		if(!allNames.contains(name))
		        			allNames.addServer(new Server(name));
		        	}
		           
		        }       
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		allNames.printAll();
	}

}
