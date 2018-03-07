
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesAreaDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesAreaDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OccupancyText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PremisesTypeText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeographicUnitID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="GeographicUnitTypeCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesAreaDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "occupancyText",
    "premisesTypeText",
    "geographicUnitID",
    "geographicUnitTypeCode"
})
public class PremisesAreaDetail {

    @XmlElement(name = "OccupancyText")
    protected List<DNBDecodedStringType> occupancyText;
    @XmlElement(name = "PremisesTypeText")
    protected List<DNBDecodedStringType> premisesTypeText;
    @XmlElement(name = "GeographicUnitID")
    protected String geographicUnitID;
    @XmlElement(name = "GeographicUnitTypeCode")
    protected BigInteger geographicUnitTypeCode;

    /**
     * Gets the value of the occupancyText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancyText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancyText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getOccupancyText() {
        if (occupancyText == null) {
            occupancyText = new ArrayList<DNBDecodedStringType>();
        }
        return this.occupancyText;
    }

    /**
     * Gets the value of the premisesTypeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the premisesTypeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPremisesTypeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DNBDecodedStringType }
     * 
     * 
     */
    public List<DNBDecodedStringType> getPremisesTypeText() {
        if (premisesTypeText == null) {
            premisesTypeText = new ArrayList<DNBDecodedStringType>();
        }
        return this.premisesTypeText;
    }

    /**
     * Gets the value of the geographicUnitID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeographicUnitID() {
        return geographicUnitID;
    }

    /**
     * Sets the value of the geographicUnitID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicUnitID(String value) {
        this.geographicUnitID = value;
    }

    /**
     * Gets the value of the geographicUnitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGeographicUnitTypeCode() {
        return geographicUnitTypeCode;
    }

    /**
     * Sets the value of the geographicUnitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGeographicUnitTypeCode(BigInteger value) {
        this.geographicUnitTypeCode = value;
    }

}
