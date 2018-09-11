package com.yupi.algorithm.pat.simple_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 功能描述：寻找成绩最大最小值（水题）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class Main1035 {

    static class Student{
        String name;
        String xuehao;
        int grand;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getXuehao() {
            return xuehao;
        }

        public void setXuehao(String xuehao) {
            this.xuehao = xuehao;
        }

        public int getGrand() {
            return grand;
        }

        public void setGrand(int grand) {
            this.grand = grand;
        }

        @Override
        public String toString() {
            return name+" "+xuehao;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n=scanner.nextInt();
        List<Student> students = new ArrayList<>();
        while (--n>=0){
            Student student = new Student();
            student.setName(scanner.next());
            student.setXuehao(scanner.next());
            student.setGrand(scanner.nextInt());
            students.add(student);
        }
        int max=0,min=100;
        int maxIndex=0,minIndex=0;
        for (int i=0;i<students.size();i++) {
            int grand = students.get(i).getGrand();
            if (grand>max){
                max = grand;
                maxIndex = i;
            }
            if (grand<min) {
                min = grand;
                minIndex = i;
            }
        }
        System.out.println(students.get(maxIndex).toString());
        System.out.println(students.get(minIndex).toString());
        scanner.close();

    }

}