
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrincipalSanctionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalSanctionDetail">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CustomProductServiceV2.0}CompanySanctionDetail">
 *       &lt;sequence>
 *         &lt;element name="PrincipalName" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Position" type="{http://services.dnb.com/CustomProductServiceV2.0}Position" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GenderText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipalIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalSanctionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "principalName",
    "position",
    "genderText",
    "mostSeniorPrincipalIndicator",
    "displaySequence"
})
public class PrincipalSanctionDetail
    extends CompanySanctionDetail
{

    @XmlElement(name = "PrincipalName")
    protected List<SubjectName> principalName;
    @XmlElement(name = "Position")
    protected List<Position> position;
    @XmlElement(name = "GenderText")
    protected DNBDecodedStringType genderText;
    @XmlElement(name = "MostSeniorPrincipalIndicator")
    protected Boolean mostSeniorPrincipalIndicator;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the principalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectName }
     * 
     * 
     */
    public List<SubjectName> getPrincipalName() {
        if (principalName == null) {
            principalName = new ArrayList<SubjectName>();
        }
        return this.principalName;
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
     * {@link Position }
     * 
     * 
     */
    public List<Position> getPosition() {
        if (position == null) {
            position = new ArrayList<Position>();
        }
        return this.position;
    }

    /**
     * Gets the value of the genderText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getGenderText() {
        return genderText;
    }

    /**
     * Sets the value of the genderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setGenderText(DNBDecodedStringType value) {
        this.genderText = value;
    }

    /**
     * Gets the value of the mostSeniorPrincipalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMostSeniorPrincipalIndicator() {
        return mostSeniorPrincipalIndicator;
    }

    /**
     * Sets the value of the mostSeniorPrincipalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMostSeniorPrincipalIndicator(Boolean value) {
        this.mostSeniorPrincipalIndicator = value;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
