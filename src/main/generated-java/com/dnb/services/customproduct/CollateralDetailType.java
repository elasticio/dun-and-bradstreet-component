
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollateralDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollateralClassText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CollateralTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CollateralTypeDescription" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType256" minOccurs="0"/>
 *         &lt;element name="CollateralScopeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="CollateralSupplementalItemTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralDetailType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "collateralClassText",
    "collateralTypeText",
    "collateralTypeDescription",
    "collateralScopeText",
    "collateralSupplementalItemTypeText"
})
public class CollateralDetailType {

    @XmlElement(name = "CollateralClassText")
    protected DNBDecodedStringType collateralClassText;
    @XmlElement(name = "CollateralTypeText")
    protected DNBDecodedStringType collateralTypeText;
    @XmlElement(name = "CollateralTypeDescription")
    protected DNBStringType256 collateralTypeDescription;
    @XmlElement(name = "CollateralScopeText")
    protected DNBDecodedStringType collateralScopeText;
    @XmlElement(name = "CollateralSupplementalItemTypeText")
    protected List<DNBDecodedStringType> collateralSupplementalItemTypeText;

    /**
     * Gets the value of the collateralClassText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCollateralClassText() {
        return collateralClassText;
    }

    /**
     * Sets the value of the collateralClassText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCollateralClassText(DNBDecodedStringType value) {
        this.collateralClassText = value;
    }

    /**
     * Gets the value of the collateralTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCollateralTypeText() {
        return collateralTypeText;
    }

    /**
     * Sets the value of the collateralTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCollateralTypeText(DNBDecodedStringType value) {
        this.collateralTypeText = value;
    }

    /**
     * Gets the value of the collateralTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType256 }
     *     
     */
    public DNBStringType256 getCollateralTypeDescription() {
        return collateralTypeDescription;
    }

    /**
     * Sets the value of the collateralTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType256 }
     *     
     */
    public void setCollateralTypeDescription(DNBStringType256 value) {
        this.collateralTypeDescription = value;
    }

    /**
     * Gets the value of the collateralScopeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getCollateralScopeText() {
        return collateralScopeText;
    }

    /**
     * Sets the value of the collateralScopeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setCollateralScopeText(DNBDecodedStringType value) {
        this.collateralScopeText = value;
    }

    /**
     * Gets the value of the collateralSupplementalItemTypeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collateralSupplementalItemTypeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollateralSupplementalItemTypeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getCollateralSupplementalItemTypeText() {
        if (collateralSupplementalItemTypeText == null) {
            collateralSupplementalItemTypeText = new ArrayList<DNBDecodedStringType>();
        }
        return this.collateralSupplementalItemTypeText;
    }

}
