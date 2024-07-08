/*
package Important;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Stock> stocks = new ArrayList();

        //Read data from csv file and store in the List of Stocks
        File csvFile = new File(pathToCsv);
        if (csvFile.isFile()) {
            BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
            while ((row = csvReader.readLine()) != null) {
                String[] data = row.split(",");
                stocks.add(new Stock(data[1],data[2]));
            }
            csvReader.close();
        }

        //Sort the stocks list based on the price
        Collections.sort(stocks, new Comparator<Stock>() {
            public int compare(Stock stock1, Stock stock2) {
                if(stock1.getPrice() < stock2.getPrice())
                    return 1;
                return -1;
            }
        });

        //Write the sorted list of stocks in a csv file
        FileWriter csvWriter = new FileWriter("new.csv");
        csvWriter.append("S.No");
        csvWriter.append(",");
        csvWriter.append("Stock Name");
        csvWriter.append(",");
        csvWriter.append("Stock Price");
        csvWriter.append("\n");

        for (List<Stock> stock : stocks) {
            csvWriter.append(String.join(",", rowData));
            csvWriter.append("\n");
        }

        csvWriter.flush();
        csvWriter.close();

    }
}

class Stock{
    private String name;
    private Integer price;

    public Stock(String name, Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }
    public Integer getPrice(){
        return this.price;
    }
}*/
