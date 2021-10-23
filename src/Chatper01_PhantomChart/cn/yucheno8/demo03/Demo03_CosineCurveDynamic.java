package Chatper01_PhantomChart.cn.yucheno8.demo03;

import javax.swing.*;
import java.awt.*;

/**
 * @author yucheno8
 * @date 2021/10/23/023
 **/
public class Demo03_CosineCurveDynamic extends JFrame {
    public Demo03_CosineCurveDynamic() {
        setLayout(new BorderLayout());
        add(new DrawCosine(), BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Demo03_CosineCurveDynamic frame = new Demo03_CosineCurveDynamic();
        frame.setSize(800, 400);
        frame.setTitle("CosineCurveDynamic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    class DrawCosine extends JPanel implements Runnable{ // 通过实现 Runnable 接口实现线程操作

        int x, y;
        double a;
        int xpos = 0;
        Thread runner;
        boolean painted = false;

        public void init(Graphics graphics) {

            for (x = 0; x <= 750; x += 1) {
                graphics.drawString(".", x, 200); // 画x轴
                if (x <= 385) graphics.drawString(".", 360, x); // 画y轴
            }

            graphics.drawString("Y", 330, 20); // 画Y
            for (x = 360; x <= 370; x += 1) {
                graphics.drawString(".", x - 10, 375 - x); // 画y轴箭头
                graphics.drawString(".", x, x - 355);
            }

            graphics.drawString(".", 735, 230);
            for (x = 740; x <= 750; x += 1) {
                graphics.drawString(".", x, x - 550);
                graphics.drawString(".", x, 950 - x);
            }
        }

        public void start() {
            if (runner == null) {
                runner = new Thread(this); // 通过Thread类来启动Runnable
                runner.start(); // 线程启动
            }
        }

        public void stop() {
            if (runner != null) {
                runner = null; // 结束线程
            }
        }

        @Override
        public void run() {
            while (true) {
                for (xpos = 0; xpos < 900 - 90; xpos += 3) {
                    repaint();
                    try {
                        Thread.sleep(100); // 线程休息100毫秒
                    } catch (InterruptedException e) {}
                    if (painted) {
                        painted = false;
                    }
                }
            }
        }

        public void paint(Graphics graphics) {

            super.paint(graphics);
            for (x = 0; x <= 720; x += 1) { // 循环画曲线
                a = Math.cos(x * Math.PI / 180 + Math.PI);
                y = (int) (200 + 80 * a); // 放大80倍并向下平移200个像素
                graphics.drawString(".", x, y);
            }
            painted = true;

            /*// 添加坐标
            Polygon p = new Polygon();
            graphics.setColor(Color.red);
            graphics.drawPolyline(p.xpoints, p.ypoints, p.npoints);
            graphics.drawString("-2\u03c0", 280, 220);
            graphics.drawString("2\u03c0", 490, 220);
            graphics.drawString("0", 380, 220);*/

        }

    }
}
