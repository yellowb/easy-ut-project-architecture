package proxy;

import thirdparty.dto.UserDTO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Proxy for remote invoke
 */
public class Proxy<T> {

    private Class<T> clazz;

    public T getById(long id) {
        Type t=this.getClass().getGenericSuperclass();
        //获取泛型参数的实际类型
        this.clazz=(Class<T>)((ParameterizedType)t).getActualTypeArguments()[0];
        System.out.println(clazz);
        return null;
    }

    public static void main(String[] args) {
        new Proxy<String>().getById(1L);
    }
}
