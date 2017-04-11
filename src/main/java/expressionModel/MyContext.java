/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 17:21
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
import java.util.Stack;

public class MyContext {

    private Expressions expression;

    public void analyse(String expStr) {
        Stack<Expressions> stack=new Stack<Expressions>();
        char[] charArray=expStr.toCharArray();
        Expressions left=null;
        Expressions right=null;
        for(int i=0;i<charArray.length;i++){
            switch(charArray[i]){
                case '+':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));


            }


        }
        this.expression = stack.pop();
    }

    // 将键值对输入给表达式运算
    public int run(HashMap<String, Integer> var)
    {
        return expression.interpreter(var);
    }
}
