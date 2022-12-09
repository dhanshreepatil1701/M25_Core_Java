package org.tnsindia.string;

//Demo on StringTokenizer 
import java.util.StringTokenizer;

//To break string into tokens
//The set of delimiters (the characters that separate tokens may be specified either at the creation time or on a per-token basis.


public class StringTokenizerExample {

	public static void  main(String args[]) {
		StringTokenizer st = new StringTokenizer("Lets try this", ":", true);
		while(st.hasMoreTokens()) {

			System.out.println(st.nextToken());

			}
		//System.out.println(st.nextToken());
		//System.out.println(st.nextToken());
	}
	
}
