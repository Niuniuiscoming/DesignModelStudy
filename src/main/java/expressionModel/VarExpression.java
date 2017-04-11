/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/21 10:01
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

/**
 * 变量解析器
 * 终结符表达式
 */
public class VarExpression extends Expressions {
    private String key;

    public VarExpression(String key)
    {
        this.key = key;
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
