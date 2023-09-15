public class Sportsman implements Collection {
    String name;
    String[] pointInTournament;

    public void setName(String name) {
        this.name = name;
    }

    public void setPointInTournament(String[] pointInTournament) {
        this.pointInTournament = pointInTournament;
    }

    public String getName() {
        return name;
    }

    public String[] getPointInTournament() {
        return pointInTournament;
    }

    public Sportsman(String name, String[] pointInTournament) {
        this.name = name;
        this.pointInTournament = pointInTournament;
    }

    @Override
    public Iterator getIterator() {
        return new pointsIterator();
    }

    public class pointsIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hadNext() {
            if (index < pointInTournament.length) {
                return true;
            } else {
                return false;
            }
        }

        @Override
        public Object next() {
            return pointInTournament[index++];

        }
    }
}

