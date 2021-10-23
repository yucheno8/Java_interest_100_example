package Chatper01_PhantomChart.cn.yucheno8.demo05;

import java.util.Scanner;


/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/

/*
    问题描述：根据输入行数，打印出杨辉三角形。
    问题分析：
        规律：①三角形的竖边和斜边都是“1”；
             ②三角形里面的任意一个数字正好等于它正上方的数字和左上角的数字两个数字之和。
 */
public class Deemo05_YanghuiTriangle02 {
    public static void main(String[] args) {
        System.out.println("请输入杨辉三角的行高：");
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();

        int[][] arr = getYanghuiTringle(h);
        print(arr);
    }

    private static int[][] getYanghuiTringle(int n) {
        int[][] str = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == j) {
                    str[i][j] = 1;
                } else {
                    str[i][j] = str[i - 1][j - 1] + str[i - 1][j];
                }
            }System.out.println();
        }
        return str;
    }

    private static void print(int[][] ary) {
        for (int i = 1; i < ary.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ary[i][j] + " ");
            }
            System.out.println();
        }
    }
}
