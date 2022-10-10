public class pr_1 {
    public static <A> void printArray(A[] inputArray) {

        for (A element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String []args) {


        Integer[] intArray = { 11, 12, 13, 14, 15 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'B','H','A','U','T','I','K' };

        System.out.println("integerArray :");
        printArray(intArray);

        System.out.println("doubleArray :");
        printArray(doubleArray);

        System.out.println("characterArray :");
        printArray(charArray);
        System.out.println("Bhautik_21CE151");

    }
}

