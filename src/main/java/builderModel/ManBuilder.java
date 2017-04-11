/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/15 15:58
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.builderModel;

public class ManBuilder implements  PersonBuilder{
    Person person;

    public ManBuilder() {
        this.person = new Person();
    }

    public void buildHead() {
        person.setHead("头");
    }

    public void buildBody() {
        person.setBody("身体");
    }

    public void buildFoot() {
        person.setFoot("脚");
    }

    public Person buildPerson() {
        return person;
    }
}
