import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findMode(List<Integer> l) {
        HashSet<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
    
        for (int i = 0; i < l.size(); i++) {
            if (seen.contains(l.get(i))) {
                duplicates.add(l.get(i));
            } else {
                seen.add(l.get(i));
            }
        }
        return duplicates;
}

    public static void main(String[] args) {
        // some test strings:
        List<Integer> sample1 = new ArrayList<Integer>(Arrays.asList(3, 7, 5, 6, 7, 4, 8, 5, 7, 66));
        List<Integer> sample2 = new ArrayList<Integer>(Arrays.asList(3, 5, 6, 4, 4, 5, 66, 6, 7, 6));
        List<Integer> sample3 = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 1, 0));
        List<Integer> sample4 = new ArrayList<Integer>(Arrays.asList(3));
        System.out.println("Sample 1: " + findMode(sample1));
        System.out.println("Sample 2: " + findMode(sample2));
        System.out.println("Sample 3: " + findMode(sample3));
        System.out.println("Sample 4: " + findMode(sample4));
    }

}
