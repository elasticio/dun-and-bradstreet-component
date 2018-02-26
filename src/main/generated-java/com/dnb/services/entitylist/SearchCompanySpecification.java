
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchCompanySpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchCompanySpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}SearchSpecification">
 *       &lt;sequence>
 *         &lt;element name="InclusionCriteria" type="{http://services.dnb.com/EntityListServiceV2.0}InclusionCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="KeywordScopeText" type="{http://services.dnb.com/EntityListServiceV2.0}InclusionParameterenum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SortBasisText" type="{http://services.dnb.com/EntityListServiceV2.0}SortBasisTextEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchCompanySpecification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inclusionCriteria",
    "keywordScopeText",
    "sortBasisText"
})
public class SearchCompanySpecification
    extends SearchSpecification
{

    @XmlElement(name = "InclusionCriteria")
    protected List<InclusionCriteria> inclusionCriteria;
    @XmlElement(name = "KeywordScopeText")
    @XmlSchemaType(name = "string")
    protected List<InclusionParameterenum> keywordScopeText;
    @XmlElement(name = "SortBasisText")
    @XmlSchemaType(name = "string")
    protected SortBasisTextEnum sortBasisText;

    /**
     * Gets the value of the inclusionCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inclusionCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclusionCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InclusionCriteria }
     * 
     * 
     */
    public List<InclusionCriteria> getInclusionCriteria() {
        if (inclusionCriteria == null) {
            inclusionCriteria = new ArrayList<InclusionCriteria>();
        }
        return this.inclusionCriteria;
    }

    /**
     * Gets the value of the keywordScopeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordScopeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordScopeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InclusionParameterenum }
     * 
     * 
     */
    public List<InclusionParameterenum> getKeywordScopeText() {
        if (keywordScopeText == null) {
            keywordScopeText = new ArrayList<InclusionParameterenum>();
        }
        return this.keywordScopeText;
    }

    /**
     * Gets the value of the sortBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link SortBasisTextEnum }
     *     
     */
    public SortBasisTextEnum getSortBasisText() {
        return sortBasisText;
    }

    /**
     * Sets the value of the sortBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortBasisTextEnum }
     *     
     */
    public void setSortBasisText(SortBasisTextEnum value) {
        this.sortBasisText = value;
    }

}
