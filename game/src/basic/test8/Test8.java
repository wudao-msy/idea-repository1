package basic.test8;

/**
 * Author:msy
 * Date:2020-08-12 22:06
 * Description:<描述>
 * 问题描述
 * 　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 * 输出格式
 * 　　按从小到大的顺序输出满足条件的四位十进制数。
 */
public class Test8 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                System.out.println(i+""+j+""+j+""+i);
            }
        }
    }
}
