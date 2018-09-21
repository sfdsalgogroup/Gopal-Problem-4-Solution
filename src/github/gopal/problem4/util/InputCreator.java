/**
 * 
 */
package github.gopal.problem4.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gopal
 *
 */
public class InputCreator {
	
	private InputCreator() {
		//NOOP
	}
	
	public static Integer[] getInput() {
		List<Integer> numbersList = new ArrayList<Integer>();
		
		numbersList.add(0);
		numbersList.add(0);
		numbersList.add(1);
		numbersList.add(0);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(0);
		numbersList.add(0);
		numbersList.add(4);
		numbersList.add(0);
		numbersList.add(5);
		
		return numbersList.toArray(new Integer[numbersList.size()]);
	}

}
