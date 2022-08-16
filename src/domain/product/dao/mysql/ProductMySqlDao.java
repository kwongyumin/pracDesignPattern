package domain.product.dao.mysql;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductMySqlDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("INSERT TEST");

    }

    @Override
    public void updateProduct(Product product) {
        System.out.println("UPDATE TEST");

    }

    @Override
    public void deleteProduct(Product product) {
        System.out.println("DELETE TEST");

    }
}
