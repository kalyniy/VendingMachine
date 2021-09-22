import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String path = "/Users/dan/vending.txt";
        String data = Helper.ReadFile(path);


        VendingMachine vendingMachine = new VendingMachine(data);
        System.out.println("Enter the location: ");
        String location = scanner.next();
        Item item = vendingMachine.dictionary.get(location);
        System.out.println(item.toString());



    }
}
