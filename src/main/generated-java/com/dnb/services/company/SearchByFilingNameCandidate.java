
package com.dnb.services.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByFilingNameCandidate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchByFilingNameCandidate">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}PublicFiling">
 *       &lt;sequence>
 *         &lt;element name="PublicFilingSummary" type="{http://services.dnb.com/CompanyServiceV2.0}PublicFilingSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisplaySequence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByFilingNameCandidate", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "publicFilingSummary",
    "displaySequence"
})
public class SearchByFilingNameCandidate
    extends PublicFiling
{

    @XmlElement(name = "PublicFilingSummary")
    protected List<PublicFilingSummary> publicFilingSummary;
    @XmlElement(name = "DisplaySequence")
    protected Integer displaySequence;

    /**
     * Gets the value of the publicFilingSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicFilingSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicFilingSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicFilingSummary }
     * 
     * 
     */
    public List<PublicFilingSummary> getPublicFilingSummary() {
        if (publicFilingSummary == null) {
            publicFilingSummary = new ArrayList<PublicFilingSummary>();
        }
        return this.publicFilingSummary;
    }

    /**
     * Gets the value of the displaySequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaySequence() {
        return displaySequence;
    }

    /**
     * Sets the value of the displaySequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaySequence(Integer value) {
        this.displaySequence = value;
    }

}
