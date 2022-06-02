package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductServiceImpl implements ProductService{
    List<Product> products;

    public ProductServiceImpl() {
        products = new ArrayList<>();
        products.add(new Product(1,"Hoa"));
        products.add(new Product(2,"Long"));
        products.add(new Product(3,"Huy"));
        products.add(new Product(4,"Bích"));
        products.add(new Product(5,"mạnh"));
    }

    public ProductServiceImpl(List<Product> products) {
        this.products = products;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public int findIndexById(int id) {
        int indexOf = -1;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }

        }
        return indexOf;
    }

    @Override
    public Product findById(int id) {

        for (Product product : products) {
            if (id == product.getId())
                return product;

        }
        return null;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().toLowerCase().contains(name.toLowerCase())) {
                productList.add(products.get(i));
            }
        }
        return productList;
    }


    @Override
    public void update(int id, Product product) {
        int indexOf = findIndexById(id);
        products.set(indexOf, product);

    }

    @Override
    public void delete(int id) {
        int indexOf = findIndexById(id);
        products.remove(id);

    }
}
