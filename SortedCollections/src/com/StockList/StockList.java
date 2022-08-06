package com.StockList;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList(){
        this.list = new HashMap<>();
    }
    public int addStock(StockItem item){
        if(item != null){
            StockItem inStock = list.getOrDefault(item.getName(), item);
            if(inStock != item){
                item.adjustStock(inStock.getQuantityInStock());
            }
            list.put(item.getName(), item);
            return item.getQuantityInStock();
        }
        return 0;
    }
    public int sellStock(StockItem item, int quantity){
        StockItem inStock = list.getOrDefault(item, null));
        if((inStock != null) && inStock.getQuantityInStock() >= quantity && quantity > 0){
            inStock.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }
    public StockItem getStock(String key){
        return list.get(key);
    }
    public Map<String, StockItem> Items(){
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStockList\n";
        double totalCost = 0.0;
        for(Map.Entry<String, StockItem> item : list.entrySet()){
            StockItem stockItem = item.getValue();
            double itemValue = stockItem.getPrice() * stockItem.getQuantityInStock();
            s = s + stockItem + stockItem + ". There are " + stockItem.getQuantityInStock() +
                    " in stock. Value of items: " + itemValue + "\n";
            totalCost += itemValue;
        }
        return s + "Total stock value " + totalCost;
    }
}
