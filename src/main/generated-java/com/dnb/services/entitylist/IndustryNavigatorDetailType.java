
package com.dnb.services.entitylist;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryNavigatorDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryNavigatorDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IndustryCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="IndustryCode" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryCodeType"/>
 *                   &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryNavigatorDetailType", namespace = "http://services.dnb.com/EntityListServiceV2.0", propOrder = {
    "industryCode"
})
public class IndustryNavigatorDetailType {

    @XmlElement(name = "IndustryCode")
    protected List<IndustryNavigatorDetailType.IndustryCode> industryCode;

    /**
     * Gets the value of the industryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryNavigatorDetailType.IndustryCode }
     * 
     * 
     */
    public List<IndustryNavigatorDetailType.IndustryCode> getIndustryCode() {
        if (industryCode == null) {
            industryCode = new ArrayList<IndustryNavigatorDetailType.IndustryCode>();
        }
        return this.industryCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="IndustryCode" type="{http://services.dnb.com/EntityListServiceV2.0}IndustryCodeType"/>
     *         &lt;element name="CandidateMatchedQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "industryCode",
        "candidateMatchedQuantity"
    })
    public static class IndustryCode {

        @XmlElement(name = "IndustryCode", required = true)
        protected IndustryCodeType industryCode;
        @XmlElement(name = "CandidateMatchedQuantity")
        protected int candidateMatchedQuantity;

        /**
         * Gets the value of the industryCode property.
         * 
         * @return
         *     possible object is
         *     {@link IndustryCodeType }
         *     
         */
        public IndustryCodeType getIndustryCode() {
            return industryCode;
        }

        /**
         * Sets the value of the industryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link IndustryCodeType }
         *     
         */
        public void setIndustryCode(IndustryCodeType value) {
            this.industryCode = value;
        }

        /**
         * Gets the value of the candidateMatchedQuantity property.
         * 
         */
        public int getCandidateMatchedQuantity() {
            return candidateMatchedQuantity;
        }

        /**
         * Sets the value of the candidateMatchedQuantity property.
         * 
         */
        public void setCandidateMatchedQuantity(int value) {
            this.candidateMatchedQuantity = value;
        }

    }

}
