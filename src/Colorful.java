import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class Colorful {
    public static void main(String[] args) throws Exception {
        CharStream in = CharStreams.fromFileName("./colorful.txt");
        ColorfulLexer lexer = new ColorfulLexer(in);
        ColorfulParser parser = new ColorfulParser(new CommonTokenStream(lexer));
        new MyColorfulVisitor().visit(parser.parse());
    }
}
