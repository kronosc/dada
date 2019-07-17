package cc;

import java.util.ArrayList;
import java.util.Scanner;


public class Rentcar {

    public static void main(String[] args) {
        System.out.println("欢迎使用答答租车系统：");
        System.out.println("您是否要租车：1是 0否");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 1) {
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号 汽车名称 租金 容量");

            Car[] cars = new Car[6];
            for (int i = 0; i < Contanct.types.size(); i++) {
                cars[i] = CarFactory.getInstance(Contanct.types.get(i));
                System.out.println(i + 1 + ".   " + cars[i].name + "  " + cars[i].Rentmoney + "/天" + " 载人："
                        + cars[i].mannednum + "人" + " 载货：" + cars[i].loadnum + "吨");
            }
            System.out.println("请输入您要租汽车的数量");
            Scanner input1 = new Scanner(System.in);
            int sum = input1.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= sum; i++) {
                System.out.println("请输入第" + i + "辆车的序号");
                int a1 = input1.nextInt();
                list.add(a1);
                System.out.println(list);
            }
            System.out.println("请输入租车天数：");
            int daynum = input1.nextInt();

            System.out.println("您的账单：");
            System.out.println("****可载人的车有：");
            int sumend = 0;
            int sumend2 = 0;
            for (int i = 0; i < list.size(); i++) {
                if (cars[list.get(i) - 1].mannednum != 0) {
                    System.out.printf(cars[list.get(i) - 1].name + "\t");
                    sumend = sumend + cars[list.get(i) - 1].mannednum;
                }
            }
            System.out.println("共载人:" + sumend + "个");

            System.out.println("****可载货的车有：");
            for (int i = 0; i < list.size(); i++) {
                if (cars[list.get(i) - 1].loadnum != 0) {
                    System.out.printf(cars[list.get(i) - 1].name + "\t");
                    sumend2 = sumend2 + cars[list.get(i) - 1].loadnum;
                }
            }

            System.out.println("共载货:" + sumend2 + "吨");
            int summoney = 0;
            for (int i = 0; i < list.size(); i++) {
                summoney = summoney + cars[list.get(i) - 1].Rentmoney;
            }
            System.out.println("****租车总价格为" + summoney * daynum + "元");
        } else {
            System.out.println("您已退出答答租车系统");
        }
    }
}