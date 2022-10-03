package utilpattern.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class GetFile {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        String path = GetFile.class.getResource("/").getPath();
        String xmlFile = path + "utilpattern/xml/myBatis.xml";
        File file = new File(xmlFile);
        getDOM(file);
    }

    public static void getDOM(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        Element root = doc.getDocumentElement();

        NodeList nodeList = root.getChildNodes();
        for(int i = 0 ; i < nodeList.getLength() ; i++){
            Node node = nodeList.item(i);
            String name = node.getNodeName();
            String value = node.getNodeValue();
            System.out.println(name + " = " + value);
        }
        System.out.println();
        System.out.println(root.getAttribute("configuration"));
    }
}
