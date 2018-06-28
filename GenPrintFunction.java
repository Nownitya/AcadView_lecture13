
public class GenPrintFunction 
{

    public static <T> void printArray(T[] inputArray) 
    {
        for (T element : inputArray)
        System.out.printf("%s ", element);
        System.out.println();
    }

    public static void main(String args[]) 
    {
        Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        Character[] characterArray = { 'A', 'B', 'C', 'D', 'E' };

        System.out.println("Array contains Integer: ");
        printArray(integerArray);
        System.out.println("Array contains Double: ");
        printArray(doubleArray);
        System.out.println("Array contains Character: ");
        printArray(characterArray);
  }
    
}
