
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExactLocationFindIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SortDirectionText" type="{http://services.dnb.com/EntityListServiceV2.0}SortDirectionEnum" minOccurs="0"/>
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
 *         &lt;element name="SearchModeDescription" type="{http://services.dnb.com/EntityListServiceV2.0}SearchModeEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchSpecification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "exactLocationFindIndicator",
    "sortDirectionText",
    "candidateMaximumQuantity",
    "candidatePerPageMaximumQuantity",
    "candidateDisplayStartSequenceNumber",
    "searchModeDescription"
})
@XmlSeeAlso({
    SearchContactSpecification.class,
    SearchCompanySpecification.class
})
public class SearchSpecification {

    @XmlElement(name = "ExactLocationFindIndicator")
    protected Boolean exactLocationFindIndicator;
    @XmlElement(name = "SortDirectionText")
    @XmlSchemaType(name = "string")
    protected SortDirectionEnum sortDirectionText;
    @XmlElement(name = "CandidateMaximumQuantity")
    protected Integer candidateMaximumQuantity;
    @XmlElement(name = "CandidatePerPageMaximumQuantity")
    protected Integer candidatePerPageMaximumQuantity;
    @XmlElement(name = "CandidateDisplayStartSequenceNumber")
    protected Integer candidateDisplayStartSequenceNumber;
    @XmlElement(name = "SearchModeDescription")
    @XmlSchemaType(name = "string")
    protected SearchModeEnum searchModeDescription;

    /**
     * Gets the value of the exactLocationFindIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExactLocationFindIndicator() {
        return exactLocationFindIndicator;
    }

    /**
     * Sets the value of the exactLocationFindIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExactLocationFindIndicator(Boolean value) {
        this.exactLocationFindIndicator = value;
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
     * Gets the value of the searchModeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SearchModeEnum }
     *     
     */
    public SearchModeEnum getSearchModeDescription() {
        return searchModeDescription;
    }

    /**
     * Sets the value of the searchModeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchModeEnum }
     *     
     */
    public void setSearchModeDescription(SearchModeEnum value) {
        this.searchModeDescription = value;
    }

}
