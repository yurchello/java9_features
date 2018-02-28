package com.yurchello.app;


import com.yurchello.moduleTest.ServiceModule;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.util.ServiceLoader;

public class App {
    public static void main(String[] args) throws ParserConfigurationException, TransformerException {
        final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        final Element element = document.createElement("gggg");

        for (ServiceModule serviceModule : ServiceLoader.load(ServiceModule.class)) {
            final Element el = document.createElement("gggg");
            el.setTextContent(serviceModule.doService("world"));
            element.appendChild(el);
        }

        document.appendChild(element);
        final Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(System.out));
    }
}
