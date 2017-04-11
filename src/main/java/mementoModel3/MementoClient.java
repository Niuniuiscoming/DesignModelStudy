/** http://blog.csdn.net/zhengzhb/article/details/7697549
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 10:48
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.mementoModel3;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator=new Originator();

        originator.setState1("苹果");
        originator.setState2("香蕉");
        originator.setState3("梨");

        CareTaker careTaker=new CareTaker();
        careTaker.putMemento("1",originator.createMemento());

        originator.showState();

        originator.setState1("天");
        originator.setState2("地");
        originator.setState3("人");

        originator.showState();

        originator.reloadMemento(careTaker.getMemeMap("1"));

        originator.showState();
    }


}
