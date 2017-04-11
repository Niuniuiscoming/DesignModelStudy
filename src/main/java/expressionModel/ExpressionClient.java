/**  http://blog.csdn.net/u010024991/article/details/53436073
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 17:18
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.expressionModel;

import java.util.HashMap;

public class ExpressionClient {
    public static void main(String[] args) {
        String expStr="a+b-c+d";
        HashMap<String,Integer> var=new HashMap<String, Integer>();
        var.put("a",1);
        var.put("b",2);
        var.put("c",3);
        var.put("d",4);

        MyContext mycontext=new MyContext();
        mycontext.analyse(expStr);

        System.out.println(mycontext.run(var));


    }

}
