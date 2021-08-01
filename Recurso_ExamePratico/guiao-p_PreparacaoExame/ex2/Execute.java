import java.util.HashMap;
import java.util.Scanner;

public class Execute extends FracLangBaseVisitor<Fraction> {

   HashMap<String, Fraction> map = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Fraction visitStatAssign(FracLangParser.StatAssignContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.assignment());
   }

   @Override public Fraction visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.display());
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      //return visitChildren(ctx);
      String key = ctx.ID().getText();
      Fraction frac = visit(ctx.expr());

      map.put(key, frac);
      return frac;
   }

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      //return visitChildren(ctx);

      Fraction frac = visit(ctx.expr());
      System.out.println(frac);
      return null;
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);

      String op = ctx.op.getText();

      switch (op) {
         case "+":
            return visit(ctx.expr(0)).addTo(visit(ctx.expr(1)));
         
         case "-":
            return visit(ctx.expr(0)).subTo(visit(ctx.expr(1)));
      }
      return null;
   }

   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprNumber(FracLangParser.ExprNumberContext ctx) {
      //return visitChildren(ctx);
      return new Fraction(Integer.parseInt(ctx.Number().getText()));
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      //return visitChildren(ctx);

      String op = ctx.op.getText();

      switch (op) {
         case "*":
            return visit(ctx.expr(0)).multTo(visit(ctx.expr(1)));
         
         case ":":
            return visit(ctx.expr(0)).divTo(visit(ctx.expr(1)));
      }
      return null;
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      //return visitChildren(ctx);

      String ID = ctx.ID().getText();

      if (!map.containsKey(ID)) {
         System.err.println("ERROR: variable " +  ID + " not found!");
         return null;
      }
      return map.get(ID);
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.expr()).reduce();
   }

   @Override public Fraction visitExprPlusMinus(FracLangParser.ExprPlusMinusContext ctx) {
      //return visitChildren(ctx);

      if (ctx.op.getText() != "+")
         return visit(ctx.expr()).negFrac();
      
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprFraction(FracLangParser.ExprFractionContext ctx) {
      //return visitChildren(ctx);
      return new Fraction(Integer.parseInt(ctx.Number(0).getText()), Integer.parseInt(ctx.Number(1).getText()));
   }

   @Override public Fraction visitExprReadString(FracLangParser.ExprReadStringContext ctx) {
      //return visitChildren(ctx);

      String text = ctx.STRING().getText();
      System.out.print(text.substring(1, text.length() - 1) + ": ");
      String in = sc.nextLine();

      if (in.contains("/")) {
         String[] frac = in.split("/");
         try {
            return new Fraction(Integer.parseInt(frac[0]), Integer.parseInt(frac[1]));
         } catch (Exception e) {
            //TODO: handle exception
            System.err.println("ERROR: invalid input!");
            return null;
         }
      } else {
         try {
            return new Fraction(Integer.parseInt(in));
         } catch (Exception e) {
            //TODO: handle exception
            System.err.println("ERROR: invalid input!");
            return null;
         }
      }
   }
}
