package com.yupi.algorithm.pat.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 功能描述：德才论（狗题，浪费时间）
 *
 * @author Yupi Li
 * @date 2018/08/29 10:59
 */
public class Main1005
{
    public static void main(String[] args)
    {
        class Student
        {
            private String ID;
            private int morals;
            private int talents;

            Student(String ID, int morals, int talents)
            {
                this.ID = ID;
                this.morals = morals;
                this.talents = talents;
            }
        }

        ArrayList<Student> firstClass = new ArrayList<Student>();
        ArrayList<Student> secondClass = new ArrayList<Student>();
        ArrayList<Student> thirdClass = new ArrayList<Student>();
        ArrayList<Student> fourthClass = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int L = sc.nextInt();
        int H = sc.nextInt();
        Student[] student = new Student[num];
        for (int i = 0; i < num; i++)
        {
            student[i] = new Student(sc.next(), sc.nextInt(), sc.nextInt());
            if (student[i].morals >= H && student[i].talents >= H)
                firstClass.add(student[i]);
            else if (student[i].morals >= H && student[i].talents >= L)
                secondClass.add(student[i]);
            else if (student[i].morals >= L && student[i].talents >= L && student[i].morals >= student[i].talents)
                thirdClass.add(student[i]);
            else if (student[i].morals >= L && student[i].talents >= L)
                fourthClass.add(student[i]);
        }
        System.out.println(firstClass.size() + secondClass.size() + thirdClass.size() + fourthClass.size());
        Comparator<Student> com = (o1, o2) -> {
            if (o1.morals + o1.talents > o2.morals + o2.talents)
            {
                return -1;
            } else if (o1.morals + o1.talents < o2.morals + o2.talents)
            {
                return 1;
            } else
            {
                if (o1.morals > o2.morals)
                {
                    return -1;
                } else if (o1.morals < o2.morals)
                {
                    return 1;
                } else
                {
                    if (Integer.valueOf(o1.ID) < Integer.valueOf(o2.ID))
                    {
                        return -1;
                    } else
                    {
                        return 1;
                    }
                }
            }
        };
        Collections.sort(firstClass, com);
        Collections.sort(secondClass, com);
        Collections.sort(thirdClass, com);
        Collections.sort(fourthClass, com);
        for (int i = 0; i < firstClass.size(); i++)
        {
            String id = firstClass.get(i).ID;
            int m = firstClass.get(i).morals;
            int t = firstClass.get(i).talents;
            System.out.println(id + " " + m + " " + t);
        }
        for (int i = 0; i < secondClass.size(); i++)
        {
            String id = secondClass.get(i).ID;
            int m = secondClass.get(i).morals;
            int t = secondClass.get(i).talents;
            System.out.println(id + " " + m + " " + t);
        }

        for (int i = 0; i < thirdClass.size(); i++)
        {
            String id = thirdClass.get(i).ID;
            int m = thirdClass.get(i).morals;
            int t = thirdClass.get(i).talents;
            System.out.println(id + " " + m + " " + t);
        }

        for (int i = 0; i < fourthClass.size(); i++)
        {
            String id = fourthClass.get(i).ID;
            int m = fourthClass.get(i).morals;
            int t = fourthClass.get(i).talents;
            System.out.println(id + " " + m + " " + t);
        }


    }

}
