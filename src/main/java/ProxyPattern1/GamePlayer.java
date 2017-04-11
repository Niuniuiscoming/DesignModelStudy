/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/22 14:06
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.ProxyPattern1;


import java.util.Date;

public class GamePlayer implements IGamePlayer{
    private String userName;
    private IGamePlayer proxy;

    public GamePlayer(String userName) {
        this.userName = userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void login() {
        if(isProxy()){
            System.out.println("玩家："+userName+"登录了；时间："+new Date().toString());
        }else{
            System.out.println("请设置代理");
        }
    }

    public void play() {
        if(isProxy())
        {
            System.out.println("玩家："+userName+"正在打怪");
        }else{
            System.out.println("请使用指定的代理");
        }
    }

    public String getUserName() {
        return userName;
    }

    public IGamePlayer getProxy() {
        this.proxy=new ProxyPlayer(this);
        return  proxy;
    }

    private boolean isProxy(){
        if(proxy ==null){
            return false;
        }else
            return true;
    }
}
