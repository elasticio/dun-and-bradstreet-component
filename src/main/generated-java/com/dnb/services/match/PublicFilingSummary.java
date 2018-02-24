
package com.dnb.services.match;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PublicFilingSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PublicFilingSummary">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.dnb.com/CompanyServiceV2.0}BasePublicFilingSummary">
 *       &lt;sequence>
 *         &lt;element name="TotalClosedFilingsCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalOpenFilingsCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="RolePlayerSummarizedPublicFiling" type="{http://services.dnb.com/CompanyServiceV2.0}RolePlayerSummarizedPublicFiling" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PublicFilingSummary", namespace = "http://services.dnb.com/CompanyServiceV2.0", propOrder = {
    "totalClosedFilingsCount",
    "totalOpenFilingsCount",
    "rolePlayerSummarizedPublicFiling"
})
public class PublicFilingSummary
    extends BasePublicFilingSummary
{

    @XmlElement(name = "TotalClosedFilingsCount")
    protected Integer totalClosedFilingsCount;
    @XmlElement(name = "TotalOpenFilingsCount")
    protected Integer totalOpenFilingsCount;
    @XmlElement(name = "RolePlayerSummarizedPublicFiling")
    protected List<RolePlayerSummarizedPublicFiling> rolePlayerSummarizedPublicFiling;

    /**
     * Gets the value of the totalClosedFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalClosedFilingsCount() {
        return totalClosedFilingsCount;
    }

    /**
     * Sets the value of the totalClosedFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalClosedFilingsCount(Integer value) {
        this.totalClosedFilingsCount = value;
    }

    /**
     * Gets the value of the totalOpenFilingsCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalOpenFilingsCount() {
        return totalOpenFilingsCount;
    }

    /**
     * Sets the value of the totalOpenFilingsCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalOpenFilingsCount(Integer value) {
        this.totalOpenFilingsCount = value;
    }

    /**
     * Gets the value of the rolePlayerSummarizedPublicFiling property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayerSummarizedPublicFiling property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayerSummarizedPublicFiling().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RolePlayerSummarizedPublicFiling }
     * 
     * 
     */
    public List<RolePlayerSummarizedPublicFiling> getRolePlayerSummarizedPublicFiling() {
        if (rolePlayerSummarizedPublicFiling == null) {
            rolePlayerSummarizedPublicFiling = new ArrayList<RolePlayerSummarizedPublicFiling>();
        }
        return this.rolePlayerSummarizedPublicFiling;
    }

}
