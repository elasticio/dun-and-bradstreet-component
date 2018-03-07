
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExportPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExportCountryDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ExportCountryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "exportIndicator",
    "exportPercentage",
    "exportCountryDetails"
})
public class ExportDetailsType {

    @XmlElement(name = "ExportIndicator")
    protected Boolean exportIndicator;
    @XmlElement(name = "ExportPercentage")
    protected BigDecimal exportPercentage;
    @XmlElement(name = "ExportCountryDetails")
    protected List<ExportCountryDetails> exportCountryDetails;

    /**
     * Gets the value of the exportIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExportIndicator() {
        return exportIndicator;
    }

    /**
     * Sets the value of the exportIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExportIndicator(Boolean value) {
        this.exportIndicator = value;
    }

    /**
     * Gets the value of the exportPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExportPercentage() {
        return exportPercentage;
    }

    /**
     * Sets the value of the exportPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExportPercentage(BigDecimal value) {
        this.exportPercentage = value;
    }

    /**
     * Gets the value of the exportCountryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportCountryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportCountryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportCountryDetails }
     * 
     * 
     */
    public List<ExportCountryDetails> getExportCountryDetails() {
        if (exportCountryDetails == null) {
            exportCountryDetails = new ArrayList<ExportCountryDetails>();
        }
        return this.exportCountryDetails;
    }

}
