import java.util.Iterator;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitStatements(HelloParser.StatementsContext ctx) {
      return visitChildren(ctx);
   }

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      //return visitChildren(ctx);

      System.out.println("Ola " + visit(ctx.name()));
      return null;
   }

   @Override public String visitGoodBye(HelloParser.GoodByeContext ctx) {
      //return visitChildren(ctx);

      System.out.println("Adeus " + visit(ctx.name()));
      return null;
   }

   @Override public String visitName(HelloParser.NameContext ctx) {
      //return visitChildren(ctx);

      //->Um iterador é uma função que, cada vez que é chamada, produz um ou mais itens que correspondem a um elemento de uma sequência
      
      Iterator<TerminalNode> iter = ctx.ID().iterator();      
      String res="";

      while(iter.hasNext()) {
         res += iter.next() + " ";
      }

      return res.trim();   // The trim() method removes whitespace from both ends of a string.


   }
}
