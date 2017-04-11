/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 14:34
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.visitorModel;

import java.util.Collection;
import java.util.Iterator;

public class ConcreteVisitor implements Visitor {
    public void visitString(StringElement stringE) {
        System.out.println(stringE.getStringE());
    }

    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getFloatE());
    }

    public void visitCollection(Collection collection) {
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
            Object o=iterator.next();
            if (o instanceof Visitable){
                ((Visitable)o).accept(this);
            }
        }

    }
}
