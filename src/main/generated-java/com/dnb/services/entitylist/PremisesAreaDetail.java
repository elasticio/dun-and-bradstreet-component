
package com.dnb.services.entitylist;

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
 *         &lt;element name="PremisesAreaLowRangeMeasurement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PremisesAreaHighRangeMeasurement" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OccupancyCode" maxOccurs="3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesAreaDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "premisesAreaLowRangeMeasurement",
    "premisesAreaHighRangeMeasurement",
    "occupancyCode"
})
public class PremisesAreaDetail {

    @XmlElement(name = "PremisesAreaLowRangeMeasurement")
    protected Integer premisesAreaLowRangeMeasurement;
    @XmlElement(name = "PremisesAreaHighRangeMeasurement")
    protected Integer premisesAreaHighRangeMeasurement;
    @XmlElement(name = "OccupancyCode")
    protected List<BigInteger> occupancyCode;

    /**
     * Gets the value of the premisesAreaLowRangeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremisesAreaLowRangeMeasurement() {
        return premisesAreaLowRangeMeasurement;
    }

    /**
     * Sets the value of the premisesAreaLowRangeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremisesAreaLowRangeMeasurement(Integer value) {
        this.premisesAreaLowRangeMeasurement = value;
    }

    /**
     * Gets the value of the premisesAreaHighRangeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPremisesAreaHighRangeMeasurement() {
        return premisesAreaHighRangeMeasurement;
    }

    /**
     * Sets the value of the premisesAreaHighRangeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPremisesAreaHighRangeMeasurement(Integer value) {
        this.premisesAreaHighRangeMeasurement = value;
    }

    /**
     * Gets the value of the occupancyCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupancyCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupancyCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getOccupancyCode() {
        if (occupancyCode == null) {
            occupancyCode = new ArrayList<BigInteger>();
        }
        return this.occupancyCode;
    }

}
