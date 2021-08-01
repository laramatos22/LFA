public class Execute extends PrefixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PrefixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(PrefixCalculatorParser.StatContext ctx) {
      //return visitChildren(ctx);

      if (ctx.expr() != null) {
         double res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;

   }

   @Override public Double visitExprPrefix(PrefixCalculatorParser.ExprPrefixContext ctx) {
      //return visitChildren(ctx);

      switch(ctx.op.getText()) {
         case "+":
               return visit(ctx.expr(0)) + visit(ctx.expr(1)); 
         
         case "-":
               return visit(ctx.expr(0)) - visit(ctx.expr(1)); 
         
         case "*":
               return visit(ctx.expr(0)) * visit(ctx.expr(1)); 
         
         case "/":
               if (visit(ctx.expr(1)) != 0) {
                  return visit(ctx.expr(0)) / visit(ctx.expr(1)); 
               } else {
                  return 0.0;
               }

         default: 
               System.out.println("Operator not valid");
      }
      return null;
   }

   @Override public Double visitExprNumber(PrefixCalculatorParser.ExprNumberContext ctx) {
      //return visitChildren(ctx);

      return Double.parseDouble(ctx.Number().getText());

   }
}
