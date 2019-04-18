//Create Counter class
//which has an integer field value
//when creating it should have a default value 0 or we can specify it when creating
//we can add(number) to this counter another whole number
//or we can add() without parameters just increasing the counter's value by one
//and we can get() the current value
//also we can reset() the value to the initial value

public class Counter {

    int number;
    int startingNumber;

    public Counter() {

        number = 0;
        startingNumber = number;
    }

    public Counter(int number) {

        this.number = number;
        startingNumber = number;
    }

    public void add(int addednumber) {

        this.number += addednumber;
    }

    public void add() {
        this.number++;
    }

    public int get() {
        return number;
    }

    public void reset() {
        number = startingNumber;
    }
}