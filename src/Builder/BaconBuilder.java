package Builder;

public class BaconBuilder implements HamburgerBuilderInterface {
    private Hamburger hamburger;

    public BaconBuilder() {
        this.hamburger = new Hamburger();
    }

    @Override
    public void buildBun() {
        hamburger.setBun("Sesame Seed Bun");
    }

    @Override
    public void buildMeat() {
        hamburger.setMeat("Beef");
    }

    @Override
    public void buildSauce() {
        hamburger.setSauce("Ketchup");
    }

    @Override
    public void buildTopping() {
        String[] topping = {"Bacon", "Cheddar Cheese", "Lettuce", "Tomato"};
        hamburger.setTopping(topping);
    }

    public Hamburger getHamburger() {
        return hamburger;
    }
}