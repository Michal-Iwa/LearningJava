package Universe;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<HeavenlyBody>();
    }
    public boolean addMoon( HeavenlyBody moon){
        return this.satellites.add(moon);
    }
    public Set<HeavenlyBody> getSatellites(){
        return new HashSet<HeavenlyBody>(satellites);
    }

    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        System.out.println("obj.getClass() is " + obj.getClass());
        System.out.println("this.getClass() is " + this.getClass());
        //checking is obj is an instance of a Class heavenlyBody is unnecessary
        //because class is final so it cannot be inherited from
        if(obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        String objName = ((HeavenlyBody) obj).getName();
        return this.getName() == objName;
    }
    // https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-
    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }
}
