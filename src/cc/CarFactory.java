package cc;

import cc.domain.*;

/**
 * car factory
 *
 * @author vayi
 * @version 1.0
 * @date 2019-07-17
 */
public class CarFactory {

    /**
     * 根据类型获取实例
     *
     * @param carType
     * @return Car
     */
    public static Car getInstance(String carType) {
        Car car = null;
        switch(carType){
            case Contanct.Car.AODI:
                car = new Aodi();
                break;
            case Contanct.Car.KING:
                car = new King();
                break;
            case Contanct.Car.MAZD:
                car = new Mazd();
                break;
            case Contanct.Car.PIKA:
                car = new Pika();
                break;
            case Contanct.Car.SONGHJ:
                car = new Songhj();
                break;
            case Contanct.Car.YIWEI:
                car = new Yiwei();
                break;
            default:
                System.out.println("Connot get car type: " + carType);
        }
        return car;
    }

}
