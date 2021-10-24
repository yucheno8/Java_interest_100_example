package Chatper01_PhantomChart.cn.yucheno8.demo08;


/**
 * @author yucheno8
 * @date 2021/10/24/024
 **/

/*
    问题描述：打印回型矩阵图案。
 */
public class Demo08_BackMatrix {

    static int length = 8;
    static int value = 1;
    static int[][] snake = new int[length][length]; // 二维数组存储
    static Direction lastDirection = Direction.Right; // 代表当前前进方向

    static enum Direction {
        Right, Down, Left, Up;
    }


    public static void main(String[] args) {

        initialArray(); // 填充数字
        print(snake); // 输出
    }

    // 按顺时针方向，由内向外，填充数字
    public static void initialArray() {
        int row = 0, col = 0;
        for (int c = 0; c < length * length; c++) { // 循环填充数字，总共填充length * length次
            snake[row][col] = value; // 当前位置赋值
            lastDirection = findDirection(row, col); // 寻找下一步方向
            switch (lastDirection) {
                case Right:
                    col++; // 如果向右，列加1
                    break;
                case Down:
                    row++; // 如果向下，行加1
                    break;
                case Left:
                    col--; // 如果向左，列减1
                    break;
                case Up:
                    row--; // 如果向上，行减1
                    break;
                default:
                    System.out.println("error");
            }
            value++; // 下一个数字
        }
    }

    // 根据当前方向，结合当前位置，确定下一步方向
    static Direction findDirection(int row, int col) {
        Direction direction = lastDirection;
        switch (direction) {
            case Right: {
                // 如果右边界或者当前位置右方已经填充过数字，则转弯向下
                if ((col == length - 1) || (snake[row][col + 1] != 0)) {
                    direction = direction.Down;
                }
                break;
            }
            case Down: {
                // 如果下边界或者当前位置下方已经填充过数字，则转弯向下
                if ((row == length - 1) || (snake[row + 1][col] != 0)) {
                    direction = direction.Left;
                }
                break;
            }
            case Left: {
                // 如果左边界或者当前位置左方已经填充过数字，则转弯向下
                if ((col == 0) || (snake[row][col - 1] != 0)) {
                    direction = direction.Up;
                }
                break;
            }
            case Up: {
                // 如果上边界或者当前位置上方已经填充过数字，则转弯向下
                if (snake[row -1][col] != 0) {
                    direction = direction.Right;
                }
                break;
            }
        }
        return direction;
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf(" %2d", arr[i][j]);
            }
            System.out.println(); // 换行
        }
    }
}
