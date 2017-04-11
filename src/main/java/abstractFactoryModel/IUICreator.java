package main.java.abstractFactoryModel;

public interface IUICreator {
    public IButton createButton();
    public  ITextInput createTextInput();
}
