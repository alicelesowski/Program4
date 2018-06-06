
/*
 * Alice Lesowski
 * June 6, 2018
 * Program 4
 * CSCI 232
 * Data Structures and Algorithms
 * 
 * This programs takes a matrix from an input file and
 * throws it into a 2D array which calls the Floyd Warshalls algorithm
 * and is supposed to create the shortest path by weights.
 * 
 * Attempted to write to output file..
 * 
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FloydWarshalls {

	    final int infinity = 100;
	    final int v = 6;
	    public void floydWarshall(int graph[][])
	    {
	        int[][] d = new int[v][v];
	        for(int i = 0; i <v ; i++)
	        {
	            for (int j = 0; j <v; j++)
	            {
	                d[i][j] = graph[i][j];
	            }
	        }
	    for(int k = 1; k < v; k++)
	    {
	        for(int i = 1; i < v; i++)
	        {
	            for (int j = 1; j < v; j++)
	            {
	                if (d[i][j] > d[i][k] + d[k][j])
	                {
	                    d[i][j] = d[i][k] + d[k][j];
	                }
	            }
	        
	            
	        }
	    }print(d);
}
	        
	        public void print(int d[][]){
	        	 	try {
	        		 BufferedWriter output = null;
	        		 File out = new File("output/output.txt");
			       		if(!out.exists()){
			     			out.createNewFile();
			       		}
			            FileWriter fw = new FileWriter(out);
				        output = new BufferedWriter(fw);
	        		 for(int i = 0; i<v; i++) {
	        			 for(int j = 0; j<v; j++) {
	        				 if(d[i][j] == infinity) {
	        					 System.out.println("INF");
	        					 output.write("INF");
	        				 }
	        					else {
	        					System.out.println(d[i][j]);
	        					output.write(d[i][j]);
	        			 	}
	        			}
		        		
	        		 }
	        		 output.close();
	        	 }
		        		
		        		catch(IOException x){
		    			System.err.format("IOException: %s%n", x);
		        		}
	        }
	        
	  }
