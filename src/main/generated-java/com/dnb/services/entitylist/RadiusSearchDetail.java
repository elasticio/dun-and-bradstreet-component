
package com.dnb.services.entitylist;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RadiusSearchDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadiusSearchDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PostalCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CountryISOAlpha2Code" type="{http://services.dnb.com/EntityListServiceV2.0}CountryISOAlpha2Type" minOccurs="0"/>
 *         &lt;element name="RadiusMeasurement">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RadiusMeasurementUnitCode" type="{http://services.dnb.com/EntityListServiceV2.0}DNBCodeValueType"/>
 *         &lt;element name="LatitudeMeasurement" type="{http://services.dnb.com/EntityListServiceV2.0}LatitudeMeasurementType" minOccurs="0"/>
 *         &lt;element name="LongitudeMeasurement" type="{http://services.dnb.com/EntityListServiceV2.0}LongitudeMeasurementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RadiusSearchDetail", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "postalCode",
    "countryISOAlpha2Code",
    "radiusMeasurement",
    "radiusMeasurementUnitCode",
    "latitudeMeasurement",
    "longitudeMeasurement"
})
public class RadiusSearchDetail {

    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryISOAlpha2Code")
    protected String countryISOAlpha2Code;
    @XmlElement(name = "RadiusMeasurement", required = true)
    protected BigDecimal radiusMeasurement;
    @XmlElement(name = "RadiusMeasurementUnitCode", required = true)
    protected BigInteger radiusMeasurementUnitCode;
    @XmlElement(name = "LatitudeMeasurement")
    protected BigDecimal latitudeMeasurement;
    @XmlElement(name = "LongitudeMeasurement")
    protected BigDecimal longitudeMeasurement;

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryISOAlpha2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryISOAlpha2Code() {
        return countryISOAlpha2Code;
    }

    /**
     * Sets the value of the countryISOAlpha2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryISOAlpha2Code(String value) {
        this.countryISOAlpha2Code = value;
    }

    /**
     * Gets the value of the radiusMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRadiusMeasurement() {
        return radiusMeasurement;
    }

    /**
     * Sets the value of the radiusMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRadiusMeasurement(BigDecimal value) {
        this.radiusMeasurement = value;
    }

    /**
     * Gets the value of the radiusMeasurementUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRadiusMeasurementUnitCode() {
        return radiusMeasurementUnitCode;
    }

    /**
     * Sets the value of the radiusMeasurementUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRadiusMeasurementUnitCode(BigInteger value) {
        this.radiusMeasurementUnitCode = value;
    }

    /**
     * Gets the value of the latitudeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitudeMeasurement() {
        return latitudeMeasurement;
    }

    /**
     * Sets the value of the latitudeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitudeMeasurement(BigDecimal value) {
        this.latitudeMeasurement = value;
    }

    /**
     * Gets the value of the longitudeMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitudeMeasurement() {
        return longitudeMeasurement;
    }

    /**
     * Sets the value of the longitudeMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitudeMeasurement(BigDecimal value) {
        this.longitudeMeasurement = value;
    }

}
