package hw6;

class Arr {


    public static int[] arrModFore(int[] arr) {
        int[] result = new int[arr.length % 4];

        for (int i = 0; i < result.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static boolean haseOneAndFore(int[] arr) {

        boolean one = false;
        boolean fore = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                return false;
            }

            if (arr[i] == 1) {
                one = true;
            }

            if (arr[i] == 4) {
                fore = true;
            }
        }
        return fore && one;
    }
}
