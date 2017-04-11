/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 15:13
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.instanceofTest;

public class InstanceofTest {
    public static void main(String[] args) {
        instanceofTest(new Person());
    }

    private static void instanceofTest(Object p) {
        if (p instanceof Postgraduate) System.out.println("p是类Postgraduate的实例");
        if (p instanceof Person) System.out.println("p是类Person的实例");
        if (p instanceof Student) System.out.println("p是类Student的实例");
        if (p instanceof Object) System.out.println("p是类Object的实例");
    }

}
class Person {
}
class Student extends Person {
}
class Postgraduate extends Student {
}
class Animal {
}