public class MainApplication {
    public static void main (String [] args) {



        System.out.println(getMin(new int[]{5,6,1,2,-3,13,12,-6,9,7,23}));
    }

    private static int getMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (Integer i : arr) {
            if (i < min) {
                min = i;
            }
        }

        return min;
    }
}

