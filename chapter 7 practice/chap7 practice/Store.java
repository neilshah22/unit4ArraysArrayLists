import java.util.Scanner;
import java.util.ArrayList;

public class Store
{
    ArrayList<String> customer = new ArrayList<String>();
    ArrayList<Double> payment = new ArrayList<Double>();
    public void addSale(String customerName, double amount)
    {
        customer.add(customerName);
        payment.add(amount);
    }

    public String nameOfBestCustomer()
    {
        double top = 0.0;
        for(double i: payment)
        {
            if(i>(top))
            {
                top = i;
            }
        }
        return customer.get(payment.lastIndexOf(top));
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the customer and enter the price of the iteam they bought");
        while(true)
        {
            String customer = scan.next();
            double price = scan.nextDouble();
            Store a = new Store();
            if (price == 0.0 || customer.equals("0"))
            {
                break;
            }
            a.addSale(customer, price);
            a.nameOfBestCustomer();
        }
        System.out.println(customer.get 
    }
}

    