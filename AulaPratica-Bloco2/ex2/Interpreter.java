public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      Double result = null;

      if (ctx.expr() != null) {
         result = visit(ctx.expr());   
      }
      
      if (result != null) {
         System.out.println("Result: " + result);
      }
      return null;
   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      Double result = Double.parseDouble(ctx.getText());
      return result;
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double num0 = visit(ctx.expr(0));
      Double num1 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double result = null;

      if (num0 != null && num1 != null) {
         switch (op) {
            case "+":
               result = num0 + num1;
               break;
            
            case "-":
               result = num0 - num1;
               break;
   
            case "/":
               if (num1 == 0) {
                  System.out.println("Error: divide by zero!");
               } else {
                  result = num0 / num1;
               }
               break;
   
            case "*":
               result = num0 * num1;
               break;
         
            default:
               result = null;
         }
      }
      
      return result;
   }
}
