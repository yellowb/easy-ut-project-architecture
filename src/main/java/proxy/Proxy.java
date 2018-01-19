package proxy;

import thirdparty.dto.UserDTO;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Proxy for remote invoke
 */
public class Proxy<T> {




//    public T getById(long id) {
//        Type mySuperClass = this.getClass();
//        Type type = (Class<T>)((ParameterizedType)mySuperClass).getActualTypeArguments()[0];
//        System.out.println(type);
//        return null;
//    }

    public static void main(String[] args) {
        new Proxy<String>().getById(1L);
    }
}
