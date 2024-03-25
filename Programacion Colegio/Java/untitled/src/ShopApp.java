//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ShopApp
{


    public static void main(String[] args) {

        double tax = 0.2;
        double total= 0.0;

        System.out.println("Welcome to Duke Choice Shop");

        Customer c1 = new Customer();

        c1.setName("Pinky");


        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        item1.setDescripcion("blue jacket");
        item1.setPrecio(20.9);
        item1.setTalle("M");

        item2.setDescripcion("Orange t-shirt");
        item2.setPrecio(10.5);
        item2.setTalle("S");

        System.out.println("item1: " + item1.getDescripcion() + " " + item1.getPrecio()+" " + item1.getTalle());
        System.out.println("item2: " + item2.getDescripcion() + " " + item2.getPrecio()+" " + item2.getTalle());

        total = (item1.getPrecio() + item2.getPrecio()*2)* 1 + tax;

        System.out.println("total: " + total);
        System.out.println(c1.getName());
    }
}