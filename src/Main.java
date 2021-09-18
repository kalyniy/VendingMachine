public class Main
{
    public static void main(String[] args)
    {
        String path = "/Users/dan/vending.txt";
        String data = Helper.ReadFile(path);

        //VendingMachine vendingMachine = new VendingMachine();
        VendingMachine vendingMachine = new VendingMachine(data);

    }
}
