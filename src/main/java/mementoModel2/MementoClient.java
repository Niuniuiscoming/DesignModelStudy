/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 8:46
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.mementoModel2;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator=new Originator("苹果","香蕉","梨");
        originator.showState();

        CareTaker careTaker=new CareTaker();
        Memento memento=originator.CreateMemento();
        careTaker.setMap("1",memento);

        originator.setState1("笔");
        originator.setState2("墨");
        originator.setState3("纸");

        originator.showState();

        originator.reloadMemento(careTaker.getMap("1"));
        originator.showState();

    }



}
