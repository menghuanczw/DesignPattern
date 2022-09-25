package utilpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 接口处理类
 */
public class PeopleServiceHandler implements InvocationHandler {
    private final Object target;

    public PeopleServiceHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("getPeopleType")){
            System.out.println("before people...");
            Object result = method.invoke(target,args);
            System.out.println("after people...");
            return result;
        }
        return method.invoke(target,args);
    }
}
