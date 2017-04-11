/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/22 14:37
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.ProxyPattern1;

public class ProxyPatternClient {
    public static void main(String[] args) {
        IGamePlayer gamePlayer=new GamePlayer("LEE");
        IGamePlayer proxyPlayer=gamePlayer.getProxy();

        proxyPlayer.login();
        proxyPlayer.play();
    }

}
