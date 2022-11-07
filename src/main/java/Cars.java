public class Cars {
    String colour;
    String name;
    String engine;
//    @Override
//    public String toString() {
//        return "name: " + name + " — Colour: " + colour +" engine: " + engine;
//    }
    public Cars(String colour, String name, String engine) {
        this.colour=colour;
        this.name=name;
        this.engine=engine;
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}