package Builder;

public class HamburgerBuilder {
    public void buildPizza(HamburgerBuilderInterface hamburgerBuilderInterface) {
        hamburgerBuilderInterface.buildBun();
        hamburgerBuilderInterface.buildMeat();
        hamburgerBuilderInterface.buildSauce();
        hamburgerBuilderInterface.buildTopping();
    }
}