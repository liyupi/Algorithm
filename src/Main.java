import java.util.Scanner;

/**
 * 功能描述：画正方形（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext())
        {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            for (int i = 0; i < (n + 1) / 2; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (i==0||i==((n + 1) / 2 -1)){
                        System.out.print(c);
                        continue;
                    }
                    if (j==0||j==n-1){
                        System.out.print(c);
                        continue;
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }


}