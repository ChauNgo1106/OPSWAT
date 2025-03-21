package report;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//write to a file
public class WriteReport {
    private String filePath; 
    private String report;

    public WriteReport(String filePath, String report){
        this.filePath = filePath;
        this.report = report;
    }


    public void writeFile() throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));
        bw.write(this.report);
        bw.close();
    }

    //only for testing this class
    // public static void main(String[] args){
    //     String report = "sample\nasdadasd\nadasdsd";
    //     WriteReport wr = new WriteReport("report.txt", report);
    //     try {
    //         wr.writeFile();
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }
}
