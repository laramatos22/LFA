public class Execute extends CalculatorBaseVisitor<String> {

   @Override public String visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitExprStat(CalculatorParser.ExprStatContext ctx) {
      //return visitChildren(ctx);

      if(ctx.expr() != null) {
         String res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public String visitAssignStat(CalculatorParser.AssignStatContext ctx) {
      //return visitChildren(ctx);

      if(ctx.assignment() != null) {
         String res = visit(ctx.assignment());
         System.out.println(res);
      }
      return null;
   }

   @Override public String visitAssignment(CalculatorParser.AssignmentContext ctx) {
      //return visitChildren(ctx);
      return ctx.ID().getText() + " = " + visit(ctx.expr());
   } 

   @Override public String visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);

      if (ctx.op.getText().equals("+") || ctx.op.getText().equals("-")) {
         return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
      } else {
         return null;
      }
   }

   @Override public String visitExprParent(CalculatorParser.ExprParentContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.expr());
   }

   @Override public String visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      //return visitChildren(ctx);
      return ctx.Integer().getText();
   }

   @Override public String visitExprMinusPlus(CalculatorParser.ExprMinusPlusContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op.getText()) {
         case "+":
            return visit(ctx.expr()) + " !+";
            
         case "-":
            return visit(ctx.expr()) + " !-";
      }
      return null;
   }

   @Override public String visitExprId(CalculatorParser.ExprIdContext ctx) {
      //return visitChildren(ctx);
      return ctx.ID().getText();
   }

   @Override public String visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      
      if (ctx.op.getText().equals("*") || ctx.op.getText().equals("/") || ctx.op.getText().equals("%")) {
         return visit(ctx.expr(0)) + " " + visit(ctx.expr(1)) + " " + ctx.op.getText();
      } else {
         return null;
      }
   }
}
