package fw.factory.factorymethod;

import fw.factory.Benz;
import fw.factory.ICar;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:35
 * @Description:
 */
public class BenzFactory implements ICarFactory {


    public ICar create() {
        return new Benz();
    }
}
