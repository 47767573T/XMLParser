import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by 47767573t on 29/10/15.
 */
public class mainCalleSAX {

    public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, SAXException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        InputStream is = new FileInputStream("/home/47767573t/git/IdeaWorkSpace/M06/UF01/src/callesBcn.xml");


        SAXParser saxParser = factory.newSAXParser();
        SaxHandler handler = new SaxHandler();

        try{
            saxParser.parse(is, handler);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
