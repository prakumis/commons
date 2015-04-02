/**
 * 
 */
package edu.commons.api.commons.utils;

/**
 * @author emiprav
 *
 */
public class StringUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String isNullOrBlank(String str) {
		System.out.println("Incoming string is: "+str);
		if(null==str) {
			return null;
		} else {
			return str.trim();
		}
	}
}
