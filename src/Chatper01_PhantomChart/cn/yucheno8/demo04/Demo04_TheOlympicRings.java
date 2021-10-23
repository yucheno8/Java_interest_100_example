package Chatper01_PhantomChart.cn.yucheno8.demo04;

import javax.swing.*;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/

/*
    问题描述：在屏幕上画出奥运五环旗。
 */
public class Demo04_TheOlympicRings extends JFrame {

    public Demo04_TheOlympicRings() {
        setLayout(new BorderLayout());
        add(new DrawOlympicRings(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Demo04_TheOlympicRings frame = new Demo04_TheOlympicRings();
        frame.setSize(400, 300);
        frame.setTitle("DrawOlympicRings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class DrawOlympicRings extends JPanel {

        private Color clr[] = {Color.blue, Color.black, Color.red, Color.yellow, Color.green}; // clr[]存储颜色
        private int[] x = {100, 136, 172, 118, 154}; // x[]存储圆心的x坐标
        private int[] y = {60, 60, 60, 91, 91}; // x[]存储圆心的x坐标
        private int[][] xy = {{100, 60}, {136, 60}, {172, 60}, {118, 91}, {154, 91}}; // 存储圆心的坐标

        private int r = 20, d = 40;
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

                // 设置当前圆的颜色
                Font font = new Font ("楷体", Font.PLAIN,20); //文字字体、大小
                g.setFont(font);

                BasicStroke a = new BasicStroke(3.0f); // 粗细设置对象
                ((Graphics2D) g).setStroke(a); // 设置粗细

                for(int i=0; i < 5; i++){ //循环5次，画5个圆环
                    ((Graphics2D) g).setColor(clr[i]);
                    ((Graphics2D) g).drawOval(x[i], y[i], d, d); //d 代表椭圆外切矩形的长宽，相等代表圆
                }
                g.setColor(Color.blue); //设置颜色
                g.setFont(font);
                g.drawString("奥运五环旗",120,169);

        }
    }
}
