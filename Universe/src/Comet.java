public class Comet extends HeavenlyBody{
    public Comet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.COMET);
    }
    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        return false;
    }
}
