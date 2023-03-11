package oop.example.seminar2.hw1;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);
    void releaseFromMarket(Buyer actor);
    void update();
}
