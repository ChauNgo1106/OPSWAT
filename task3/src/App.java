import java.io.BufferedReader;
import java.io.FileReader;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    private static Integer result = Integer.MAX_VALUE;
    public static void main(String[] args) throws Exception {
        //read the file and extract commands line by line
        BufferedReader br = new BufferedReader(new FileReader("src\\input.txt"));

        String currentLine = br.readLine();        
        while(currentLine != null){
            buildParserandExecution(currentLine);
            currentLine = br.readLine();
        }

        br.close();
        // String expression = "add 2 3";
        // buildParserandExecution(expression);
    }
    
    public static void buildParserandExecution(String expression){
        // Create an input stream from the input string
        CharStream inputStream = CharStreams.fromString(expression);

        // Create a lexer that feeds off of the input stream
        SimpleScriptLexer lexer = new SimpleScriptLexer(inputStream);

        // Create a token stream from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create a parser that feeds off of the token stream
        SimpleScriptParser parser = new SimpleScriptParser(tokens);

        // Begin parsing at the 'expr' rule
        ParseTree tree = parser.script();

        //execution the operation being parsed.
        execution(tree, parser);
    }
    public static void execution(ParseTree tree, SimpleScriptParser parser){
        String command = tree.toStringTree(parser);

        System.out.println(tree.toStringTree(parser));

        if(command.contains("exit")){
            System.out.println("Exiting...");
            System.exit(0);
            System.out.println("I can not reach to this line");
        } else if(command.indexOf("add") != -1){
            result = calculation("add", command);
            System.out.println("Adding...");
        } else if(command.indexOf("substract") != -1){
            result = calculation("substract", command);
            System.out.println("Substracting...");
        } else if (command.contains("print")){
            if(command.contains("result")){
                System.out.println("The result is: " + result);
            } else {
                int start = command.indexOf("print", command.indexOf("print") + 1) + 6;

                int end = command.indexOf(")");

                String str = command.substring(start, end);

                System.out.println(str);
            }
        } else{
            System.err.println("I can not process your command");
            System.err.println("Exiting...");
            System.exit(0);
        }
    }

    public static int calculation(String operation, String command){
          //command example "(script (command (addCmd substract 10112 2)))"
          int leftOperandIndex = command.indexOf(operation, command.indexOf(operation) + 1) + operation.length() + 1;
          
          int start = leftOperandIndex;

          int end = leftOperandIndex;

          while(Character.isDigit(command.charAt(end))){
              end++;
          }

          int leftOperand = Integer.parseInt(command.substring(start, end));

          end = end + 1;

          start = end;

          while(Character.isDigit(command.charAt(end))){
              end++;
          }

          int rightOperand = Integer.parseInt(command.substring(start, end));

          if(operation.equals("substract")) result = leftOperand - rightOperand;
          else result = leftOperand + rightOperand;

          return result;
    }
}
