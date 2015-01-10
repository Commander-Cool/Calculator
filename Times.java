package calc;

class Times extends BinaryOp {
	static String input;
	
	Times(Expr x, Expr y) {
		left = x;
		right = y;
   }

	Times (String x) {
		input = x;
	}
   
   
   public int Times(String expression) {
		String[] listExpression = new String[2];
		listExpression = expression.split("\\*");
		int value = Integer.valueOf(listExpression[0]) * Integer.valueOf(listExpression[1]);	
		return (value);
	}

	public String toString() {
		// we are the context
		return super.toString(this, " * ");
	}

	public boolean isSame(Expr e) {
		return e instanceof Times;
	}
}
