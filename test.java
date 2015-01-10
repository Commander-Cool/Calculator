package calc;

public class test {
	public static void main (String[]args){
		String exprs = "3+(7*(5+7)/7*(6+3))";
		System.out.print(getExpr(exprs, 5));
		
	}

	private static String getExpr(String exprs, int high) {
		String expr = "";
		for (int x = high;x<=exprs.length();x++){
			if (exprs.charAt(x)==')'){
				break;
			}else{
				expr.concat(String.valueOf(exprs.charAt(x)));
			}
		}return expr;
	}
}
