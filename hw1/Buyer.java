package oop.example.seminar2.hw1;

public abstract class Buyer implements BuyerBehavior {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}
