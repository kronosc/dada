import  java.util.ArrayList;
import java.util.Scanner;


public class Rentcar {

    // TODO: @cc integer是个什么鬼 QAQ
    public static <integer> void main(String[] args) {
        System.out.println("欢迎使用答答租车系统：");
        System.out.println("您是否要租车：1是 0否");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num==1)
        {
            System.out.println("您可租车的类型及其价目表：");
            System.out.println("序号 汽车名称 租金 容量");

            // TODO: @cc 是否可以考虑用继承
            Car car1=new Car("奥迪A4",500,4,0);
            Car car2=new Car("马自达6",400,4,0);
            Car car3=new Car("皮卡雪6",450,4,2);
            Car car4=new Car("金龙",800,20,0);
            Car car5=new Car("松花江",400,0,4);
            Car car6=new Car("依维柯",1000,0,20);
            Car []cars = new Car[6];
            cars[0]=car1;
            cars[1]=car2;
            cars[2]=car3;
            cars[3]=car4;
            cars[4]=car5;
            cars[5]=car6;

            System.out.println("1.   "+car1.name+"  "+car1.Rentmoney+"/天"+" 载人："+car1.mannednum+"人");
            System.out.println("2.   "+car2.name+"  "+car2.Rentmoney+"/天"+" 载人："+car2.mannednum+"人");
            System.out.println("3.   "+car3.name+"  "+car3.Rentmoney+"/天"+" 载人："+car3.mannednum+"人"+" 载货："+car3.loadnum+"吨");
            System.out.println("4.   "+car4.name+"  "+car4.Rentmoney+"/天"+" 载人："+car4.mannednum+"人");
            System.out.println("5.   "+car5.name+"  "+car5.Rentmoney+"/天"+" 载货："+car5.loadnum+"吨");
            System.out.println("6.   "+car4.name+"  "+car6.Rentmoney+"/天"+" 载货："+car6.loadnum+"吨");
            System.out.println("请输入您要租汽车的数量");
            Scanner input1 = new Scanner(System.in);
            int sum = input1.nextInt();
            // TODO: @cc new ArrayList<>()
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=1;i<=sum;i++)
            {
                System.out.println("请输入第"+i+"辆车的序号");
//                Scanner input2 = new Scanner(System.in);
                int a1= input1.nextInt();
                list.add(a1);
                System.out.println(list);
            }
            System.out.println("请输入租车天数：");
            int daynum=input1.nextInt();

            System.out.println("您的账单：");
            System.out.println("****可载人的车有：");
            int sumend=0;
            int sumend2=0;
            for(int i=0;i<list.size();i++) {
                if (cars[list.get(i)-1].mannednum != 0) {
                    System.out.printf(cars[list.get(i)-1].name + "\t");
                    sumend = sumend + cars[list.get(i)-1].mannednum;
                }
            }
            System.out.println("共载人:"+sumend+"个");

            System.out.println("****可载货的车有：");
            for(int i=0;i<list.size();i++) {
                    if(cars[list.get(i)-1].loadnum!=0) {
                    System.out.printf(cars[list.get(i)-1].name+"\t");
                    sumend2 = sumend2 + cars[list.get(i)-1].loadnum;
                }
            }

            System.out.println("共载货:"+sumend2+"吨");
            int summoney=0;
            for(int i=0;i<list.size();i++)
            {
            summoney=summoney+cars[list.get(i)-1].Rentmoney;
            }
            System.out.println("****租车总价格为"+summoney*daynum+"元");
        }
        else{
            System.out.println("您已退出答答租车系统");
        }
    }
}