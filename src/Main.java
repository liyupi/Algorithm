import java.util.Scanner;

/**
 * 功能描述：母牛生牛（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main
{

    static long[] nums = new long[56];

    static void init(){
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 3;
        nums[4] = 4;
        for (int i = 5; i < 56 ; i++)
        {
            nums[i] = nums[i-1]+nums[i-3];
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        init();
        while (sc.hasNext())
        {
            int n =sc.nextInt();
            System.out.println(nums[n]);
        }
    }

}