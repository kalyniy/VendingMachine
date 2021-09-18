public class VendingMachine
{
    public VendingMachine() // constructor. VendingMachine name = new VendingMachine();
    {

    }
    public VendingMachine(String data) // constructor. VendingMachine name = new VendingMachine(data);
    {
        String[] rows = data.split("\n");
        for(String row : rows)
        {
            String[] columns = row.split(",");
            String location = columns[0];
            String name = columns[1];
            double price = Double.parseDouble(columns[2]);
            int quantity = Integer.parseInt(columns[3]);

            System.out.println("Location: " + location);
            System.out.println("Name: " + name);
            System.out.println("Price: " + price);
            System.out.println("Quantity" + quantity);

            System.out.println();
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
