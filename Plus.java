package calc;

class Plus extends BinaryOp {

	static String input;

	Plus(Expr x, Expr y) {
		left = x;
		right = y;
	}

	Plus(String x) {

		input = x;
	}

	public int Plus(String expression) {
		String[] e = null;
		e = expression.split("\\+");
		int value = Integer.valueOf(e[0]) + Integer.valueOf(e[1]);
		return (value);

	}

	public String toString() {
		// we are the context
		return super.toString(this, " + ");
	}

	public boolean isSame(Expr e) {
		return e instanceof Plus;
	}
}
