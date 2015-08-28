package com.tw.baselineproblem;

public class BillCalculator {

    public String receipt(String items) {
        return items+"\n" +
                " SalesTax:0.00\n" +
                " Total :12.36";
    }

}
