package fr.techlab.businessv2services.ws.savetask;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630310
 * 2018-05-02T23:30:14.092+02:00
 * Generated source version: 3.1.5.redhat-630310
 * 
 */
@WebServiceClient(name = "intfsaveTask", 
                  wsdlLocation = "classpath:wsdl/saveTask.wsdl",
                  targetNamespace = "http://www.techlab.fr/businessv2services/WS/saveTask") 
public class IntfsaveTask extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.techlab.fr/businessv2services/WS/saveTask", "intfsaveTask");
    public final static QName SaveTaskEndpoint = new QName("http://www.techlab.fr/businessv2services/WS/saveTask", "saveTaskEndpoint");
    static {
        URL url = IntfsaveTask.class.getClassLoader().getResource("wsdl/saveTask.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(IntfsaveTask.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/saveTask.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public IntfsaveTask(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IntfsaveTask(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntfsaveTask() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public IntfsaveTask(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public IntfsaveTask(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public IntfsaveTask(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SaveTaskPortType
     */
    @WebEndpoint(name = "saveTaskEndpoint")
    public SaveTaskPortType getSaveTaskEndpoint() {
        return super.getPort(SaveTaskEndpoint, SaveTaskPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SaveTaskPortType
     */
    @WebEndpoint(name = "saveTaskEndpoint")
    public SaveTaskPortType getSaveTaskEndpoint(WebServiceFeature... features) {
        return super.getPort(SaveTaskEndpoint, SaveTaskPortType.class, features);
    }

}
