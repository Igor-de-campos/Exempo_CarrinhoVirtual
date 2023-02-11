

public class MainScreen {


    public static void main(String[] args) {
        List list = new List();

        Products products1 = new Products("Notebook", 7500, 5);
        Products products2 = new Products("Iphone", 3478, 3);
        Products products3 = new Products("SmartPhone", 5642, 1);
        Products products4 = new Products("Mouse", 43, 1);
        Products products5 = new Products("MousePad", 12, 2);

        list.addToCart(products1);
        list.addToCart(products2);
        list.addToCart(products3);
        list.addToCart(products4);
        list.addToCart(products5);

        System.out.println("PRODUTOS NO CARRINHO\n");
        list.ShowCart();







    }
}
