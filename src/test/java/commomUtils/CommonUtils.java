package commomUtils;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.DataProvider;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CommonUtils {

    public List<String[]> readCSV() throws IOException {
        String line;
        List<String[]> valuesList = new ArrayList<>();
        File file = new File("src/test/java/resources/csvfile.csv");
        BufferedReader bufRdr;
        bufRdr = new BufferedReader(new FileReader(file));
        while((line = bufRdr.readLine()) != null){
            System.out.println(line);
            String[] cell= line.split(",");
            valuesList.add(cell);
        }
        System.out.println(valuesList);
        return valuesList;
    }
    public Object[][] readDataFromCSV() throws IOException {
        String csvFile = "src/test/java/resources/csvfile.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        List<Object[]> data = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] rowData = line.split(csvSplitBy);
                data.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return data.toArray(new Object[0][]);
    }
    public static void main(String[] args) throws IOException {

        CommonUtils cu=new CommonUtils();
        System.out.println( cu.readDataFromCSV());
    }


}