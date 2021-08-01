public class Execute extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      //return visitChildren(ctx);

      if (ctx.expr() != null) {
         double res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;

   }

   @Override public Double visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      //return visitChildren(ctx);

      return Double.parseDouble(ctx.Number().getText());

   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      //return visitChildren(ctx);

      /* Também podia estar:
      Double exp0 = visit(ctx.expr(0));
      Double exp1 = visit(ctx.expr(1));
      */

      switch (ctx.op.getText()) {
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
            System.out.println("Operador nao válido!");
      }

      return null;

   }
}
