/**
* ******************************************************************************************************************* 
*	Program name        : 	Single Print method
*	Program Description :	Let's say you have an integer array and a string array. You have to write a single method
*							printarray that can print all the elements of both arrays. The method should be able to 
*							accept both integer and string arrays.
*  ****************************************************************************************************************** 
*
*/
package com.training.Apr19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author trainee
 *
 */
public class SinglePrintMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, List> mapOfLists = new HashMap<String, List>();
		ArrayList<String> listOfStrings = new ArrayList<String>();
		ArrayList<Integer> listOfIntegers = new ArrayList<Integer>();

		mapOfLists.put("strings", listOfStrings);
		mapOfLists.put("integers", listOfIntegers);

		mapOfLists.get("strings").add("value");
		mapOfLists.get("integers").add(new Integer(10));
	}

}
