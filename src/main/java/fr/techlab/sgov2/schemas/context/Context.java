
package fr.techlab.sgov2.schemas.context;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}idRh"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}identity"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}cf"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}position"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}teams"/&gt;
 *         &lt;element ref="{http://www.techlab.fr/SGOV2/Schemas/Context}guid"/&gt;
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
    "idRh",
    "identity",
    "cf",
    "position",
    "teams",
    "guid"
})
@XmlRootElement(name = "context")
public class Context {

    @XmlElement(required = true)
    protected String idRh;
    @XmlElement(required = true)
    protected Identity identity;
    @XmlElement(required = true)
    protected String cf;
    @XmlElement(required = true)
    protected String position;
    @XmlElement(required = true)
    protected Teams teams;
    @XmlElement(required = true)
    protected String guid;

    /**
     * Gets the value of the idRh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRh() {
        return idRh;
    }

    /**
     * Sets the value of the idRh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRh(String value) {
        this.idRh = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link Identity }
     *     
     */
    public Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identity }
     *     
     */
    public void setIdentity(Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the cf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCf() {
        return cf;
    }

    /**
     * Sets the value of the cf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCf(String value) {
        this.cf = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the teams property.
     * 
     * @return
     *     possible object is
     *     {@link Teams }
     *     
     */
    public Teams getTeams() {
        return teams;
    }

    /**
     * Sets the value of the teams property.
     * 
     * @param value
     *     allowed object is
     *     {@link Teams }
     *     
     */
    public void setTeams(Teams value) {
        this.teams = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

}
