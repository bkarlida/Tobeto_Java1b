package oopWithNlayeredApp.dataAccess;

import oopWithNlayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
    public void add(Product product){
        System.out.println("Hibernate ile veri tabanına eklendi");
    }
}
