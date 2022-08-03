public class DwarfPlanet extends HeavenlyBody{
    public DwarfPlanet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.DWARF_PLANET);
    }
    @Override
    public boolean addSatellites(HeavenlyBody satellite) {
        if(BodyTypes.MOON != satellite.getBodyType() || this.getSatellites().contains(satellite)) return false;
        return super.addSatellites(satellite);
    }
}
