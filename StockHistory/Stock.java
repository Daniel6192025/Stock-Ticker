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
        for (StockPrice prices : history.getStockPrices()) {
            double price = prices.getClose();
            int year = prices.getDate().getTime().getYear();
            int month = prices.getDate().getTime().getMonth();
            int day = prices.getDate().getTime().getDay();
            
            
            
            System.out.println(year + "-" + month + "-" + day + "," + price);
            
        }
    }
}
