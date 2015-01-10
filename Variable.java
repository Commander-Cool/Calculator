package calc;

class Variable extends Expr {
  String n;

  Variable(String x) { n = x; }
  public String toString() { return n; }
  public boolean isGround() { return true; }
}
