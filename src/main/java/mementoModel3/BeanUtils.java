/**
 * 功能描述:
 * 模块:
 * 项目:DesignModelStudy
 * 版本号: 1.0.0
 * 部门:互联网资产管理事业部
 * 公司:信雅达系统工程有限公司
 * 作者:黄士卿
 * 邮箱:shiq.huang@sunyard.com
 * 创建时间: 2017/3/20 9:59
 * ************************************
 * ************************************
 * 修改人:
 * 修改时间:
 * 修改内容:
 * 1.
 * 2.
 */

package main.java.mementoModel3;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {

    public static Map<String,Object> backupProp(Object object){
        Map<String,Object> stateMap=new HashMap<String, Object>();
        try {
            BeanInfo beanInfo= Introspector.getBeanInfo(object.getClass());
            PropertyDescriptor[] propertyDescriptors=beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor:propertyDescriptors){
                String fileName=descriptor.getName();
                Method getmethod=descriptor.getReadMethod();
                Object values=getmethod.invoke(object,new Object[]{});
                if (!fileName.equalsIgnoreCase("class")) {
                    stateMap.put(fileName, values);
                }
            }
        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return  stateMap;

    }

    public static void reloadMemento(Object bean,Map<String,Object> statemap){
        try {
            BeanInfo beanInfo=Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors =beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor descriptor:descriptors){
                String fileName=descriptor.getName();
                Method setMethod=descriptor.getWriteMethod();
                if(statemap.containsKey(fileName)) {
                    setMethod.invoke(bean, statemap.get(fileName));
                }
            }

        } catch (IntrospectionException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


}
