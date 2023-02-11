public class Products {
    String name;
    int price;
    int quantity;


    public Products(String name, int price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public  void Listar() {
        System.out.println("Nome : " + this.name);
        System.out.println("Preço : " + this.price);
        System.out.println("Quant:" + this.quantity + "\n");

    }
}
