package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        // 5人分の、算数のテストの成績
        int[] score = {41, 85, 72, 38, 80};

        // 合否を判定
        for (int i = 0; i < 5; i++) {
            if (score[i] < 60) {
                System.out.println(i + "番 " + score[i] + "点 不可");
            } else if (60 <= score[i] && score[i] < 70) {
                System.out.println(i + "番 " + score[i] + "点 可");
            } else if (70 <= score[i] && score[i] < 80) {
                System.out.println(i + "番 " + score[i] + "点 良");
            } else if (80 <= score[i] && score[i] < 90) {
                System.out.println(i + "番 " + score[i] + "点 優");
            } else {
                System.out.println(i + "番 " + score[i] + "点 秀");
            }
        }

        int max = max(score);
        int min = min(score);
        double ave = average(score);

        System.out.println("\n最高点 : " + max + "点");
        System.out.println("最低点 : " + min + "点");
        System.out.println("平均点 : " + ave + "点");
    }


    // max関数
    static int max(int[] score) {
        int max = score[0];
        for (int i = 1; i < 5; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }

    // min関数
    static int min(int[] score) {
        int min = score[0];
        for (int i = 1; i < 5; i++) {
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    // average関数
    static double average(int[] score) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + score[i];
        }

        double ave = sum / 5;
        return ave;
    }
}
