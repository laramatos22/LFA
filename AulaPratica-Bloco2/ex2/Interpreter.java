public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      System.out.println("Result: " + visit(ctx.expr()));
      return null;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      double result = Double.parseDouble(ctx.getText());
      return result;
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      double num0 = visit(ctx.expr(0));
      double num1 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      double result = 0;

      switch (op) {
         case "+":
            result = num0 + num1;
            break;
         
         case "-":
            result = num0 - num1;
            break;

         case "/":
            result = num0 / num1;
            break;

         case "*":
            result = num0 * num1;
            break;
      
         default:
            result = 0;
            break;
      }
      return result;
   }
}
