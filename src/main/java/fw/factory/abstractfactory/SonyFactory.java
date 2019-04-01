package fw.factory.abstractfactory;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:54
 * @Description:
 */
public class SonyFactory implements DigitalCompany {
    public IMobilePhone createMobilePhone() {
        return new SonyMobilePhone();
    }

    public ITV createTV() {
        return new SonyTV();
    }
}
