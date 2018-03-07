
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SanctionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanctionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountrySanctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CountrySanctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompanySanctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}CompanySanctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalSanctionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalSanctionDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanctionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "countrySanctionDetail",
    "companySanctionDetail",
    "principalSanctionDetail"
})
public class SanctionDetail {

    @XmlElement(name = "CountrySanctionDetail")
    protected List<CountrySanctionDetail> countrySanctionDetail;
    @XmlElement(name = "CompanySanctionDetail")
    protected List<CompanySanctionDetail> companySanctionDetail;
    @XmlElement(name = "PrincipalSanctionDetail")
    protected List<PrincipalSanctionDetail> principalSanctionDetail;

    /**
     * Gets the value of the countrySanctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countrySanctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountrySanctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountrySanctionDetail }
     * 
     * 
     */
    public List<CountrySanctionDetail> getCountrySanctionDetail() {
        if (countrySanctionDetail == null) {
            countrySanctionDetail = new ArrayList<CountrySanctionDetail>();
        }
        return this.countrySanctionDetail;
    }

    /**
     * Gets the value of the companySanctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companySanctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanySanctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanySanctionDetail }
     * 
     * 
     */
    public List<CompanySanctionDetail> getCompanySanctionDetail() {
        if (companySanctionDetail == null) {
            companySanctionDetail = new ArrayList<CompanySanctionDetail>();
        }
        return this.companySanctionDetail;
    }

    /**
     * Gets the value of the principalSanctionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the principalSanctionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrincipalSanctionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrincipalSanctionDetail }
     * 
     * 
     */
    public List<PrincipalSanctionDetail> getPrincipalSanctionDetail() {
        if (principalSanctionDetail == null) {
            principalSanctionDetail = new ArrayList<PrincipalSanctionDetail>();
        }
        return this.principalSanctionDetail;
    }

}
