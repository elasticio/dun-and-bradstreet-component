
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records the location details of the supplier.
 *          
 * 
 * <p>Java class for ComplianceAddressDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceAddressDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BirthAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}SubjectAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NonspecificAddress" type="{http://services.dnb.com/CustomProductServiceV2.0}NonspecificAddress" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceAddressDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "birthAddress",
    "primaryAddress",
    "nonspecificAddress"
})
public class ComplianceAddressDetail {

    @XmlElement(name = "BirthAddress")
    protected List<SubjectAddress> birthAddress;
    @XmlElement(name = "PrimaryAddress")
    protected List<SubjectAddress> primaryAddress;
    @XmlElement(name = "NonspecificAddress")
    protected List<NonspecificAddress> nonspecificAddress;

    /**
     * Gets the value of the birthAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birthAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirthAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectAddress }
     * 
     * 
     */
    public List<SubjectAddress> getBirthAddress() {
        if (birthAddress == null) {
            birthAddress = new ArrayList<SubjectAddress>();
        }
        return this.birthAddress;
    }

    /**
     * Gets the value of the primaryAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectAddress }
     * 
     * 
     */
    public List<SubjectAddress> getPrimaryAddress() {
        if (primaryAddress == null) {
            primaryAddress = new ArrayList<SubjectAddress>();
        }
        return this.primaryAddress;
    }

    /**
     * Gets the value of the nonspecificAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonspecificAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonspecificAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonspecificAddress }
     * 
     * 
     */
    public List<NonspecificAddress> getNonspecificAddress() {
        if (nonspecificAddress == null) {
            nonspecificAddress = new ArrayList<NonspecificAddress>();
        }
        return this.nonspecificAddress;
    }

}
