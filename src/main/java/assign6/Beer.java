package assign6;

public class Beer {
    private String name;
    private String type;
    private double alcoholByVolume;
    private int volume;

    public String getName() {
        return name;
    }

    public Beer(String name, String type, double alcoholByVolume, int volume) {
        this.name = name;
        this.type = type;
        this.alcoholByVolume = alcoholByVolume;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format(name + " is a type of " + type + " that contains %.2f %% alcohol in %d ml", alcoholByVolume, volume);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Beer)) {
            return false;
        }

        Beer beer = (Beer) object;

        if (this.name != beer.name) {
            return false;
        }

        if (this.type != beer.type) {
            return false;
        }

        if (Math.round(100 * this.alcoholByVolume) != Math.round(100 * beer.alcoholByVolume)) {
            return false;
        }

        if (this.volume != beer.volume) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }


}
