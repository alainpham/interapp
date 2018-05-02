
package fr.techlab.sgov2.schemas.savetask.savetaskrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import fr.techlab.sgov2.schemas.context.Context;


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
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}context"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd}taskId"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd}taskName"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd}taskVersion"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd}formFields"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskRequest.xsd}folderNumber"/&gt;
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
    "context",
    "taskId",
    "taskName",
    "taskVersion",
    "formFields",
    "folderNumber"
})
@XmlRootElement(name = "saveTaskRequest")
public class SaveTaskRequest {

    @XmlElement(namespace = "http://www.techlab.fr/SGOV2/Schemas/Context", required = true)
    protected Context context;
    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String taskName;
    @XmlElement(required = true)
    protected String taskVersion;
    @XmlElement(required = true)
    protected FormFields formFields;
    @XmlElement(required = true)
    protected String folderNumber;

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link Context }
     *     
     */
    public Context getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link Context }
     *     
     */
    public void setContext(Context value) {
        this.context = value;
    }

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Sets the value of the taskName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskName(String value) {
        this.taskName = value;
    }

    /**
     * Gets the value of the taskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskVersion() {
        return taskVersion;
    }

    /**
     * Sets the value of the taskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskVersion(String value) {
        this.taskVersion = value;
    }

    /**
     * Gets the value of the formFields property.
     * 
     * @return
     *     possible object is
     *     {@link FormFields }
     *     
     */
    public FormFields getFormFields() {
        return formFields;
    }

    /**
     * Sets the value of the formFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormFields }
     *     
     */
    public void setFormFields(FormFields value) {
        this.formFields = value;
    }

    /**
     * Gets the value of the folderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFolderNumber() {
        return folderNumber;
    }

    /**
     * Sets the value of the folderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFolderNumber(String value) {
        this.folderNumber = value;
    }

}
