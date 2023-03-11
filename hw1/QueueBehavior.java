package oop.example.seminar2.hw1;

public interface QueueBehavior {
    void takeInQueue(Buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
