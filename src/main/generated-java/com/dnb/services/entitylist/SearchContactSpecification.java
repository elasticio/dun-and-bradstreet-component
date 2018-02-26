
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchContactSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchContactSpecification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/EntityListServiceV2.0}SearchSpecification">
 *       &lt;sequence>
 *         &lt;element name="InclusionCriteria" type="{http://services.dnb.com/EntityListServiceV2.0}ContactInclusionCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SortBasisText" type="{http://services.dnb.com/EntityListServiceV2.0}SortBasisTextContactEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchContactSpecification", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "inclusionCriteria",
    "sortBasisText"
})
public class SearchContactSpecification
    extends SearchSpecification
{

    @XmlElement(name = "InclusionCriteria")
    protected List<ContactInclusionCriteria> inclusionCriteria;
    @XmlElement(name = "SortBasisText")
    @XmlSchemaType(name = "string")
    protected SortBasisTextContactEnum sortBasisText;

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
     * {@link ContactInclusionCriteria }
     * 
     * 
     */
    public List<ContactInclusionCriteria> getInclusionCriteria() {
        if (inclusionCriteria == null) {
            inclusionCriteria = new ArrayList<ContactInclusionCriteria>();
        }
        return this.inclusionCriteria;
    }

    /**
     * Gets the value of the sortBasisText property.
     * 
     * @return
     *     possible object is
     *     {@link SortBasisTextContactEnum }
     *     
     */
    public SortBasisTextContactEnum getSortBasisText() {
        return sortBasisText;
    }

    /**
     * Sets the value of the sortBasisText property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortBasisTextContactEnum }
     *     
     */
    public void setSortBasisText(SortBasisTextContactEnum value) {
        this.sortBasisText = value;
    }

}
