public class XunHuan {

    public static void main(String args[]) {
        Integer i=0;
        while(i<=20)
        {
            System.out.println("目前i的值为："+i);
            i++;
        }
        float floatVar=0;
        int intVar=1;
        String stringVar="123";
        String fs;
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, stringVar);
        System.out.println(fs);
    }
}
