import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        Set name= new HashSet<String>();
        name.add("Ranjit");
        name.add("Hiren");
        name.add("Nittin");
        name.add("Ranjit");
        System.out.println(name);

        Stack Building= new Stack<String>();
        Building.add("lucky building");
        Building.add("K2 building");
        Building.add("URA building");
        Building.add("K2 building");
        System.out.println(Building);

        Set Mountains=new HashSet<Queue>();
        Mountains.add("Mountain k2");
        Mountains.add("Himalaya");
        Mountains.add("Dzuvu valley");
        Mountains.add("Mountain k2");
        System.out.println(Mountains);

        Set number=new HashSet<Integer>();
        number.add(65);
        number.add(87);
        number.add(90);
        number.add(65);
        System.out.println(number);
    }
}
