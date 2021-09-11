/**
 * @author Lucas Favaro Borsatto
 * email: paradigma0621@gmail.com
 * 
 */

package com.paradigma0621.arrays;


import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		double d[] = {1.3, 2.4, 3.5};
		//or
		double[] d2 = {1.3, 2.4, 3.5};
		
		//error: Array constants can only be used in initializers		
		//int[] vetor2;
		//vetor2 = {1, 2, 3, 4, 5};
		
		//error: Array constants can only be used in initializers
		//String arrayStrgs[];
		//arrayStrgs = { "aaa", "sss" };
				
		//error: "The constructor String(String, String, String) is undefined"
		//String k = new String("ghi", "abc", "def");
		//conclusion: have to use "[]" after k
		
		//error: "Type mismatch: cannot convert from String to String[]"
		//String k[] = new String("ghi", "abc", "def");

		//error: Type mismatch: cannot convert from String to String[]
		//String values[];
		//values = new String(5);

		//-------------------------------------------------------------------		
		


		

		
		
		//---------------------------- MULTIDIMENSIONAL --------------------------
		int multi[][][];
		multi = new int[10][9][8];

		int[][][] multi2;
		multi2 = new int[7][6][4];
		
		int[][][] multi3 = new int[4][3][2];
		
		int[][][] multi6 = new int[5][6][];
		multi6[2][3] = new int[8];
		multi6[4][5] = new int[2];
		
		int[][][] multi7 = new int[5][][];
		multi7[2] = new int[8][];
		multi7[2][5] = new int[2];
		
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

		
		System.out.println("Length of multi6: " + multi6.length); //shows: 5
		System.out.println("Length of multi6[2][3]: " + multi6[2][3].length);  //shows: 8
		System.out.println("Length of multi6[4][5]: " + multi6[4][5].length);  //shows: 2
		System.out.println("Length of multi6[1]: " + multi6[1].length);  //shows: 6
		System.out.println("Length of multi7[2]: " + multi7[2].length);  //shows: 8


		
		//error: multi4 cannot be resolved to a variable
		//int multi4[4][3][2];
		//int[4][3][2] multi4;
		
		
		//error: Type mismatch: cannot convert from int[][][] to int
		//int multi5 = new int[4][3][2];

		//error: Cannot specify an array dimension after an empty dimension
		//int[][][] multi7 = new int[5][][5];

		
		//-----------------------------------------------------------
		

		String a[] = {"abc", "def", "ghi"};
		String l[] = {"ghi", "abc", "def"};
				
		System.out.println("The number of elements of a[] is: " + Arrays.equals(a,l)); //false
								//Conclusion: the order of the elements matters
		
		System.out.println("The elements of l[] are: " + Arrays.toString(l));
		
		int i[] = {123, 234, 345, 456, 567};
		System.out.println("The elements of i[] are: " + Arrays.toString(i));
		System.out.println("The hashcode of i[] using i.toString is: " + i.toString());
		
		
		double[] f = {0.12, 3.45, 6.78};
		System.out.println("The elements of f[] are: " + Arrays.toString(f));
		
		
	}

}
