package com.service;
import java.util.*;
import java.util.List;
import com.Product;
import com.Dao.ProductDao;

public class ProductService {
ProductDao ed = new ProductDao();
    
    public String storeProduct(Product product) {
        if(product.getPrice()<1000) {
            return "Product Price must be > 1000";
        }else if(ed.storeProduct(product)>0) {
            return "Record inserted successfully <br/>View in database";
        }else {
            return "Record is not inserted<br/>Please check again!";
        }
    }
}
