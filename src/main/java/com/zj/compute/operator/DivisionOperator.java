
package com.zj.compute.operator;

/**
 * The division operator.
 */
public class DivisionOperator extends AbstractOperator {

	/**
	 * Default constructor.
	 */
	public DivisionOperator() {
		super("/", 6);
	}

	/**
	 * Evaluates two double operands.
	 * 
	 * @param leftOperand
	 *            The left operand being evaluated.
	 * @param rightOperand
	 *            The right operand being evaluated.
	 */
	public double evaluate(final double leftOperand, final double rightOperand) {
		Double rtnValue = new Double(leftOperand / rightOperand);

		return rtnValue.doubleValue();
	}
}