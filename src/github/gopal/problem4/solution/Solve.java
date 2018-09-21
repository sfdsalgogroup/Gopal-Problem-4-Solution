/**
 * 
 */
package github.gopal.problem4.solution;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static void reArrangeAllZerosToLast(Integer[] input) {
		int inputLength = input.length;
		if (inputLength == 0) {
			return;
		}
		int nextReplacementIndex = 0;
		Integer temp;
		for (int i = 0; i < inputLength; i++) {
			if (input[i] != 0) {
				temp = input[nextReplacementIndex];
				input[nextReplacementIndex] = input[i];
				input[i] = temp;
				nextReplacementIndex++;
			}
		}
	}

}
