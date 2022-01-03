package _04_BeanInjection;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/2 - 17:34
 */
public class Phone {


    private int price;

    public Phone() {
    }

    public Phone(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
