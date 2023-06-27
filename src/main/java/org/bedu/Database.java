package org.bedu;

import javax.print.DocFlavor;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Product> db;

    public Database() {
        db = new LinkedList<>();
    }
    public void insert(Product data){
        db.add(data);
    }
    public int size(){
        return db.size();
    }
    public Product getById(long id) {
        for (Product product : db) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }
    public void clear() {
        db.clear();
    }

    public void updateById(Product updatedProduct) {
        for (Product product : db) {
            if (product.getId() == updatedProduct.getId()) {
                product.setName(updatedProduct.getName());
                return;
            }
        }
    }

    public Product deleteById(long id){
        for(Product product : db){
            if(product.getId() == id)
                db.remove(product);
        }
        return null;
    }

}