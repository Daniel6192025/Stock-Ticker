import com.mrjaffesclass.stockmarket.StockGetHistory;
import com.mrjaffesclass.stockmarket.StockPrice;
import java.util.Calendar;

/**
 * Write a description of class Stock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stock
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        StockGetHistory history = new StockGetHistory("ID62LK1OCFBCEK40", "NVDA");
        System.out.println("Date,Close");
        for (StockPrice prices : history.getStockPrices()) {
            double price = prices.getClose();
            int year = prices.getDate().getTime().getYear();
            int month = prices.getDate().getTime().getMonth() + 1;
            int day = prices.getDate().getTime().getDay();
            
            
            String yearString = "20" + String.valueOf(year).substring(1);
            String monthString = "";
            String dayString = "";
            if (month < 10) {
                monthString = "0" + String.valueOf(month);
            } else {
                monthString = String.valueOf(month);
            }
            
            if (day < 10) {
                dayString = "0" + String.valueOf(day);
            } else {
                dayString = String.valueOf(day);
            }
            
            
            
            System.out.println(yearString + "-" + monthString + "-" + dayString + "," + price);
            
        }
    }
}
