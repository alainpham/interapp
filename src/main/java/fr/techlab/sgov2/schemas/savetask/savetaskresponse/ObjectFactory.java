
package fr.techlab.sgov2.schemas.savetask.savetaskresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.techlab.sgov2.schemas.savetask.savetaskresponse package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TaskId_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd", "taskId");
    private final static QName _TaskVersion_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd", "taskVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.techlab.sgov2.schemas.savetask.savetaskresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveTaskResponse }
     * 
     */
    public SaveTaskResponse createSaveTaskResponse() {
        return new SaveTaskResponse();
    }

    /**
     * Create an instance of {@link WorkItem }
     * 
     */
    public WorkItem createWorkItem() {
        return new WorkItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd", name = "taskId")
    public JAXBElement<Integer> createTaskId(Integer value) {
        return new JAXBElement<Integer>(_TaskId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd", name = "taskVersion")
    public JAXBElement<Integer> createTaskVersion(Integer value) {
        return new JAXBElement<Integer>(_TaskVersion_QNAME, Integer.class, null, value);
    }

}
