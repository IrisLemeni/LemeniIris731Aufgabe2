package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private final HandelService service;

    public Controller(HandelService service) {
        this.service = service;
    }

    public void getAllProducts(){
        for (Product product: service.getAllProducts())
            System.out.println(product);
    }
    public void alleKundenAnschreiben(){
        for (Charakter charakter: service.getAllCustomers())
            System.out.println(charakter);
    }

    public void createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Preis: ");
        int preis = sc.nextInt();
        sc.nextLine();
        System.out.println("Region");
        String jahr = sc.nextLine();

        service.addProduct(name, preis, jahr);
    }

    public void showAProdukt(){
        System.out.println("Gebe den Namen des Produktes ein: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Product product = service.getProduct(name);
        System.out.println(product);
    }

}
