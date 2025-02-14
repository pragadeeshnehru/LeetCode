import java.util.*;

class ProductOfNumbers {
    List<Integer> products;
    
    public ProductOfNumbers() {
        products = new ArrayList<>();
        products.add(1);
    }
    
    public void add(int num) {
        if (num == 0) {
            products.clear();
            products.add(1);
        } else {
            products.add(products.get(products.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        int size = products.size();
        if (k >= size) return 0; 
        
        return products.get(size - 1) / products.get(size - 1 - k);
    }
}

