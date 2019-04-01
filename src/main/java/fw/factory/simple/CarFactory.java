package fw.factory.simple;

import fw.factory.BMW;
import fw.factory.Benz;
import fw.factory.ICar;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:20
 * @Description:
 */
public class CarFactory {


    /**
     * 获取汽车
     * @param cartype
     * @return
     */
    public ICar GetCar(String cartype) {
        ICar car = null;
        if (cartype.equals("Benz")) {
            car = new Benz();
        } else if (cartype.equals("BMW")) {

            car = new BMW();
        }
        return car;
    }

}
