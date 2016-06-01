package day001.recursion;

/**
 * Created by kystudio on 2016/4/14.
 */
public class Test {
    /*
    使用循环方式计算阶乘，又叫做迭代方式
     */
    public int compute1(int number) {
        int result = 1;
        for (int i = number; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    /*
    使用递归方式计算阶乘
     */
    public int compute2(int number) {
        if (1 == number) {
            return 1;
        } else {
            return number * compute2(number - 1);
        }
    }

    /*
    使用递归计算斐波那契数列
     */
    public  int fab(int n)
    {
        // 递归的出口
        if (1==n || 2==n)
        {
            return 1;
        }
        else
        {
            return fab(n-1)+fab(n-2);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        int a = test.compute1(5);
        int b = test.compute2(5);

        System.out.println(a + "----" + b);

        int c =test.fab(9);

        System.out.println(c);
    }
}
