
package fr.techlab.sgov2.schemas.savetask.savetaskresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd}taskId" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/SaveTask/SaveTaskResponse.xsd}taskVersion" minOccurs="0"/&gt;
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
    "taskId",
    "taskVersion"
})
@XmlRootElement(name = "workItem")
public class WorkItem {

    protected Integer taskId;
    protected Integer taskVersion;

    /**
     * Gets the value of the taskId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskId(Integer value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the taskVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTaskVersion() {
        return taskVersion;
    }

    /**
     * Sets the value of the taskVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTaskVersion(Integer value) {
        this.taskVersion = value;
    }

}
