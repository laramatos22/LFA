import java.util.*;

public class Execute extends CalFracBaseVisitor<Fraction> {

   HashMap<String, Fraction> map = new HashMap<>();

   @Override public Fraction visitProgram(CalFracParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Fraction visitStat(CalFracParser.StatContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Fraction visitPrint(CalFracParser.PrintContext ctx) {
      //return visitChildren(ctx);
      System.out.println(visit(ctx.expr()));
      return null;
   }

   @Override public Fraction visitAssignment(CalFracParser.AssignmentContext ctx) {
      //return visitChildren(ctx);

      String key = ctx.ID().getText();
      Fraction frac = visit(ctx.expr());
      map.put(key, frac);
      return frac;
   }

   @Override public Fraction visitExprAddSub(CalFracParser.ExprAddSubContext ctx) {
      //return visitChildren(ctx);

      Fraction f1 = visit(ctx.expr(0));
      int num1 = f1.getNum();
      int den1 = f1.getDen();

      Fraction f2 = visit(ctx.expr(1));
      int num2 = f2.getNum();
      int den2 = f2.getDen();
      
      String op = ctx.op.getText();

      Fraction fres = null;

      switch (op) {
         case "+":
            if (den1 != den2) {
               fres = new Fraction(((num1*den2) + (num2*den1)), (den1*den2));
            } else {    // den1==den2, os denominadores sendo iguais, soma-se os numeradores
               fres = new Fraction((num1 + num2), den1);
            }
            break;

         case "-":
         if (den1 != den2) {
            fres = new Fraction(((num1*den2) - (num2*den1)), (den1*den2));
         } else {    // den1==den2, os denominadores sendo iguais, subtrai-se os numeradores
            fres = new Fraction((num1 - num2), den1);
         }
            break;
      }
      return fres;
   }

   @Override public Fraction visitExprPotencia(CalFracParser.ExprPotenciaContext ctx) {
      //return visitChildren(ctx);

      Fraction f1 = visit(ctx.fraction());

      int expoente = Integer.parseInt(ctx.Integer().getText());

      int num1 = f1.getNum();
      int den1 = f1.getDen();
      int num = 1;
      int den = 1;

      for (int i = 1; i <= expoente; i++) {
         num = num * num1;
         den = den * den1;
      }
      return new Fraction(num, den);
   }

   @Override public Fraction visitExprParent(CalFracParser.ExprParentContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprMultDiv(CalFracParser.ExprMultDivContext ctx) {
      //return visitChildren(ctx);

      Fraction f1 = visit(ctx.expr(0));
      int num1 = f1.getNum();
      int den1 = f1.getDen();

      Fraction f2 = visit(ctx.expr(1));
      int num2 = f2.getNum();
      int den2 = f2.getDen();
      
      String op = ctx.op.getText();

      Fraction fres = null;

      switch (op) {
         case "*":
               fres = new Fraction((num1*num2), (den1*den2));
            break;

         case ":":
            fres = new Fraction((num1*den2), (den1*num2));
            break;
      }
      return fres;
   }

   @Override public Fraction visitExprPlusMinus(CalFracParser.ExprPlusMinusContext ctx) {
      //return visitChildren(ctx);

      if (ctx.sign != null) {
         if (ctx.sign.getText().equals("-")) {
            int value = Integer.parseInt(ctx.Integer().getText());
            return new Fraction(value * (-1), 1);
         }
         else if (ctx.sign.getText().equals("+")) {
            return new Fraction(Integer.parseInt(ctx.Integer().getText()), 1);
         }
      } else {
         return new Fraction(Integer.parseInt(ctx.Integer().getText()), 1);
      }
      return null;
   }

   @Override public Fraction visitExprReduce(CalFracParser.ExprReduceContext ctx) {
      //return visitChildren(ctx);

      Fraction f1 = visit(ctx.fraction());
      int num = f1.getNum();
      int den = f1.getDen();
      int max = 1;
      
      if(num > den){
         for (int i = 2; i <= den; i++){
            if( (num % i == 0) && (den % i == 0) ){
               max = i;
            }
         }
      }
      else if(den > num){
         for (int i = 2; i <= num; i++){
            if( (num % i == 0) && (den % i == 0) ){
               max = i;
            }
         } 
	  }
	  return new Fraction(num/max, den/max);
   }

   @Override public Fraction visitExprId(CalFracParser.ExprIdContext ctx) {
      //return visitChildren(ctx);

      if (map.containsKey(ctx.ID().getText())) {
         return map.get(ctx.ID().getText());
      } else {
         System.out.println("Error: ID sem valor atribuido!");
      }
      return null;
   }

   @Override public Fraction visitExprFraction(CalFracParser.ExprFractionContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.fraction());
   }

   @Override public Fraction visitFraction(CalFracParser.FractionContext ctx) {
      //return visitChildren(ctx);

      if (ctx.sign != null){
         if(ctx.sign.getText().equals("+")){
          return new Fraction(Integer.parseInt(ctx.num.getText()), Integer.parseInt(ctx.den.getText()));
         }
         else if(ctx.sign.getText().equals("-")){
          int val = Integer.parseInt(ctx.num.getText());
          return new Fraction(val * -1, Integer.parseInt(ctx.den.getText()));
         }
      }
       return new Fraction(Integer.parseInt(ctx.num.getText()), Integer.parseInt(ctx.den.getText()));
   }
}
