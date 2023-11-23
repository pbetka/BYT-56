package Builder;

public class Builder {
    public static void main(String[] args) {
        HamburgerBuilder hamburgerBuilder = new HamburgerBuilder();

        BaconBuilder baconBuilder = new BaconBuilder();
        hamburgerBuilder.buildPizza(baconBuilder);
        Hamburger baconHamburger = baconBuilder.getHamburger();
        System.out.println("Bacon Hamburger: " + baconHamburger);

        JalapenoChickenBuilder jalapenoChickenBuilder = new JalapenoChickenBuilder();
        hamburgerBuilder.buildPizza(jalapenoChickenBuilder);
        Hamburger jalapenoChickenHamburger = jalapenoChickenBuilder.getHamburger();
        System.out.println("Jalapeno Chicken Hamburger: " + jalapenoChickenHamburger);
    }
}