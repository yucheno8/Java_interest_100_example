package Chatper01_PhantomChart.cn.yucheno8.demo02;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/
/*
    问题描述：输出九九乘法口诀表。
 */
public class Demo01_NineNineMultiplicationTable {
    public static void main(String[] args) {
        // 外层循环控制行
        for (int i = 1; i <= 9; i++) {
            // 内层循环控制列
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            // 每结束一行，输入换行
            System.out.println("");
        }
    }
}
