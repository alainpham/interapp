
package fr.techlab.sgov2.schemas.context;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.techlab.sgov2.schemas.context package. 
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

    private final static QName _Cf_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "cf");
    private final static QName _IdRh_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "idRh");
    private final static QName _FirstName_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "firstName");
    private final static QName _LastName_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "lastName");
    private final static QName _Position_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "position");
    private final static QName _Team_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "team");
    private final static QName _Guid_QNAME = new QName("http://www.techlab.fr/SGOV2/Schemas/Context", "guid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.techlab.sgov2.schemas.context
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Context }
     * 
     */
    public Context createContext() {
        return new Context();
    }

    /**
     * Create an instance of {@link Identity }
     * 
     */
    public Identity createIdentity() {
        return new Identity();
    }

    /**
     * Create an instance of {@link Teams }
     * 
     */
    public Teams createTeams() {
        return new Teams();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "cf")
    public JAXBElement<String> createCf(String value) {
        return new JAXBElement<String>(_Cf_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "idRh")
    public JAXBElement<String> createIdRh(String value) {
        return new JAXBElement<String>(_IdRh_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "firstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "lastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "position")
    public JAXBElement<String> createPosition(String value) {
        return new JAXBElement<String>(_Position_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "team")
    public JAXBElement<String> createTeam(String value) {
        return new JAXBElement<String>(_Team_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

}
