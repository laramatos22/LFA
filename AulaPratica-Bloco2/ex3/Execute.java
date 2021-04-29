import javax.lang.model.util.ElementScanner14;

public class Execute extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
      }

      if (result != null) {
         System.out.println("Result: " + visit(ctx.expr()));
      }
      
      return null;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer num0 = visit(ctx.expr(0));
      Integer num1 = visit(ctx.expr(1));
      //String op = ctx.op.getText();      
      Integer result = null;

      if ((num0 != null) && (num1 != null)) {
         switch (ctx.op.getText()) {
            case "+":
               result = num0 + num1;
               break;
   
            case "-":
               result = num0 - num1;
               break;
         
            default:
               result = null;
         }
      }

      return result;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer result = Integer.parseInt(ctx.getText());
      return result;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer num0 = visit(ctx.expr(0));
      Integer num1 = visit(ctx.expr(1));
      //String op = ctx.op.getText();      
      Integer result = 0;

      if ((num0 != null) && (num1 != null)) {
         switch (ctx.op.getText()) {
            case "*":
               result = num0 * num1;
               break;
   
            case "/":
               if (num1 == 0) {
                  System.out.println("ERRO");
               } 
               else 
               {
                  result = num0 / num1;
                  break;
               }
               
            case "%":
               result = num0 % num1;
               break;
               
            default:
               result = null;
         }
      }

      return result;
   }
}
