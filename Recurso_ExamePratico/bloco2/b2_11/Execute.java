import java.util.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

public class Execute extends SetCalcMainBaseVisitor<Set<Integer>> {

   HashMap<String, Set<Integer>> map = new HashMap<>();

   @Override public Set visitProgram(SetCalcMainParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override public Set<Integer> visitStatAssign(SetCalcMainParser.StatAssignContext ctx) {
      //return visitChildren(ctx);

      if (ctx.assignment() != null) {
         Set<Integer> s = visit(ctx.assignment());
         System.out.println(setToString(s));
      }
      return null;

   }

   @Override public Set<Integer> visitStatExpr(SetCalcMainParser.StatExprContext ctx) {
      //return visitChildren(ctx);

      if (ctx.expr() != null) {
         Set<Integer> s = visit(ctx.expr());
         System.out.println(setToString(s));
      }
      return null;

   }

   @Override public Set<Integer> visitAssignment(SetCalcMainParser.AssignmentContext ctx) {
      //return visitChildren(ctx);
      map.put(ctx.Variables().getText(), visit(ctx.expr()));
      return visit(ctx.expr());
   }

   @Override public Set<Integer> visitExprVariables(SetCalcMainParser.ExprVariablesContext ctx) {
      //return visitChildren(ctx);
      return map.get(ctx.Variables().getText());
   }

   @Override public Set<Integer> visitExprParent(SetCalcMainParser.ExprParentContext ctx) {
      //return visitChildren(ctx);
      return visit(ctx.expr());
   }

   @Override public Set<Integer> visitExprNumbers(SetCalcMainParser.ExprNumbersContext ctx) {
      //return visitChildren(ctx);

      Set<Integer> s = new HashSet<>();

      for (TerminalNode n : ctx.Numbers()) {
         String node = n.toString();
         if (node.contains(","))
            node = node.substring(0, node.length() - 1);
         s.add(Integer.parseInt(node));
      }
      return s;
   }

   @Override public Set<Integer> visitExprUnion(SetCalcMainParser.ExprUnionContext ctx) {
      //return visitChildren(ctx);
      
      Set<Integer> s = new HashSet<>();

      for (Integer i : visit(ctx.expr(0))) {
         s.add(i);
      }

      for (Integer i : visit(ctx.expr(1))) {
         s.add(i);
      }
      return s;
   }

   @Override public Set<Integer> visitExprDifference(SetCalcMainParser.ExprDifferenceContext ctx) {
      //return visitChildren(ctx);

      Set<Integer> expr1 = visit(ctx.expr(1));
		Set<Integer> expr0 = visit(ctx.expr(0));
		Set<Integer> s = new HashSet<>();        

		for (Integer i : visit(ctx.expr(0))) {
			if (!expr1.contains(i))
				s.add(i);
		}

		for (Integer i : visit(ctx.expr(1))) {
			if (!expr0.contains(i))
				s.add(i);
		}
		
		return s;
   }

   @Override public Set visitExprIntersect(SetCalcMainParser.ExprIntersectContext ctx) {
      //return visitChildren(ctx);

      Set<Integer> expr1 = visit(ctx.expr(1));
		Set<Integer> s = new HashSet<>();        

		for (Integer i : visit(ctx.expr(0))) {
			if (expr1.contains(i))
				s.add(i);
		}

		return s;
   }

   public String setToString(Set<Integer> s) {
		if(s.isEmpty()) return "{}";
		String res = "{";
		
		for(Integer n : s) {
			res += n + ",";
		}
		res = res.substring(0, res.length() - 1);
		res += "}";
		
		return res;
	}
}
