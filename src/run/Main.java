package run;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;

import miner.AlgoFHMPlus;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.out.print("Starting");
		
		 final String dir = System.getProperty("user.dir");
	        System.out.println("current dir = " + dir);
	        
		String input = dir +"/data/"+"DB_Utility.txt";
		String output = "D://output_data.txt";

		// minimum utility threshold
		int min_utility = 30;  
		
		// minimum and maximum length
		int minimumLength = 2; 
		int maximumLength = 3; 
		
		// Applying the algorithm
		AlgoFHMPlus algo = new AlgoFHMPlus();
		try {
			algo.runAlgorithm(input, output, min_utility, minimumLength, maximumLength);
			algo.printStats();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = Main.class.getResource(filename);
		
		 String workingDir = System.getProperty("user.dir");
		 
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}

}
