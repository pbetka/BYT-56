package Builder;

import java.util.Arrays;

public class Hamburger {
    private String bun;
    private String meat;
    private String sauce;
    private String[] topping;

    public void setBun(String bun) {
        this.bun = bun;
    }
    public void setMeat(String meat) { this.meat = meat; }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String[] topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bun='" + bun + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping=" + Arrays.toString(topping) +
                '}';
    }
}