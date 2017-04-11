/** http://blog.csdn.net/zhengzhb/article/details/7697549 备忘录模式 多状态、多记录一般实现
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/19 17:38
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.mementoModel2;

import java.util.HashMap;

public class CareTaker {
    private HashMap<String,Memento> map=new HashMap<String, Memento>();

    public Memento getMap(String index) {
        return map.get(index);
    }

    public void setMap(String index,Memento memento) {
        this.map.put(index,memento);
    }
}
