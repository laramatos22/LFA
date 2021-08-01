import java.util.HashMap;

public class Execute extends CalculatorBaseVisitor<Long> {

   HashMap<String, Long> map = new HashMap<>();

   @Override public Long visitProgram(CalculatorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Long visitExprStat(CalculatorParser.ExprStatContext ctx) {
      //return visitChildren(ctx);

      if (ctx.expr() != null) {
         long res = visit(ctx.expr());
         System.out.println(res);
      }
      return null;
   }

   @Override public Long visitAssignStat(CalculatorParser.AssignStatContext ctx) {
      //return visitChildren(ctx);

      if (ctx.assignment() != null) {
         long res = visit(ctx.assignment());
         System.out.println(res);
      }
      return null;
   }

   @Override public Long visitAssignment(CalculatorParser.AssignmentContext ctx) {
      //return visitChildren(ctx);

      /* No assignment, cada ID é igual a um expr, logo cria-se uma HashMap para facilitar
      a criação dessa igualdade: key = value */
      String key = ctx.ID().getText();
      long val = visit(ctx.expr());
      map.put(key, val);
      return val;
   }

   @Override public Long visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op.getText()) {
         case "+":
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
         
         case "-":
            return visit(ctx.expr(0)) + visit(ctx.expr(1));
      
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

   @Override public Long visitExprId(CalculatorParser.ExprIdContext ctx) {
      //return visitChildren(ctx);

      String key = ctx.ID().getText();
      if (map.containsKey(key))
         return map.get(key);
      else
         System.out.println("Variavel " + key + "nao foi encontrada!");
         return 0L;
   }

   @Override public Long visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op.getText()) {
         case "*":
            return visit(ctx.expr(0)) * visit(ctx.expr(1));
            
         case "/":
            if (visit(ctx.expr(1)) != null) {
               return visit(ctx.expr(0)) / visit(ctx.expr(1));
            } else {
               return 0L;
            }
            
         case "%":
         if (visit(ctx.expr(1)) != null) {
            return visit(ctx.expr(0)) % visit(ctx.expr(1));
         } else {
            return 0L;
         }
      
         default:
            System.out.println("Error: visitExprMultDivMod");
      }
      return null;
   }
}
