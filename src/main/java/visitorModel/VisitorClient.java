/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 14:48
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.visitorModel;

import java.util.ArrayList;
import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        Visitor visitor=new ConcreteVisitor();

        FloatElement floatElement=new FloatElement(new Float(1.5));
        visitor.visitFloat(floatElement);

        StringElement stringElement = new StringElement("abb");
        visitor.visitString(stringElement);

        List list=new ArrayList();

        FloatElement floatElement1=new FloatElement(new Float(1.5));
        FloatElement floatElement2=new FloatElement(new Float(2.5));
        FloatElement floatElement3=new FloatElement(new Float(3.5));

        list.add(floatElement1);
        list.add(floatElement2);
        list.add(floatElement3);

        StringElement stringElement1=new StringElement("ab");
        StringElement stringElement2=new StringElement("bc");
        StringElement stringElement3=new StringElement("cd");

        list.add(stringElement1);
        list.add(stringElement2);
        list.add(stringElement3);

        visitor.visitCollection(list);

    }

}
