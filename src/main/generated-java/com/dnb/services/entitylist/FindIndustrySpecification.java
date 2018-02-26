
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the parameters for refining the search result.
 *          
 * 
 * <p>Java class for FindIndustrySpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindIndustrySpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CandidateMaximumQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CandidatePerPageMaximumQuantity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="10000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CandidateDisplayStartSequenceNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="10000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SortDirectionText" type="{http://services.dnb.com/EntityListServiceV2.0}SortDirectionEnum" minOccurs="0"/>
 *         &lt;element name="SortBasisText" type="{http://services.dnb.com/EntityListServiceV2.0}FindIndustrySortBasis" minOccurs="0"/>
 *         &lt;element name="ReturnOnlyPremiumIndustryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindIndustrySpecification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "candidateMaximumQuantity",
    "candidatePerPageMaximumQuantity",
    "candidateDisplayStartSequenceNumber",
    "sortDirectionText",
    "sortBasisText",
    "returnOnlyPremiumIndustryIndicator"
})
public class FindIndustrySpecification {

    @XmlElement(name = "CandidateMaximumQuantity")
    protected Integer candidateMaximumQuantity;
    @XmlElement(name = "CandidatePerPageMaximumQuantity")
    protected Integer candidatePerPageMaximumQuantity;
    @XmlElement(name = "CandidateDisplayStartSequenceNumber")
    protected Integer candidateDisplayStartSequenceNumber;
    @XmlElement(name = "SortDirectionText")
    @XmlSchemaType(name = "string")
    protected SortDirectionEnum sortDirectionText;
    @XmlElement(name = "SortBasisText")
    @XmlSchemaType(name = "string")
    protected FindIndustrySortBasis sortBasisText;
    @XmlElement(name = "ReturnOnlyPremiumIndustryIndicator")
    protected Boolean returnOnlyPremiumIndustryIndicator;

    /**
     * Gets the value of the candidateMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidateMaximumQuantity() {
        return candidateMaximumQuantity;
    }

    /**
     * Sets the value of the candidateMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateMaximumQuantity(Integer value) {
        this.candidateMaximumQuantity = value;
    }

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
     * Gets the value of the candidateDisplayStartSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCandidateDisplayStartSequenceNumber() {
        return candidateDisplayStartSequenceNumber;
    }

    /**
     * Sets the value of the candidateDisplayStartSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateDisplayStartSequenceNumber(Integer value) {
        this.candidateDisplayStartSequenceNumber = value;
    }

    /**
     * Gets the value of the sortDirectionText property.
     * 
     * @return
     *     possible object is
     *     {@link SortDirectionEnum }
     *     
     */
    public SortDirectionEnum getSortDirectionText() {
        return sortDirectionText;
    }

    /**
     * Sets the value of the sortDirectionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirectionEnum }
     *     
     */
    public void setSortDirectionText(SortDirectionEnum value) {
        this.sortDirectionText = value;
    }

    /**
     * Gets the value of the sortBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link FindIndustrySortBasis }
     *     
     */
    public FindIndustrySortBasis getSortBasisText() {
        return sortBasisText;
    }

    /**
     * Sets the value of the sortBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link FindIndustrySortBasis }
     *     
     */
    public void setSortBasisText(FindIndustrySortBasis value) {
        this.sortBasisText = value;
    }

    /**
     * Gets the value of the returnOnlyPremiumIndustryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnlyPremiumIndustryIndicator() {
        return returnOnlyPremiumIndustryIndicator;
    }

    /**
     * Sets the value of the returnOnlyPremiumIndustryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyPremiumIndustryIndicator(Boolean value) {
        this.returnOnlyPremiumIndustryIndicator = value;
    }

}
