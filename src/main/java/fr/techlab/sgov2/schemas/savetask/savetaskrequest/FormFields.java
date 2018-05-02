
package fr.techlab.sgov2.schemas.savetask.savetaskrequest;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.techlab.schemas.businessv2_services.sharedresources.partners.schema.FormField;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.techlab.com/schemas/BUSINESSV2-Services/SharedResources/Partners/Schema.xsd}formField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "formField"
})
@XmlRootElement(name = "formFields")
public class FormFields {

    @XmlElement(namespace = "http://www.techlab.com/schemas/BUSINESSV2-Services/SharedResources/Partners/Schema.xsd")
    protected List<FormField> formField;

    /**
     * Gets the value of the formField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormField }
     * 
     * 
     */
    public List<FormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<FormField>();
        }
        return this.formField;
    }

}
