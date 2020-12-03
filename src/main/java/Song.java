public class Song implements Comparable<Song> {
    private String name;
    private int counter = 0;
    Song next;

    public Song(String name) {
        this.name = name;
        next = null;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void increaseCounter() {
        counter++;
        if (counter == 1) Interface.songs = Interface.songs.add(Interface.songs, this);
    }

    public void decreaseCounter() {
        counter--;
        if (counter == 0) Interface.songs = Interface.songs.remove(Interface.songs, this);
    }

    @Override
    public int compareTo(Song o) {
        return Integer.compare(o.getCounter(), counter);
    }

    @Override
    public boolean equals(Object object) {
        boolean isEqual = false;
        if (object != null && object instanceof Song) isEqual = ((Song) object).getName().equals(this.name);
        return isEqual;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
