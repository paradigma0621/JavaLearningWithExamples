/**
 * @author Lucas Favaro Borsatto
 * email: paradigma0621@gmail.com
 */

package com.paradigma0621.strings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainStrings {

	public static void main(String[] args) {
	
		String text = new String("0123456789");
		System.out.println("The text is: " + text);
		
		System.out.println("Text size: " + text.length());
		
		System.out.println("text.charAt(5): " + text.charAt(5));
		
		
		//Return the number of Unicode values found in a string:
		System.out.println("text.codePointCount(2, 8): " + text.codePointCount(2, 8) + " - (Return the number of Unicode values found in a string)");
		
		
		System.out.println("ASCII of text.codePointAt(4) = " + text.codePointAt(4) + " is: " + (char) text.codePointAt(4));
		
		System.out.println("ASCII of text.codePointBefore(4) = " + text.codePointBefore(4) + " is: " + (char) text.codePointBefore(4));
		
		System.out.println("text.compareTo(\"abcde\"): " + text.compareTo("abcde")+ "??????????");		
		System.out.println("text.compareTo(\"0123456789\"): " + text.compareTo("0123456789"));		
		System.out.println("text.compareTo(\"fghijklmnopqrstuvwxyz\"): " + text.compareTo("fghijklmnopqrstwxyz")+ "??????????");
		
		System.out.println("text.concat(abc): " + text.concat("abc"));
		
		System.out.println("text.formatted(\"a\"): " + text.formatted(2)+ "??????????");
		
		
		System.out.println("text.indexOf(\"5\"): " + text.indexOf("5"));
		
		System.out.println("text.indexOf(\"56\", 3): " + text.indexOf("56", 3));
		
		System.out.println("text.intern(): " + text.intern()+ " ??????????");
		
		System.out.println("text.lastIndexOf(\"7\"): " + text.lastIndexOf("7"));
		
		System.out.println("text.lastIndexOf(\"234\"): " + text.lastIndexOf("234"));
		
		
		//System.out.println("text.offsetByCodePoints(2, 4): " + text.offsetByCodePoints(2, 4));
		
		System.out.println("(\"abcdefghijk\").offsetByCodePoints(1, 2): " + ("abcdefghijk").offsetByCodePoints(1, 2) + "????????");
		
		System.out.println("text.repeat(3): " + text.repeat(3));
		
		System.out.println("text.replace(\"5\", \"x\"): " + text.replace("5", "x"));
		
		System.out.println("text.replace(\"56789\", \"--\"): " + text.replace("56789", "--"));
		
		System.out.println("text.repeat(3).replaceAll(\"01\", \"-zero-um-\"): " + text.repeat(3).replaceAll("01", "-zero-um-"));
		
		System.out.println("text.repeat(3).replaceFirst(\"01\", \"-zero-um-\"): " + text.repeat(3).replaceFirst("01", "-zero-um-"));
		
		System.out.println("text.resolveConstantDesc(null): " + text.resolveConstantDesc(null) + " ??????????");
		
		System.out.println("text.stripIndent(): " + text.stripIndent()+ " ??????????");
		
		System.out.println("text.substring(3): " + text.substring(3));
		
		System.out.println("text.substring(2, 7): " + text.substring(2, 7));
		
		System.out.println("\"aBcDeF\".toLowerCase(): " + "aBcDeF".toLowerCase());
		
		System.out.println("\"aBcDeF\".toUpperCase(): " + "aBcDeF".toUpperCase());
		
		//Deprecated, for removal (translateEscapes()): 
		//System.out.println("(\"ab  cdefg\").translateEscapes(): " + ("ab  cdefg").translateEscapes() + "????????");
				
		
		System.out.println("---------------------------------------------------------------");
		char[] digits = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println("char[] digits = { 'a', 'b', 'c', 'd', 'e' };");
		String newText = text.copyValueOf(digits);
		System.out.println("newText = text.copyValueOf(digits))---> println(newText):  " + newText);
		
		char[] charsArray = text.toCharArray();		
		System.out.println("Arrays.toString(text.toCharArray()): " + Arrays.toString(charsArray));
		System.out.println("---------------------------------------------------------------");
		
		
		System.out.println("text.contains(\"89\")): " + text.contains("89"));
		System.out.println("text.contains(\"35\")): " + text.contains("35"));
		System.out.println("text.matches(\"0123456789\"): " + text.matches("0123456789"));
		System.out.println("text.matches(\"0123\")): " + text.matches("0123"));


		System.out.println("text.startsWith(\"123\"): " + text.startsWith("123"));
		System.out.println("text.startsWith(\"012\"): " + text.startsWith("012"));
		System.out.println("text.startsWith(\"123\",1): " + text.startsWith("123",1));
		
		System.out.println("text.endsWith(\"6789\"): " + text.endsWith("6789"));
		System.out.println("text.endsWith(\"89a\"): " + text.endsWith("89a"));

		System.out.println("---------------------------------------------------------------");
		String test = new String();
		test = "     ab  cdefg    ";
		System.out.println("(\""+test+"\").trim(): " + "\"" + test.trim()+"\"");
		System.out.println("---------------------------------------------------------------");
		
		System.out.println("(\"some-text-for-example"+"\").split​(\"-\"): " + Arrays.toString("some-text-for-example".split("-")));
		System.out.println("(\"some-text-for-example"+"\").split​(\"-\", 3): " + Arrays.toString("some-text-for-example".split("-", 3)));
		
		
		System.out.println("text.intern(): " + text.intern() + "??????????");
		
		// \n is new line, \t is tab, \r is carriage return.
		String str = "-----\nHello\n\tCurrere\rPlaying with\rString.indent\n-----";
		System.out.println(str.indent(5));
		System.out.println(str.indent(-2));
		System.out.println("---------------------------------------------------------------");

		
		
        String strX = "        Geeks For Geeks Internship    !   ";
    System.out.println("Original message:" + "\""+strX+"\"");
    // removing leading and
    // trailing white spaces
    System.out.println("\""+strX.strip()+"\"");

    // removing leading white spaces
    System.out.println("\""+strX.stripLeading()+"\"");

    // removing trailing white spaces
    System.out.println("\""+strX.stripTrailing()+"\"");
    System.out.println("---------------------------------------------------------------");
    System.out.println("text.subSequence(3, 7): " + text.subSequence(3, 7));

	/*
	
codePoints()
compareToIgnoreCase​(String str)
contains​(CharSequence s)
contentEquals​(CharSequence cs)
contentEquals​(StringBuffer sb)
copyValueOf​(char[] data)
copyValueOf​(char[] data, int offset, int count)
describeConstable()
endsWith​(String suffix)
equals​(Object anObject)
equalsIgnoreCase​(String anotherString)
format​(String format, Object... args)
format​(Locale l, String format, Object... args)

getBytes()
getBytes​(int srcBegin, int srcEnd, byte[] dst, int dstBegin)
getBytes​(String charsetName)
getBytes​(Charset charset)
getChars​(int srcBegin, int srcEnd, char[] dst, int dstBegin)

isBlank()
isEmpty()

lines()

regionMatches​(boolean ignoreCase, int toffset, String other, int ooffset, int len)
regionMatches​(int toffset, String other, int ooffset, int len)

stripIndent()


translateEscapes()
valueOf​(boolean b)
	
	 */
	}	
}
