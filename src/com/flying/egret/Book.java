package com.flying.egret;

/**
 * 测试finalize
 *
 * @author egret
 * @create 2017-09-10 16:00
 **/
public class Book {
    boolean checkedOut = false;
    Book(boolean checkout){
        checkedOut = checkout;
    }
    void checkIn(){
        checkedOut = false;
    }

    protected void finalize(){
        if (checkedOut){
            System.out.println("Error:checked out");
        }
    }

    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);

        // Force garbage collection & finalization
        System.gc();
    }
}



