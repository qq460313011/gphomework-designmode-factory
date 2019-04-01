package fw.factory.factorymethod;

import fw.factory.BMW;
import fw.factory.ICar;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:38
 * @Description:
 */
public class BMWFactory implements ICarFactory {
    public ICar create() {
        return new BMW();
    }
}
