import java.util.HashMap;
import java.util.Map;

public class VendingMachine
{
    public Map<String, Item> dictionary;
    public VendingMachine() // constructor. VendingMachine name = new VendingMachine();
    {

    }
    public VendingMachine(String data) // constructor. VendingMachine name = new VendingMachine(data);
    {
        dictionary = new HashMap<String, Item>();
        String[] rows = data.split("\n");
        for(String row : rows)
        {
            String[] columns = row.split(",");
            String location = columns[0];
            String name = columns[1];
            String priceString = columns[2];
            priceString = priceString.replace("$", "");
            double price = Double.parseDouble(priceString);
            int quantity = Integer.parseInt(columns[3]);

            Item item = new Item(name, price, quantity);
            dictionary.put(location, item);

        }
    }
    public static void someStaticMethod()
    {
        System.out.println("Static method");
    }
    public void someNonStaticMethod()
    {
        System.out.println("Non-static method");
    }
}
