import com.mrjaffesclass.stockmarket.StockGetHistory;
import com.mrjaffesclass.stockmarket.StockPrice;

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
        System.out.println(history.getStockPrices());
    }
}
