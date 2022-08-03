public class Asteroid extends HeavenlyBody{
    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.ASTEROID);
    }
    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        return false;
    }
}
