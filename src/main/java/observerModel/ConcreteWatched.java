/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/10 11:06
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.observerModel;

import java.util.ArrayList;

/**
 * 具体主题角色：
 * 实现抽象主题角色
 * @author Administrator
 */
public class ConcreteWatched implements BeWatched {
    private ArrayList<Watcher> al=new ArrayList<Watcher>();

    public void addWatcher(Watcher watcher) {
        al.add(watcher);//添加观察者到指定队列中
    }

    public void removeWatcher(Watcher watcher) {
        al.remove(watcher);

    }

    public void notifyWatchers(String str) {
        for (int i=0;i<al.size();i++) {
            Watcher watch=al.get(i);
            watch.update(str);
        }
    }
}
