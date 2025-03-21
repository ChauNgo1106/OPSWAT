package analysis;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextAnalyser {
    private Map<String, Integer> count; 
    private Map<String, Integer> sortedCount;
    private int totalWordCount;

    public TextAnalyser(){
        count = new TreeMap<>();
        sortedCount = new LinkedHashMap<>();
        totalWordCount = 0;
    }

    public void sortedTreeMap(){
        // Sorting the map by its values
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(count.entrySet());

        // Sorting by value using compareTo to compare the value of 2 keys
        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        // Assign those keys and value pair to sortedCount LinkedHashMap
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedCount.put(entry.getKey(), entry.getValue());
        }

        // Display the sorted map - not neccessary, only for validation
        // System.out.println("Sorted TreeMap by values (descending): " + sortedCount);
    }

    public void buildWordFrequency(List<String> words){
        this.totalWordCount = words.size();

        for(String word: words){
            if(!count.containsKey(word)){
                count.put(word, 1);
            } else{
                count.put(word, count.get(word) + 1);
            }
        }
        sortedTreeMap();
    }

    public int getTotalWordCount(){
        return this.totalWordCount;
    }

    public int getUniqueWords(){
        return this.count.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("The Word Count: " + getTotalWordCount() + "\n\n");
        sb.append("Top 5 Most Frequent Words:" + "\n");
        int counter = 0;        
        for(Map.Entry<String, Integer> entry : sortedCount.entrySet()){
            if(counter >= 5) break;
            double percentage = (double)entry.getValue() * 100 / getTotalWordCount();
            String formatedText = entry.getKey() + " - " + entry.getValue() + " (" + String.format("%.2f", percentage) + "%" + ")" + "\n";
            sb.append(formatedText);
            counter++;
        }
        sb.append("\nNumber of Unique Words: " + getUniqueWords());
        return sb.toString();
    }
}
