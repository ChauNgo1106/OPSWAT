package parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    private String filePath; 

    public FileParser(String filePath){
        this.filePath = filePath;
    }

    public List<String> readFile() throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(this.filePath));
        String currentLine = br.readLine();
        List<String> words = new ArrayList<>();
        
        while(currentLine != null){
            List<String> wordsPerLine = new ArrayList<>();
            wordsPerLine = extractWords(currentLine);
            wordsPerLine.stream().forEach( (element) -> {
                words.add(element);
            });
            currentLine = br.readLine();
        }

        br.close();
        return words;
    }

    public List<String> extractWords(String line){
        List<String> res = new ArrayList<>();
        //clean the input to replace special character with space
        line = removeSpecialCharacters(line);

        res = List.of(line.split("\\s+"));
        return res;
    }

    public String removeSpecialCharacters(String str){
        return str.replaceAll("[^a-zA-Z]", " ");
    }

    /*This main class is for testing FileParser class itself */
    // public static void main(String[] args){
    //     FileParser fp = new FileParser("src\\parser\\input.txt");
    //     try {
    //         List<String> words = fp.readFile();
    //         for(String word: words)
    //             System.out.println(word);
    //     } catch (IOException e) {
    //         System.err.println("Something is wrong while reading your file provided");
    //         e.printStackTrace();
    //     }

    // }
}
