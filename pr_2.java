public class pr_2 {
    static int Occurrence(String str, String s) {

        String a[] = str.split(" ");


        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (s.equals(a[i]))
                count++;
        }
        return count;
    }

    public static void main(String args[]) {
        String str = "Hello everyone ";
        String s = "everyone";
        System.out.println(Occurrence(str, s));
        System.out.println("Bhautik_21CE151");
    }
}

