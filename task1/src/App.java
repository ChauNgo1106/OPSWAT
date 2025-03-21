import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import analysis.TextAnalyser;
import parser.FileParser;
import report.WriteReport;

public class App {
    public static void main(String[] args) throws Exception {
        // Call File Parser to read file
        FileParser fp = new FileParser("src\\resources\\input.txt");
        List<String> words = new ArrayList<>();        
        try {
            words = fp.readFile();
            // Uncomment if you want to view the words read from input files
            // for(String word: words){
            //     System.out.println(word);
            // }
        } catch (IOException e) {
            System.err.println("Something is wrong while reading your file provided");
            e.printStackTrace();
        }
        
        // Call TexAnalyser to analyze what would be the frequencies of words read from input file
        TextAnalyser ta = new TextAnalyser();
        ta.buildWordFrequency(words);
        String report = ta.report();

        // Call Report Generator to generate a final report at the end
        WriteReport wr = new WriteReport("src\\resources\\report.txt", report);
        try {
            wr.writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
