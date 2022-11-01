package lecture01;

public class Kadai4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sum = 0;

        // 今回は計100回の繰り返しという回数が決まっているため、for文を採用した
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1; // 配列番号+1の値を代入

            // 配列番号が偶数の値はsumに加算
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println("array[0] ~ [99] : 1 ~ 100");
        System.out.println("配列番号が偶数の値の総和 : " + sum);
    }
}
