/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/21 15:49
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.FactoryModel;

public class FactoryClient {
    public static void main(String[] args) {
        ProductFactory productFactory=new ProductFactory();
        Product product=productFactory.creareProduct(SubProduct1.class);

        System.out.println(product);

        Product product2=productFactory.creareProduct(SubProduct2.class);

        System.out.println(product2);
    }
}
