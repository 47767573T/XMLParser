import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by 47767573t on 29/10/15.
 */
public class SaxHandler extends DefaultHandler{

    int contCalles = 0;
    Boolean esCalle = false;

    @Override
    public void startElement (String uri, String localName, String qName, Attributes attributes) throws SAXException{

        if (qName.equalsIgnoreCase("ROW")) {
            contCalles++;
            System.out.println(contCalles);

        }
        if("NOM_OFICIAL".equals(qName)) esCalle = true;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{

        if(esCalle) {
            System.out.println("El carrer s'anomena: " + new String(ch, 0, length));
            esCalle = false;
        }
    }


    /*@Override
    public void endElement (String uri, String localName, String qName){

    }*/


}
