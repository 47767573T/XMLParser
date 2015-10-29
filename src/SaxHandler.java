import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by 47767573t on 29/10/15.
 */
public class SaxHandler extends DefaultHandler{

    int contCalles = 0;



    @Override
    public void startElement (String uri, String localName, String qName, Attributes attributes){
        System.out.println(contCalles);
        contCalles++;

    }

}
