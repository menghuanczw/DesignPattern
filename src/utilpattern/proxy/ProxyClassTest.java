package utilpattern.proxy;

import java.lang.reflect.Proxy;

public class ProxyClassTest {
    public static void main(String[] args) {
        //实际对象
        GoodPeopleServiceImpl goodPeople = new GoodPeopleServiceImpl();
        //代理对象
        PeopleService people = (PeopleService) Proxy.newProxyInstance(
                goodPeople.getClass().getClassLoader(),
                goodPeople.getClass().getInterfaces(),
                new PeopleServiceHandler(goodPeople));
        //方法执行
        String name = people.getPeopleType();
        System.out.println("代理结果是：" + name);
    }
}
