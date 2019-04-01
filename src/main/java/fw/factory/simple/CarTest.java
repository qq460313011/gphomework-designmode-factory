package fw.factory.simple;

import fw.factory.ICar;

/**
 * 测试类
 */
public class CarTest {

    public static void main(String[] args) {

        ICar car = null;
        CarFactory factory = new CarFactory();
        car = factory.GetCar("Benz");
        car.sayBrand();
    }
}
