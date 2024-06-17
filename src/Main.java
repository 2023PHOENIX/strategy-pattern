import com.logistics.components.Amazon;
import com.logistics.factory.EcommerceFactory;

public class Main {
    public static void main(String[] args) {


        Amazon amazon = EcommerceFactory.getInstance("bluedart");

        String[] items = {"Pencil","Notebook","colorbox"};
        float[] prices = {100.00f,200.00f,130.33f};
        String bill = amazon.buyNow(items,prices);
        System.out.println(
                bill
        );

    }
}