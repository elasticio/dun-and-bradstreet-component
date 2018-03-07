
package com.dnb.services.customproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImportIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImportPercentage" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="5"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ImportCountryDetails" type="{http://services.dnb.com/CustomProductServiceV2.0}ImportCountryDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportDetailsType", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "importIndicator",
    "importPercentage",
    "importCountryDetails"
})
public class ImportDetailsType {

    @XmlElement(name = "ImportIndicator")
    protected Boolean importIndicator;
    @XmlElement(name = "ImportPercentage")
    protected BigDecimal importPercentage;
    @XmlElement(name = "ImportCountryDetails")
    protected List<ImportCountryDetails> importCountryDetails;

    /**
     * Gets the value of the importIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImportIndicator() {
        return importIndicator;
    }

    /**
     * Sets the value of the importIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportIndicator(Boolean value) {
        this.importIndicator = value;
    }

    /**
     * Gets the value of the importPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportPercentage() {
        return importPercentage;
    }

    /**
     * Sets the value of the importPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportPercentage(BigDecimal value) {
        this.importPercentage = value;
    }

    /**
     * Gets the value of the importCountryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the importCountryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImportCountryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImportCountryDetails }
     * 
     * 
     */
    public List<ImportCountryDetails> getImportCountryDetails() {
        if (importCountryDetails == null) {
            importCountryDetails = new ArrayList<ImportCountryDetails>();
        }
        return this.importCountryDetails;
    }

}
