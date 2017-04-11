/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 9:40
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.mementoModel3;

import java.util.HashMap;

public class CareTaker {
    private HashMap<String,Memento> mememap=new HashMap<String, Memento>();

    public Memento getMemeMap(String index){
        return  mememap.get(index);
    }

    public void putMemento(String index,Memento memento){
        mememap.put(index, memento);
    }
}
