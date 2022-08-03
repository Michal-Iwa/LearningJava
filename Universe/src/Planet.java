public class Planet extends HeavenlyBody{
    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }
    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        if(BodyTypes.MOON != satellite.getBodyType() || this.getSatellites().contains(satellite)) return false;
        return super.addSatellites(satellite);
    }
}
