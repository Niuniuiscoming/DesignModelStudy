/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/22 13:51
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.proxyPattern;

public class ProxyPlayer implements IGamePlayer{
    private IGamePlayer gamePlayer;

    public ProxyPlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public IGamePlayer getGamePlayer() {
        return gamePlayer;
    }

    public void setGamePlayer(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }


    public void login() {
        System.out.println("日志："+getUserName()+"开始代练"+gamePlayer.getUserName()+"的游戏账号了");
        gamePlayer.login();
    }

    public void play() {
        System.out.println("日志："+getUserName()+"开始给"+gamePlayer.getUserName()+"的游戏账号打怪升级了");
        gamePlayer.play();
    }


    public String getUserName() {
        return "代练者-李四";
    }
}
