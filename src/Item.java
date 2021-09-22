public class Item
{
    public String name;
    public double price;
    public int quantity;
    public Item()
    {

    }
    public Item(String name, double price, int quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + "\n");
        sb.append("Price: $" + price + "\n");
        sb.append("Quantity: " + quantity + "\n");
        return sb.toString();

    }
}
