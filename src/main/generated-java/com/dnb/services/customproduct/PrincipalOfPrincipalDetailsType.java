
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalOfPrincipalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalOfPrincipalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/CustomProductServiceV2.0}PositionForPrincipalOfPrincipal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ResponsibleArea" type="{http://services.dnb.com/CustomProductServiceV2.0}ResponsibleAreaForPrincipalOfPrincipal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalOfPrincipalDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "principalName",
    "position",
    "responsibleArea",
    "legalRepresentativeIndicator"
})
public class PrincipalOfPrincipalDetailsType {

    @XmlElement(name = "PrincipalName")
    protected SubjectName principalName;
    @XmlElement(name = "Position")
    protected List<PositionForPrincipalOfPrincipal> position;
    @XmlElement(name = "ResponsibleArea")
    protected List<ResponsibleAreaForPrincipalOfPrincipal> responsibleArea;
    @XmlElement(name = "LegalRepresentativeIndicator")
    protected Boolean legalRepresentativeIndicator;

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectName }
     *     
     */
    public SubjectName getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectName }
     *     
     */
    public void setPrincipalName(SubjectName value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the position property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPosition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PositionForPrincipalOfPrincipal }
     * 
     * 
     */
    public List<PositionForPrincipalOfPrincipal> getPosition() {
        if (position == null) {
            position = new ArrayList<PositionForPrincipalOfPrincipal>();
        }
        return this.position;
    }

    /**
     * Gets the value of the responsibleArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responsibleArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponsibleArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponsibleAreaForPrincipalOfPrincipal }
     * 
     * 
     */
    public List<ResponsibleAreaForPrincipalOfPrincipal> getResponsibleArea() {
        if (responsibleArea == null) {
            responsibleArea = new ArrayList<ResponsibleAreaForPrincipalOfPrincipal>();
        }
        return this.responsibleArea;
    }

    /**
     * Gets the value of the legalRepresentativeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalRepresentativeIndicator() {
        return legalRepresentativeIndicator;
    }

    /**
     * Sets the value of the legalRepresentativeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalRepresentativeIndicator(Boolean value) {
        this.legalRepresentativeIndicator = value;
    }

}
