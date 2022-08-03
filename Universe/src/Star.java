public class Star extends HeavenlyBody{
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.STAR);
    }

    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        return super.addSatellites(satellite);
    }
}
