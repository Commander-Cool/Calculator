package calc;

class UnaryMinus extends Expr {
  Expr e;

  UnaryMinus(Expr x) { e = x; }
  public String toString() { return "-" + e.toString(); }
  public boolean isGround() { return false; }
  
  
  
  
  
  
}
