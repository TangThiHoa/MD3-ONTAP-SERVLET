package service;

import model.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();                           //In ra list

    void save(Product product);                       //Lưu sp

    int findIndexById(int id);                         //Tìm kiếm theo chỉ số

    Product findById(int id);

    List<Product> findByName(String name);

    void update(int id, Product product);              //Thay đổi

    void delete(int id);
}
