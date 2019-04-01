package fw.factory.abstractfactory;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:51
 * @Description:
 */
public interface DigitalCompany {

    IMobilePhone createMobilePhone();

    ITV createTV();
}
