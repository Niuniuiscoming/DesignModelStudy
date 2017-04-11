package main.java.FactoryModel;

public interface IProductFactory {
    public <T extends Product> T creareProduct(Class<T>  Class);
}
