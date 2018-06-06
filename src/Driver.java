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
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Driver {
	
	public static void main(String[] args) {
		
		String in = "input/input.txt";
		String line = null;
		FileReader input = null;
		int i =0, x = 6;
		String[] num;
		FloydWarshalls fw = new FloydWarshalls();
		int[][] matrix = new int [x][x];
		
		try {
			input = new FileReader(in);
			BufferedReader bf = new BufferedReader(input);
			while((line=bf.readLine())!=null) {
					num = line.split(",");
					
						for(int j = 0; j<num.length; j++) {
							int tmp = Integer.parseInt(num[j]);
							matrix[i][j] = tmp;
						System.out.print(matrix[i][j] +" | ");
					}	System.out.println();
					i++;
			}
			fw.floydWarshall(matrix);
			bf.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(IOException ioe) {
			System.out.println("Can't Read File");
		}
	}
}