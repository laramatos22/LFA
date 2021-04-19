import java.util.Iterator;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitTop(HelloParser.TopContext ctx) {
      return visitChildren(ctx);
   }
   
   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      System.out.println("Olá" + ctx.ID().getText());
      return null;
   }

   @Override public String visitBye(HelloParser.ByeContext ctx) {
      System.out.println("Adeus" + ctx.ID().getText());
      return null;
   }

   @Override public String visitName(HelloParser.NameContext ctx) {
      Iterator<TerminalNode> it = ctx.ID().iterator();
      String res = "";

      while (it.hasNext()) {
         res += it.next()+" ";
      }
      return res.trim();
   }

}
