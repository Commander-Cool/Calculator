package calc;

class Minus extends Expr { // NOT BinaryOp!
	Expr left;
	Expr right;
	static String input;

	Minus(Expr x, Expr y) {
		left = x;
		right = y;
	}

	Minus(String x) {

		x = input;

	}

	public int Minus(String expression) {
		String[] e = new String[2];
		e = expression.split("\\-");
		int value = Integer.valueOf(e[0]) - Integer.valueOf(e[1]);
		return (value);

	}

	public String toString() {
		return betweenParens(left) + " - " + betweenParens(right);
	}

	public boolean isGround() {
		return false;
	}

	public int getVal(int x, int y) {

		return (5);
	}

}
