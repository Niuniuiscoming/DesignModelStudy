/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/10 11:20
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.observerModel;

public class ObserverClientTest {
   public static void main(String[] args) {
       ConcreteWatched concreteWatched=new ConcreteWatched();

       ConcreteWatcher concreteWatcher1=new ConcreteWatcher("1");
       ConcreteWatcher concreteWatcher2=new ConcreteWatcher("2");
       ConcreteWatcher concreteWatcher3=new ConcreteWatcher("3");

       concreteWatched.addWatcher(concreteWatcher1);
       concreteWatched.addWatcher(concreteWatcher2);
       concreteWatched.addWatcher(concreteWatcher3);

       concreteWatched.notifyWatchers("你好");

       System.out.println("----------------------");

       concreteWatched.removeWatcher(concreteWatcher2);
       concreteWatched.notifyWatchers("good");
   }
}
