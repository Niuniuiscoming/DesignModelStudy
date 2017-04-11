package main.java.ProxyPattern1;

public interface IGamePlayer {
    void login();
    public void play();
    public String getUserName();
    public IGamePlayer getProxy();
}
