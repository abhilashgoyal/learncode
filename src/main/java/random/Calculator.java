package random;

import java.util.Stack;

public class Calculator {

	private int getNextOperatorIndex(String str, int startIndex) {
		int index = str.length();
		for (int i = startIndex + 1; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				index = i;
				break;
			}
		}
		return index;
	}

	private boolean isOpearator(char c) {
		boolean flag = false;
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			flag = true;
		}
		return flag;
	}

	private int getPriority(char c) {
		int priority = 0;
		switch (c) {
		case '/':
			priority = 2;
			break;
		case '*':
			priority = 1;
			break;
		case '+':
		case '-':
			priority = 0;
			break;
		default:
			priority = Integer.MIN_VALUE;
		}
		return priority;
	}

	private float getResult(float firstOperand, float secondOperand, char oprator) {
		float result;
		switch (oprator) {
		case '/':
			result = firstOperand / secondOperand;
			break;
		case '*':
			result = firstOperand * secondOperand;
			break;
		case '+':
			result = firstOperand + secondOperand;
			break;
		case '-':
			result = firstOperand - secondOperand;
			break;
		default:
			result = Integer.MIN_VALUE;
		}
		return result;

	}

	/*
	 * expression= 2*3+15/6*3+5*6
	 */
	public float calculate(String input) {
		Stack<Character> operatorStack = new Stack<Character>();
		Stack<Float> operandStack = new Stack<Float>();
		int currentPosition = 0;
		while (currentPosition < input.length()) {
			char tempChar = input.charAt(currentPosition);

			if (isOpearator(tempChar)) {
				if (!operatorStack.isEmpty() && (getPriority(tempChar) <= getPriority(operatorStack.peek()))) {
					float secondOperand = operandStack.pop();
					float firstOperand = operandStack.pop();
					char operator = operatorStack.pop();
					operandStack.push(getResult(firstOperand, secondOperand, operator));
				}

				operatorStack.push(tempChar);
				currentPosition++;
			} else {
				int nextPosition = getNextOperatorIndex(input, currentPosition);
				String operator = input.substring(currentPosition, nextPosition);
				operandStack.push(Float.parseFloat(operator));
				currentPosition = nextPosition;
			}
		}

		while (!operatorStack.isEmpty()) {
			float secondOperand = operandStack.pop();
			float firstOperand = operandStack.pop();
			operandStack.push(getResult(firstOperand, secondOperand, operatorStack.pop()));
		}
		return operandStack.pop();
	}

	public static void main(String... o) {
		Calculator ob = new Calculator();
		System.out.println(ob.calculate("2*3+15/6*3+5*6"));
		System.out.println(ob.calculate("2*3+5/6*3+15"));
	}
}
