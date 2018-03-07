
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the customer created caregories under which the customer's suppliers are classified. For example, the division for Walmart is Retailmarket.
 *          
 * 
 * <p>Java class for DivisionDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DivisionDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DivisionID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="90"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DivisionName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="90"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SubDivisionDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}SubDivisionDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DivisionDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "divisionID",
    "divisionName",
    "subDivisionDetail"
})
public class DivisionDetail {

    @XmlElement(name = "DivisionID")
    protected String divisionID;
    @XmlElement(name = "DivisionName")
    protected String divisionName;
    @XmlElement(name = "SubDivisionDetail")
    protected List<SubDivisionDetailType> subDivisionDetail;

    /**
     * Gets the value of the divisionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionID() {
        return divisionID;
    }

    /**
     * Sets the value of the divisionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionID(String value) {
        this.divisionID = value;
    }

    /**
     * Gets the value of the divisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivisionName() {
        return divisionName;
    }

    /**
     * Sets the value of the divisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivisionName(String value) {
        this.divisionName = value;
    }

    /**
     * Gets the value of the subDivisionDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subDivisionDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubDivisionDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubDivisionDetailType }
     * 
     * 
     */
    public List<SubDivisionDetailType> getSubDivisionDetail() {
        if (subDivisionDetail == null) {
            subDivisionDetail = new ArrayList<SubDivisionDetailType>();
        }
        return this.subDivisionDetail;
    }

}
