package main.java.observerModel;

/**
 * 抽象观察者角色：为所有观察者定义一个接口，在接到主题角色的通知时更新自己
 * @author Administrator
 *
 */
public interface Watcher {
    public void update(String str);
}
