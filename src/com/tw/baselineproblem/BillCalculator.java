package com.tw.baselineproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillCalculator {

    public String receipt(String item) {
        List<Object> splitedItem = new ArrayList<>();
        Collections.addAll(splitedItem, item.split(" "));
        int size = splitedItem.size();
        String totalCost = (String) splitedItem.get(size - 1);
        return item + "\n" +
                " SalesTax:0.00\n" +
                " Total :" + totalCost;
    }

}
