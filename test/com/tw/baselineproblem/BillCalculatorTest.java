package com.tw.baselineproblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BillCalculatorTest {
    @Test
    public void shouldReturnReceiptForBookWhichIsExempted(){
        BillCalculator billCalculator=new BillCalculator();
        String actual=billCalculator.receipt("1 book of 12.36");
        assertEquals("1 book of 12.36\n SalesTax:0.00\n Total :12.36 ",actual);
    }




}
