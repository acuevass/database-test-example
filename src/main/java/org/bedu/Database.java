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

    public void updateById(long productId, String newName) {
        for (Product product : db) {
            if (product.getId() == productId) {
                product.setName(newName);
                break;
            }
        }
    }
    public void deleteById(long productId) {
        for (Product product : db) {
            if (product.getId() == productId) {
                db.remove(product);
                break;
            }
        }
    }

}