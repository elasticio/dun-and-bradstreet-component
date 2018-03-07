
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremisesArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremisesArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PremisesAreaMeasurement" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="PremisesAreaMeasurementUnitText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremisesArea", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "premisesAreaMeasurement",
    "premisesAreaMeasurementUnitText"
})
public class PremisesArea {

    @XmlElement(name = "PremisesAreaMeasurement", required = true)
    protected BigDecimal premisesAreaMeasurement;
    @XmlElement(name = "PremisesAreaMeasurementUnitText", required = true)
    protected DNBDecodedStringType premisesAreaMeasurementUnitText;

    /**
     * Gets the value of the premisesAreaMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPremisesAreaMeasurement() {
        return premisesAreaMeasurement;
    }

    /**
     * Sets the value of the premisesAreaMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPremisesAreaMeasurement(BigDecimal value) {
        this.premisesAreaMeasurement = value;
    }

    /**
     * Gets the value of the premisesAreaMeasurementUnitText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getPremisesAreaMeasurementUnitText() {
        return premisesAreaMeasurementUnitText;
    }

    /**
     * Sets the value of the premisesAreaMeasurementUnitText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setPremisesAreaMeasurementUnitText(DNBDecodedStringType value) {
        this.premisesAreaMeasurementUnitText = value;
    }

}
