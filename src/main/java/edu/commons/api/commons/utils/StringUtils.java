/**
 * 
 */
package edu.commons.api.commons.utils;

/**
 * @author Praveen
 *
 */
public class StringUtils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isNullOrBlank(String string) {

		boolean result = false;
		if (string != null && string.trim().length() != 0) {
			result = false;
		} else {
			result = true;
		}
		return result;

	}
}
