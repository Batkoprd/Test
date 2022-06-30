package Transport;

public class Raptor implements Military, Flying{
    @Override
    public void shot() {
        System.out.println("Boom");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " can fly!");
    }
}
