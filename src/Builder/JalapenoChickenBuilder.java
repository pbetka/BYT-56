package Builder;

public class JalapenoChickenBuilder implements HamburgerBuilderInterface {
private Hamburger hamburger;

public JalapenoChickenBuilder() {
        this.hamburger = new Hamburger();
        }

@Override
public void buildBun() {
        hamburger.setBun("Brioche");
        }

@Override
public void buildMeat() {
                hamburger.setMeat("Chicken");
        }

@Override
public void buildSauce() {
                hamburger.setSauce("Mustard");
        }

@Override
public void buildTopping() {
        String[] topping = {"Jalapeno", "Onion", "Pickle"};
        hamburger.setTopping(topping);
        }

public Hamburger getHamburger() {
        return hamburger;
    }
}