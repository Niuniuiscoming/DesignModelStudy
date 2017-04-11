/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/10 14:10
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.observerModel1;

import java.util.Observable;
import java.util.Observer;

public class NumObserver implements Observer{
    public void update(Observable o, Object arg) {
        NumObservable myObserable = (NumObservable) o;
        System.out.println("Data has changed to " +myObserable.data);
    }
}
