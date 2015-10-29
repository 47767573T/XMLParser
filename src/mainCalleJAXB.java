import generated.ROWSETType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by 47767573t on 27/10/15.
 */
public class mainCalleJAXB {

    static String ruta = "/home/47767573t/git/IdeaWorkSpace/M06/UF01/src";



    public static void main (String[] args){

        File fichero = new File(ruta+"/callesBcn.xml");

        ROWSETType calle = new ROWSETType();
        calle.setNOMOFICIAL("VARSOVIA");
        calle.setSIGLA("C");


        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(ROWSETType.class);
            Unmarshaller unMarsh = jaxbContext.createUnmarshaller();
            ROWSETType rt = (ROWSETType)unMarsh.unmarshal(fichero);
            rt.getROW().add(calle);

            System.out.println(rt.getROW().size());
            guardar(rt);

        }catch(JAXBException e){
            e.printStackTrace();
        }
    }

    public static void guardar (ROWSETType rt){

        File ficheroNew = new File (ruta+"/callesBcnNueva.xml");

        try {
            JAXBContext jc = JAXBContext.newInstance(ROWSETType.class);
            Marshaller marsh = jc.createMarshaller();
            marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marsh.marshal(rt, ficheroNew);
            marsh.marshal(rt,System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    public void mostrar(){
        File fichero = new File (ruta+"/carrererBCN");


    }



}
