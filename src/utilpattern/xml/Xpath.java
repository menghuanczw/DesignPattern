package utilpattern.xml;

import javax.xml.xpath.XPathFactory;
import java.io.File;

public class Xpath {
    public static void main(String[] args) {
       String path = Xpath.class.getResource("/").getPath();
       File file = new File(path + "utilpattern/xml/myBatis.xml");
       XPathFactory xPathFactory = XPathFactory.newInstance();

    }
}
