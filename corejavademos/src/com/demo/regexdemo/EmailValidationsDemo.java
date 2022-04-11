package com.demo.regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationsDemo {

	Pattern emailIdRegex = Pattern.compile("([A-Za-z-_]+)[@]([a-z]+)[.](com|in)");

	boolean validate(String emailinput) {
		Matcher mat = emailIdRegex.matcher(emailinput);

		boolean b = mat.find();
		return b;

	}

	public static void main(String[] args) {
		
		EmailValidationsDemo v = new EmailValidationsDemo();
		
		boolean result = v.validate("mantha747@gmail.com");
		
		System.out.println(result);

	}

}
