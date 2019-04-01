package fw.factory.abstractfactory;

/**
 * @Auther: Administrator
 * @Date: 2019/4/1 15:55
 * @Description:
 */
public class SonyMobilePhone implements IMobilePhone {
    public void call() {
        System.out.println("索尼手机信号不好");
    }
}
