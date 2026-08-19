package application;

import model.entities.Seller;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {

        Seller obj = new Seller(1, "Books");

        model.Seller seller = new model.Seller(21, "Bob", "bob@gmail.com", LocalDate.now(), 3000.0, obj);

        System.out.println(seller);

        System.out.println(obj);
    }
}
