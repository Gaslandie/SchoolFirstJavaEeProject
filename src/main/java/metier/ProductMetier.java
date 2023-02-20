package metier;

import dao.ProductDao;
import entities.Product;

import java.util.List;

public class ProductMetier {
    private ProductDao dao = new ProductDao();

    public Product addproduct(Product product) throws Exception{
        if(product.getQuantity()<0 || product.getLabel().trim().equals("") || product.getPrice()<0)
            throw new RuntimeException(("cannot add this product"));
        return dao.addProduct(product);
    }

    public List<Product> getProducts() throws Exception{
        return dao.getProducts();
    }
}
