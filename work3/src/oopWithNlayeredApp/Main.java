package oopWithNlayeredApp;

import oopWithNlayeredApp.business.ProductManager;
import oopWithNlayeredApp.core.loging.DatabaseLogger;
import oopWithNlayeredApp.core.loging.FileLogger;
import oopWithNlayeredApp.core.loging.Logger;
import oopWithNlayeredApp.dataAccess.HibernateProductDao;
import oopWithNlayeredApp.dataAccess.JdbcProductDao;
import oopWithNlayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DatabaseLogger()};
        Product product1 = new Product(1, "Iphone Xr", 10000);
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);
        productManager.add(product1);

    }
}
