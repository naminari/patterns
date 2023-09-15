import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String,Developer> developers = new HashMap<>();
    public Developer getDeveloper(String string){
        Developer developer = developers.get(string);

        if (developer == null){
            switch (string){
                case "java":
                    developer = new JavaDeveloper();
                    System.out.println("Hiring java developers");
                    break;
                case "c++":
                    developer = new CppDeveloper();
                    System.out.println("Hiring c++ developers");
                    break;
            }
            developers.put(string, developer);
        }
        return developer;
    }
}
