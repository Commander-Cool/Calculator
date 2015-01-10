package calc;

class Divide extends Expr { // NOT BinaryOp!
	Expr left;
	Expr right;
	static String input;

	Divide(Expr x, Expr y) {
		left = x;
		right = y;
	}

	Divide(String x) {

		input = x;
	}

	public float Divide(String expression, boolean mode) {
		String[] e = new String[2];
		e = expression.split("\\/");
		if (mode == true) {
			int value = Integer.valueOf(e[0]) / Integer.valueOf(e[1]);
			return (value);
		} else {
			float value = Float.valueOf(e[0]) / Float.valueOf(e[1]);
			return (value);
		}
	}

	public String toString() {
		return betweenParens(left) + " / " + betweenParens(right);
	}

	public boolean isGround() {
		return false;
	}
}
