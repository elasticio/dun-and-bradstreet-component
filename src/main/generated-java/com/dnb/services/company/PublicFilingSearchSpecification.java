
package com.dnb.services.company;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicFilingSearchSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicFilingSearchSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidatePerPageMaximumQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ExcludeClosedFilingsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SearchDirectionCode" type="{http://services.dnb.com/CompanyServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicFilingSearchSpecification", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "candidatePerPageMaximumQuantity",
    "excludeClosedFilingsIndicator",
    "searchDirectionCode"
})
public class PublicFilingSearchSpecification {

    @XmlElement(name = "CandidatePerPageMaximumQuantity")
    protected Integer candidatePerPageMaximumQuantity;
    @XmlElement(name = "ExcludeClosedFilingsIndicator")
    protected Boolean excludeClosedFilingsIndicator;
    @XmlElement(name = "SearchDirectionCode")
    protected BigInteger searchDirectionCode;

    /**
     * Gets the value of the candidatePerPageMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidatePerPageMaximumQuantity() {
        return candidatePerPageMaximumQuantity;
    }

    /**
     * Sets the value of the candidatePerPageMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidatePerPageMaximumQuantity(Integer value) {
        this.candidatePerPageMaximumQuantity = value;
    }

    /**
     * Gets the value of the excludeClosedFilingsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeClosedFilingsIndicator() {
        return excludeClosedFilingsIndicator;
    }

    /**
     * Sets the value of the excludeClosedFilingsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeClosedFilingsIndicator(Boolean value) {
        this.excludeClosedFilingsIndicator = value;
    }

    /**
     * Gets the value of the searchDirectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSearchDirectionCode() {
        return searchDirectionCode;
    }

    /**
     * Sets the value of the searchDirectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSearchDirectionCode(BigInteger value) {
        this.searchDirectionCode = value;
    }

}
