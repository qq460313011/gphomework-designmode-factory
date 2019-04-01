package fw.factory.factorymethod;

import fw.factory.ICar;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:39
 * @Description:
 */
public class ICarFactoryTest {

    public static void main(String[] args) {
        ICarFactory carFactory=new BMWFactory();

        ICar car= carFactory.create();

        car.sayBrand();
    }

}
