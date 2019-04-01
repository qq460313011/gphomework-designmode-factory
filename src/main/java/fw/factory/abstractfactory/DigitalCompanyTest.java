package fw.factory.abstractfactory;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 16:00
 * @Description:
 */
public class DigitalCompanyTest {


    public static void main(String[] args) {
        DigitalCompany digitalCompany = new XiaoMiFactory();
        IMobilePhone mobilePhone = digitalCompany.createMobilePhone();
        ITV tv = digitalCompany.createTV();
        mobilePhone.call();
        tv.showProgrom();


        digitalCompany = new SonyFactory();
        mobilePhone = digitalCompany.createMobilePhone();
        tv = digitalCompany.createTV();
        mobilePhone.call();
        tv.showProgrom();
    }
}
