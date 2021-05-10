import java.util.*;

public class Execute extends CalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(CalculatorParser.StatContext ctx) {
      Double result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
      }

      if (result != null) {
         System.out.println("Result: " + visit(ctx.expr()));
      }
      
      return null;
   
   }

   @Override public Double visitAssingment(CalculatorParser.AssingmentContext ctx) {
      Hashtable<String, Double> hash = new Hashtable<String, Double>();
      String id = "";
      Double expr = visit(ctx.expr());
      Double result = Double.parseDouble(ctx.getText());
      result = hash.put(id, expr);
      return result;

   }

   @Override public Double visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Double num0 = visit(ctx.expr(0));
      Double num1 = visit(ctx.expr(1));
      //String op = ctx.op.getText();      
      Double result = null;

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

   @Override public Double visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Double visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Double result = Double.parseDouble(ctx.getText());
      return result;
   }

   @Override public Double visitExprId(CalculatorParser.ExprIdContext ctx) {
      return visit(ctx.ID());
   }

   @Override public Double visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Double num0 = visit(ctx.expr(0));
      Double num1 = visit(ctx.expr(1));
      //String op = ctx.op.getText();      
      Double result = null;

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
