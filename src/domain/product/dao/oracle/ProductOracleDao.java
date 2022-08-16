package domain.product.dao.oracle;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {
    @Override
    public void insertProduct(Product product) {
        System.out.println("PRODUCT TEST");
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
