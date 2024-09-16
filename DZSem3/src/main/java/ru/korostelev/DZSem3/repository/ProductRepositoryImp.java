package ru.korostelev.DZSem3.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.korostelev.DZSem3.entity.Product;
import ru.korostelev.DZSem3.entity.Products;

import java.util.List;
import java.util.UUID;


@Repository
public class ProductRepositoryImp implements ProductRepository {

    @Autowired
    private Products productsList;

    @Override
    public void saveNewProduct(Product product) {
        List<Product> temp = productsList.getProducts();
        temp.add(product);
        productsList.setProducts(temp);
        System.out.println("Создан товар с ID: " + product.getId());
    }

    @Override
    public Product saveEditProduct(Product oldProduct, Product updatedProduct) {
        List<Product> temp = productsList.getProducts();
        for (Product o : temp) {
            if(o.getId().equals(oldProduct.getId())){
                o.setTitle(updatedProduct.getTitle());
                o.setDescription(updatedProduct.getDescription());
            }
        }
        productsList.setProducts(temp);
        return oldProduct;
    }

    @Override
    public List<Product> findAllProducts() {
        return productsList.getProducts();
    }

    @Override
    public Product findProductById(UUID uuid) {
        for (Product product : productsList.getProducts()) {
            if(product.getId().equals(uuid)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void deleteProductById(UUID uuid) {
        List<Product> temp = productsList.getProducts();
        for (Product product : temp) {
            if(product.getId().equals(uuid)){
                temp.remove(product);
                System.out.println("Удален товар с ID: " + uuid.toString());
                break;
            }
        }
        productsList.setProducts(temp);
    }
}
