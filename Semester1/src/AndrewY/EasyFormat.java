package AndrewY;
//package com.skylit.io;
import java.text.DecimalFormat;

/**
*  @author Gary Litvin
*  @version 1.0, 10/10/02
*
*  Written as part of
*
*  <i>Java Methods: An Introduction to Object-Oriented Programming</i>
*  (Skylight Publishing 2001, ISBN 0-9654853-7-4)
*
*   and
*
*  <i>Java Methods AB: Data Structures</i>
*  (Skylight Publishing 2003, ISBN 0-9654853-1-5)
*
*  EasyFormat puts a right-justified char, String,
*  or number into a string.
*
*  <xmp>
*  Example:
*  =======
*                                                                       Output:
*  System.out.println("[" + EasyFormat.format('A', 5)        + "]"); // [    A]
*  System.out.println("[" + EasyFormat.format("ABC", 5)      + "]"); // [  ABC]
*  System.out.println("[" + EasyFormat.format("ABCDEF", 5)   + "]"); // [ABCDEF]
*  System.out.println("[" + EasyFormat.format(567, 5)        + "]"); // [  567]
*  System.out.println("[" + EasyFormat.format(-567, 5)       + "]"); // [ -567]
*  System.out.println("[" + EasyFormat.format(56.789, 5, 1)  + "]"); // [ 56.8]
*  System.out.println("[" + EasyFormat.format(-56.789, 5, 1) + "]"); // [-56.8]
*  System.out.println("[" + EasyFormat.format(56.789, 5, 3)  + "]"); // [56.789]
*  </xmp>
*
*/

public class EasyFormat
{
/**
*  Returns <code>s</code> padded with spaces on the left to make
*  a string of a given width (if fits)
*  @param <code>width</code> the (minimal) width of the returned string.
*  @return s if s.length > width;
*  otherwise returns s padded with spaces on the left.
*/
public static String format(String s, int width)
{
 int padding = width - s.length();
 if (padding > 0)
   s = spaces.substring(0, padding) + s;
 return s;
}
public static String format(String s, int width,char letter,int offset)
{
 int padding = width - s.length();
 if ((padding > 0) && (letter =='R'))
   s = spaces.substring(0, padding) + s;
 else
	 if ((padding > 0) && (letter =='L'))
		 s = spaces.substring(0,offset)+s+ spaces.substring(0, padding);
	 else
		 s = spaces.substring(0, padding/2) + s+spaces.substring(padding/2, padding);
 return s;
}

/**
*  Returns <code>ch</code> padded with spaces on the left to make
*  a string of a given width (if fits)
*  @param <code>width</code> the (minimal) width of the returned string.
*  @return format(String.valueOf(ch), width);
*/
public static String format(char ch, int width)
{
 return format(String.valueOf(ch), width);
}

/**
*  Returns <code>m</code> padded with spaces on the left to make
*  a string of a given width (if fits)
*  @param <code>width</code> the (minimal) width of the returned string.
*  @return format(String.valueOf(m), width);
*/
public static String format(int m, int width)
{
 return format(String.valueOf(m), width);
}

/**
*  Returns <code>x</code> padded with spaces on the left to make
*  a string of a given width (if fits)
*  @param <code>width</code> the (minimal) width of the returned string.
*  @return format(String.valueOf(x), width);
*/
public static String format(double x, int width)
{
 return format(String.valueOf(x), width);
}

/**
*  Converts <code>x</code> into a string using
*  a DecimalFormat with the specified precision.  Returns the resulting
*  string, padded with spaces on the left to make
*  a string of a given width (if fits)
*  @param <code>width</code> the (minimal) width of the returned string.
*  @return the formatted and padded string
*/
public static String format(double x, int width, int precision)
{
 DecimalFormat df;
 if (precision > 0)
   df = new DecimalFormat("0." + zeroes.substring(0, precision));
 else
   df = new DecimalFormat("0");

 return format(df.format(x), width);
}

private static final String spaces = 
 "                                                                        ";
private static final String zeroes = 
 "0000000000000000";
}