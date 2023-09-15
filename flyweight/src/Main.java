import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory factory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(factory.getDeveloper("java"));
        developers.add(factory.getDeveloper("java"));
        developers.add(factory.getDeveloper("java"));
        developers.add(factory.getDeveloper("java"));
        developers.add(factory.getDeveloper("java"));
        developers.add(factory.getDeveloper("c++"));
        developers.add(factory.getDeveloper("c++"));
        developers.add(factory.getDeveloper("c++"));
        developers.add(factory.getDeveloper("c++"));
        developers.add(factory.getDeveloper("c++"));
        developers.add(factory.getDeveloper("c++"));

        for (Developer developer: developers){
            developer.writeCode();
        }
    }

}