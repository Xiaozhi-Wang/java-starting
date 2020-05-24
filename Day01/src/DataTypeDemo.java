public class DataTypeDemo {
    public static void main(String[] args) {
        System.out.println(1024);
        System.out.println(3.14);

        //long num1 = 100L;
        //int->long，数据范围从小到大
        long num1 = 100;
        System.out.println(num1);

        //long->float，数据范围从小到大
        float num2 = 100L;
        System.out.println(num2);

        //float->double，数据范围从小到大
        double num3 = 2.5F;
        System.out.println(num3);

        //int num4 = 100L;不能自动类型转换，这种需要强制数据类型转换
        int num4 = (int) 100L;
        System.out.println(num4);

        int num5 = (int)6000000000L;
        System.out.println(num5);//数据溢出

        int num6 = (int)3.5;
        System.out.println(num6);//直接去尾，精度丢失

        char c = 'A';
        System.out.println(c+1);//char类型计算会被转换为ASCII

        byte num7 = 50;
        byte num8 = 70;
        //byte result = num7+num8;byte+byte->int+int->int
        int result = num7+num8;
        System.out.println(result);

        short num9 = 40;
        short num10 = 50;
        short result1 = (short) (num9+num10);
        System.out.println(result1);

        char c1 = '1';
        System.out.println(c1+0);
        int num = c1+0;
        System.out.println(num);

        char c2 = '中';
        System.out.println(c2+0);
    }
}
