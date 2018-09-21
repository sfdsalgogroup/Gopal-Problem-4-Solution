/**
 * 
 */
package github.gopal.problem4.main;

import java.util.Arrays;

import github.gopal.problem4.solution.Solve;
import github.gopal.problem4.util.InputCreator;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] input = InputCreator.getInput();
		System.out.println(Arrays.toString(input));

		Solve.reArrangeAllZerosToLast(input);

		System.out.println(Arrays.toString(input));
	}

}
