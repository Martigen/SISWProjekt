

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Colorful {
//    public static void main(String[] args) throws IOException {
//        CharStream in = CharStreams.fromFileName("./Colorful.txt");
//        String lines[] = in.toString().split("\\r?\\n");
//
//
//        for (String ln : lines) {
//            ColorfulLexer lexer = new ColorfulLexer(CharStreams.fromString(ln));
//            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
//            ColorfulParser parser = new ColorfulParser(tokenStream);
//            MyColofrulVisitor visitor = new MyColofrulVisitor();
//
//            String[] arr = ln.split(" ");
//            if (arr[0].equals("Black")) {
//                ParseTree tree2 = parser.black();
//                visitor.visit(tree2);
//
//            } else if (arr[0].equals("White")) {
//                ParseTree tree = parser.white();
//                System.out.println(visitor.visit(tree));
//            } else {
//                ParseTree tree = parser.operation();
//                System.out.println(visitor.visit(tree));
//            }
//
//        }


//
//
//
//


   // }

    public static void main(String[] args) throws Exception {

        CharStream in = CharStreams.fromFileName("./Colorful.txt");
        ColorfulLexer lexer = new ColorfulLexer(in);
        ColorfulParser parser = new ColorfulParser(new CommonTokenStream(lexer));
        new MyColofrulVisitor().visit(parser.prog());
    }
}
