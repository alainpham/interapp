
package fr.techlab.sgov2.schemas.savetask.savetaskrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.techlab.sgov2.schemas.savetask.savetaskrequest package. 
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

    private final static QName _FolderNumber_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", "folderNumber");
    private final static QName _TaskId_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", "taskId");
    private final static QName _TaskName_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", "taskName");
    private final static QName _TaskVersion_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", "taskVersion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.techlab.sgov2.schemas.savetask.savetaskrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormFields }
     * 
     */
    public FormFields createFormFields() {
        return new FormFields();
    }

    /**
     * Create an instance of {@link SaveTaskRequest }
     * 
     */
    public SaveTaskRequest createSaveTaskRequest() {
        return new SaveTaskRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", name = "folderNumber")
    public JAXBElement<String> createFolderNumber(String value) {
        return new JAXBElement<String>(_FolderNumber_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", name = "taskId")
    public JAXBElement<String> createTaskId(String value) {
        return new JAXBElement<String>(_TaskId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", name = "taskName")
    public JAXBElement<String> createTaskName(String value) {
        return new JAXBElement<String>(_TaskName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd", name = "taskVersion")
    public JAXBElement<String> createTaskVersion(String value) {
        return new JAXBElement<String>(_TaskVersion_QNAME, String.class, null, value);
    }

}
