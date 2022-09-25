package utilpattern.proxy;

/**
 * 接口类实现
 */
public class GoodPeopleServiceImpl implements PeopleService {
    @Override
    public String getPeopleType() {
        return "good People";
    }
}
