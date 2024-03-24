import java.util.ArrayList;
import java.util.LinkedList;


public class Main
{
    private static final int MIN_ITERATIONS = 1000;
    private static final int MAX_ITERATIONS = 5000;
    private static final String LINKED_LIST_TEXT = "LinkedList";
    private static final String ARRAY_LIST_TEXT = "ArrayList";
    public static void main(String[] args)
    {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int iterations = MIN_ITERATIONS; iterations <= MAX_ITERATIONS; iterations+=1000)
        {
            TestTimer.printExecutionTime(() -> arrayList.add(1), iterations, System.out, ARRAY_LIST_TEXT + " add()");
            TestTimer.printExecutionTime(() -> arrayList.add(10, 2), iterations, System.out, ARRAY_LIST_TEXT + " add() по индексу");
            TestTimer.printExecutionTime(() -> arrayList.getFirst(), iterations, System.out, ARRAY_LIST_TEXT + " getFirst()");
            TestTimer.printExecutionTime(() -> arrayList.get(arrayList.size()/2), iterations, System.out, ARRAY_LIST_TEXT + " get() из середины");
            TestTimer.printExecutionTime(() -> arrayList.getLast(), iterations, System.out, ARRAY_LIST_TEXT + " getLast()");
            TestTimer.printExecutionTime(() -> arrayList.removeFirst(), iterations, System.out, ARRAY_LIST_TEXT + " removeFirst()");
            TestTimer.measureExecutionTime(() -> arrayList.add(1), iterations);
            TestTimer.printExecutionTime(() -> arrayList.remove(arrayList.size()/2), iterations, System.out, ARRAY_LIST_TEXT + " remove() из середины");
            TestTimer.measureExecutionTime(() -> arrayList.add(1), iterations);
            TestTimer.printExecutionTime(() -> arrayList.removeLast(), iterations, System.out, ARRAY_LIST_TEXT + " removeLast()");
            TestTimer.measureExecutionTime(() -> arrayList.add(1), iterations);

            System.out.println("\n-------------------------\n");

            TestTimer.printExecutionTime(() -> linkedList.add(1), iterations, System.out, LINKED_LIST_TEXT + " add()");
            TestTimer.printExecutionTime(() -> linkedList.add(10, 2), iterations, System.out, LINKED_LIST_TEXT + " add() по индексу");
            TestTimer.printExecutionTime(() -> linkedList.getFirst(), iterations, System.out, LINKED_LIST_TEXT + " getFirst()");
            TestTimer.printExecutionTime(() -> linkedList.get(linkedList.size()/2), iterations, System.out, LINKED_LIST_TEXT + " get() из середины");
            TestTimer.printExecutionTime(() -> linkedList.getLast(), iterations, System.out, LINKED_LIST_TEXT + " getLast()");
            TestTimer.printExecutionTime(() -> linkedList.removeFirst(), iterations, System.out, LINKED_LIST_TEXT + " removeFirst()");
            TestTimer.measureExecutionTime(() -> linkedList.add(1), iterations);
            TestTimer.printExecutionTime(() -> linkedList.remove(linkedList.size()/2), iterations, System.out, LINKED_LIST_TEXT + " remove() из середины");
            TestTimer.measureExecutionTime(() -> linkedList.add(1), iterations);
            TestTimer.printExecutionTime(() -> linkedList.removeLast(), iterations, System.out, LINKED_LIST_TEXT + " removeLast()");
            TestTimer.measureExecutionTime(() -> linkedList.add(1), iterations);

            System.out.println("\n-------------------------\n");
        }
    }
}