import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicates {

    public static List<Integer> findModeNestedLoops(List<Integer> l) {
        List<Integer> duplicates = new ArrayList<>();    
        
        for (int i=0; i<l.size(); i++) {
            for (int j=1; j<l.size()+1; j++) {
                if (l.get(i).equals(l.get(j))) {
                    duplicates.add(l.get(i));
                    break;
                }
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
        System.out.println("Sample 1: " + findModeNestedLoops(sample1));
        System.out.println("Sample 2: " + findModeNestedLoops(sample2));
        System.out.println("Sample 3: " + findModeNestedLoops(sample3));
        System.out.println("Sample 4: " + findModeNestedLoops(sample4));
    }

}
