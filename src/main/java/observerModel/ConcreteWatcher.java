/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/10 11:08
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.observerModel;

public class ConcreteWatcher implements  Watcher {
    private  String watcherName;

    public String getWatcherName() {
        return watcherName;
    }

    public void setWatcherName(String watcherName) {
        this.watcherName = watcherName;
    }

    public ConcreteWatcher() {
    }
    public ConcreteWatcher(String watcherName) {
        this.watcherName=watcherName;
    }


    public void update(String str) {
        System.out.println(watcherName+"已经收到通知："+str);
    }
}
