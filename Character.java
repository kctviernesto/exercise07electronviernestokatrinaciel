public abstract class Character { // class is now abstract
    private String name;
    private Location currentLocation;

    protected Character(String n){ // changed to protected (originally public)
        this.name = n;
        this.currentLocation = null;
    }
    protected Character(String n, Location l){ // changed to protected (originally public)
        this.name = n;
        this.currentLocation = l;
    }

    public String getName(){
        return name;
    }
    public Location getCurrentLocation(){
        return currentLocation;
    }
    public void travel(Location destination){
        currentLocation.removePerson(this);
        destination.addPerson(this);
        currentLocation = destination;
        System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
    }
}
