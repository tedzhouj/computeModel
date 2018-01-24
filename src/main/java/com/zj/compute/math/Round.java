
package com.zj.compute.math;

import com.zj.compute.Evaluator;
import com.zj.compute.function.Function;
import com.zj.compute.function.FunctionConstants;
import com.zj.compute.function.FunctionException;
import com.zj.compute.function.FunctionResult;

/**
 * This class is a function that executes within Evaluator. The function returns
 * the closet long to a double value. See the Math.round(double) method in the
 * JDK for a complete description of how this function works.
 */
public class Round implements Function {
	/**
	 * Returns the name of the function - "round".
	 * 
	 * @return The name of this function class.
	 */
	public String getName() {
		return "round";
	}

	/**
	 * Executes the function for the specified argument. This method is called
	 * internally by Evaluator.
	 * 
	 * @param evaluator
	 *            An instance of Evaluator.
	 * @param arguments
	 *            A string argument that will be converted to a double value and
	 *            evaluated.
	 * 
	 * @return A long value that is closest to the argument.
	 * 
	 * @exception FunctionException
	 *                Thrown if the argument(s) are not valid for this function.
	 */
	public FunctionResult execute(final Evaluator evaluator, final String arguments)
			throws FunctionException {
		Long result = null;
		Double number = null;

		try {
			number = new Double(arguments);
		} catch (Exception e) {
			throw new FunctionException("Invalid argument.", e);
		}

		result = new Long(Math.round(number.doubleValue()));

		return new FunctionResult(result.toString(), 
				FunctionConstants.FUNCTION_RESULT_TYPE_NUMERIC);
	}
}