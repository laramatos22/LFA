public class Execute extends CalculatorBaseVisitor<Long> {

   @Override public Long visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Long visitStat(CalculatorParser.StatContext ctx) {
      //return visitChildren(ctx);

      if (ctx.expr() != null) {
         long res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public Long visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op.getText()) {
         case "+":
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
         
         case "-":
            return visit(ctx.expr(0)) - visit(ctx.expr(1));
      
         default:
            System.out.println("Error: visitExprAddSub");
      }
      return null;
   }

   @Override public Long visitExprParent(CalculatorParser.ExprParentContext ctx) {
      //return visitChildren(ctx);

      return visit(ctx.expr());
   }

   @Override public Long visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      //return visitChildren(ctx);

      return Long.parseLong(ctx.Integer().getText());
   }

   @Override public Long visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op.getText()) {
         case "*":
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
         
         case "/":
            if (visit(ctx.expr(1)) != 0) {
               return visit(ctx.expr(0)) / visit(ctx.expr(1));
            } else {
               return 0L;
            }
            
         default:
            System.out.println("Error: visitExprMultDivMod");
      }
      return null;      
   }
}
