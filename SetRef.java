import java.util.HashSet;
import java.util.Set;

public class SetRef {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("c");
        set.add("d");
        set.add("a");
        System.out.println(set);
    }
    
}

// java SetRef.java