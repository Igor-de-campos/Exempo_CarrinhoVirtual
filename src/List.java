import java.util.ArrayList;

public class List {
    ArrayList<Products> cartOnline = new ArrayList<>(); //lista dos produtos

   public void addToCart(Products products) {
       cartOnline.add(products);
   }

   void ShowCart() {
       for (Products products : cartOnline) {
           products.Listar();
       }  //mostra todos os produtos cadastrados
   }
}
