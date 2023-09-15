public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void select() {
        selectObj();
    }

    @Override
    public void load() {
        loadObj();
    }

    @Override
    public void remove() {
        removeObj();
    }

    @Override
    public void update() {
        updateObj();
    }
}
