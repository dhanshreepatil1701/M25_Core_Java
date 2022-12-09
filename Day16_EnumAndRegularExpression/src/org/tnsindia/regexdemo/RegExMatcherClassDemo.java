package org.tnsindia.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//demo on matcher() method of matcher class
public class RegExMatcherClassDemo {

	public static void main(String[] args) {
		Pattern p=Pattern .compile("Dhanshree");
		Matcher m=p.matcher("My name is Dhanshree");
		
		while(m.find()){
			System.out.println("Patern found at :"+m.start()+" "+m.end());
			
		}

	}

}
