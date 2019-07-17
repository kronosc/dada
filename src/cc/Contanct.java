package cc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 常量
 *
 * @author vayi
 * @version 1.0
 * @date 2019-07-17
 */
public class Contanct {

    static final List<String> types = Arrays.asList(
            Car.AODI, Car.KING, Car.MAZD,
            Car.PIKA, Car.SONGHJ, Car.YIWEI
    );

    class Car {
        static final String AODI = "AODI";
        static final String KING = "KING";
        static final String MAZD = "MAZD";
        static final String PIKA = "PIKA";
        static final String SONGHJ = "SONGHJ";
        static final String YIWEI = "YIWEI";
    }

}
