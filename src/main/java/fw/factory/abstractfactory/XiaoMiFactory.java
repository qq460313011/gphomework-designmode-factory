package fw.factory.abstractfactory;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:59
 * @Description:
 */
public class XiaoMiFactory implements DigitalCompany {
    public IMobilePhone createMobilePhone() {
        return new XiaoMiMobilePhone();
    }

    public ITV createTV() {
        return new XiaoMiTV();
    }
}
