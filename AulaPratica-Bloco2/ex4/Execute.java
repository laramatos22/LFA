public class Execute extends CalculadoraPrefixaBaseVisitor<Double> {

   @Override public Double visitProgram(CalculadoraPrefixaParser.ProgramContext ctx) {
      Integer result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
      }

      if (result != null) {
         System.out.println("Result: " + visit(ctx.expr()));
      }
      
      return null;
   }

   @Override public Double visitStat(CalculadoraPrefixaParser.StatContext ctx) {
      Double result = Double.parseDouble(ctx.getText());
      return result;
   }

   @Override public Double visitExprPreffix(CalculadoraPrefixaParser.ExprPreffixContext ctx) {
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

   @Override public Double visitExprNumber(CalculadoraPrefixaParser.ExprNumberContext ctx) {
      return visitChildren(ctx);
   }
}
