/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/13 22:59
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.MyProxyModel;


import java.lang.reflect.Proxy;

public class ProxyDemo {
    public static void  main(String args[]){
        DynamicProxyHandler dynamicProxyHandler=new DynamicProxyHandler(new RealAction());
        Action action= (Action) Proxy.newProxyInstance(RealAction.class.getClassLoader(),RealAction.class.getInterfaces(),dynamicProxyHandler);
        action.operator1();

    }
}
