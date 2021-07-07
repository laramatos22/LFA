import java.util.HashMap;
import java.util.Scanner;
import java.lang.Math;

public class Execute extends FractionCalculatorBaseVisitor<Double> {

   HashMap<String, Double> vars = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public Double visitAssignment(FractionCalculatorParser.AssignmentContext ctx) {
      //return visitChildren(ctx);

      vars.put(ctx.ID().getText(), visit(ctx.expr()));
      return null;
   }

   @Override public Double visitPrint(FractionCalculatorParser.PrintContext ctx) {
      //return visitChildren(ctx);

      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override public Double visitExprAddSub(FractionCalculatorParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);
      Double result = null;
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));

      switch (ctx.op2.getText()) {
         case "+":
            result = num1 + num2;
            break;
         
         case "-":
            result = num1 - num2;
            break;
      }

      return result;

   }

   @Override public Double visitExprUnary(FractionCalculatorParser.ExprUnaryContext ctx) {
      //return visitChildren(ctx);

      switch (ctx.op2.getText()) {
         case "+":
            return 0 + visit(ctx.expr());

         case "-":
            return 0 - visit(ctx.expr());
      }

      return null;

   }

   @Override public Double visitExprNumber(FractionCalculatorParser.ExprNumberContext ctx) {
      //return visitChildren(ctx);

      Double a = Double.parseDouble(ctx.Number().getText());
      return a/1;

   }

   @Override public Double visitExprParenthesis(FractionCalculatorParser.ExprParenthesisContext ctx) {
      //return visitChildren(ctx);

      return visit(ctx.expr());

   }

   @Override public Double visitExprAssignment(FractionCalculatorParser.ExprAssignmentContext ctx) {
      //return visitChildren(ctx);

      System.out.println(ctx.prompt.getText());
      return Double.parseDouble(sc.nextLine());

   }

   @Override public Double visitExprId(FractionCalculatorParser.ExprIdContext ctx) {
      //return visitChildren(ctx);

      return vars.get(ctx.ID().getText());
   }

   @Override public Double visitExprReduce(FractionCalculatorParser.ExprReduceContext ctx) {
      //return visitChildren(ctx);

      return visit(ctx.expr());

   }

   @Override public Double visitExprFraction(FractionCalculatorParser.ExprFractionContext ctx) {
      //return visitChildren(ctx);

      Double a = Double.parseDouble(ctx.Number(0).getText());
		Double b = Double.parseDouble(ctx.Number(1).getText());
      return a / b;

   }

   @Override public Double visitExprMultDivPotencia(FractionCalculatorParser.ExprMultDivPotenciaContext ctx) {
      //return visitChildren(ctx);

      Double result = null;
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));

      switch (ctx.op.getText()) {
         case "*":
            result = num1*num2;
            break;
         
         case "/":
            result = num1/num2;
            break;

         case "^":
            result = Math.pow(num1, num2);
            break;
      }

      return result;

   }
}
