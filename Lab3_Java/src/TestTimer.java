import java.io.PrintStream;

public class TestTimer
{
    @FunctionalInterface
    public interface Method
    {
        void execute();
    }

    public static long measureExecutionTime(Method method, int iterationsNumber)
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationsNumber; i++)
        {
            method.execute();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void printExecutionTime(Method method, int iterationsNumber, PrintStream outputStream, String methodToTest)
    {
        long executionTime = measureExecutionTime(method, iterationsNumber);
        outputStream.println(methodToTest + ": " + iterationsNumber + " итераций; время выполнения - " + executionTime + "мс");
    }
}
