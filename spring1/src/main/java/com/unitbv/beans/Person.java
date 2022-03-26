package com.unitbv.beans;

public class Person implements Human {

    private Item item=new Book() ;

    @Override
    public Item getItem() {
        return item;
    }
}
