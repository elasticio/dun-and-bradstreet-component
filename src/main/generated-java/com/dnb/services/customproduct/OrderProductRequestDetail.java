
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderProductRequestDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProductRequestDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InquiryDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryDetail"/>
 *         &lt;element name="ProductSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}ProductSpecification"/>
 *         &lt;element name="ShareholderSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}ShareholderSpecification" minOccurs="0"/>
 *         &lt;element name="CreditDecisionSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditDecisionSpecification" minOccurs="0"/>
 *         &lt;element name="DetailedTradeInformationSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}DetailedTradeInformationSpecification" minOccurs="0"/>
 *         &lt;element name="CreditBureauSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}CreditBureauSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CustomScoreSpecification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomScoreParameters" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ArchiveDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}ArchiveDetail" minOccurs="0"/>
 *         &lt;element name="InquiryReferenceDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}InquiryReferenceDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProductRequestDetail", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "inquiryDetail",
    "productSpecification",
    "shareholderSpecification",
    "creditDecisionSpecification",
    "detailedTradeInformationSpecification",
    "creditBureauSpecification",
    "customScoreSpecification",
    "archiveDetail",
    "inquiryReferenceDetail"
})
public class OrderProductRequestDetail {

    @XmlElement(name = "InquiryDetail", required = true)
    protected InquiryDetail inquiryDetail;
    @XmlElement(name = "ProductSpecification", required = true)
    protected ProductSpecification productSpecification;
    @XmlElement(name = "ShareholderSpecification")
    protected ShareholderSpecification shareholderSpecification;
    @XmlElement(name = "CreditDecisionSpecification")
    protected CreditDecisionSpecification creditDecisionSpecification;
    @XmlElement(name = "DetailedTradeInformationSpecification")
    protected DetailedTradeInformationSpecification detailedTradeInformationSpecification;
    @XmlElement(name = "CreditBureauSpecification")
    protected List<CreditBureauSpecification> creditBureauSpecification;
    @XmlElement(name = "CustomScoreSpecification")
    protected OrderProductRequestDetail.CustomScoreSpecification customScoreSpecification;
    @XmlElement(name = "ArchiveDetail")
    protected ArchiveDetail archiveDetail;
    @XmlElement(name = "InquiryReferenceDetail")
    protected InquiryReferenceDetail inquiryReferenceDetail;

    /**
     * Gets the value of the inquiryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryDetail }
     *     
     */
    public InquiryDetail getInquiryDetail() {
        return inquiryDetail;
    }

    /**
     * Sets the value of the inquiryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryDetail }
     *     
     */
    public void setInquiryDetail(InquiryDetail value) {
        this.inquiryDetail = value;
    }

    /**
     * Gets the value of the productSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSpecification }
     *     
     */
    public ProductSpecification getProductSpecification() {
        return productSpecification;
    }

    /**
     * Sets the value of the productSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSpecification }
     *     
     */
    public void setProductSpecification(ProductSpecification value) {
        this.productSpecification = value;
    }

    /**
     * Gets the value of the shareholderSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ShareholderSpecification }
     *     
     */
    public ShareholderSpecification getShareholderSpecification() {
        return shareholderSpecification;
    }

    /**
     * Sets the value of the shareholderSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShareholderSpecification }
     *     
     */
    public void setShareholderSpecification(ShareholderSpecification value) {
        this.shareholderSpecification = value;
    }

    /**
     * Gets the value of the creditDecisionSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDecisionSpecification }
     *     
     */
    public CreditDecisionSpecification getCreditDecisionSpecification() {
        return creditDecisionSpecification;
    }

    /**
     * Sets the value of the creditDecisionSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDecisionSpecification }
     *     
     */
    public void setCreditDecisionSpecification(CreditDecisionSpecification value) {
        this.creditDecisionSpecification = value;
    }

    /**
     * Gets the value of the detailedTradeInformationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedTradeInformationSpecification }
     *     
     */
    public DetailedTradeInformationSpecification getDetailedTradeInformationSpecification() {
        return detailedTradeInformationSpecification;
    }

    /**
     * Sets the value of the detailedTradeInformationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedTradeInformationSpecification }
     *     
     */
    public void setDetailedTradeInformationSpecification(DetailedTradeInformationSpecification value) {
        this.detailedTradeInformationSpecification = value;
    }

    /**
     * Gets the value of the creditBureauSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditBureauSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditBureauSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditBureauSpecification }
     * 
     * 
     */
    public List<CreditBureauSpecification> getCreditBureauSpecification() {
        if (creditBureauSpecification == null) {
            creditBureauSpecification = new ArrayList<CreditBureauSpecification>();
        }
        return this.creditBureauSpecification;
    }

    /**
     * Gets the value of the customScoreSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProductRequestDetail.CustomScoreSpecification }
     *     
     */
    public OrderProductRequestDetail.CustomScoreSpecification getCustomScoreSpecification() {
        return customScoreSpecification;
    }

    /**
     * Sets the value of the customScoreSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProductRequestDetail.CustomScoreSpecification }
     *     
     */
    public void setCustomScoreSpecification(OrderProductRequestDetail.CustomScoreSpecification value) {
        this.customScoreSpecification = value;
    }

    /**
     * Gets the value of the archiveDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ArchiveDetail }
     *     
     */
    public ArchiveDetail getArchiveDetail() {
        return archiveDetail;
    }

    /**
     * Sets the value of the archiveDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArchiveDetail }
     *     
     */
    public void setArchiveDetail(ArchiveDetail value) {
        this.archiveDetail = value;
    }

    /**
     * Gets the value of the inquiryReferenceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public InquiryReferenceDetail getInquiryReferenceDetail() {
        return inquiryReferenceDetail;
    }

    /**
     * Sets the value of the inquiryReferenceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryReferenceDetail }
     *     
     */
    public void setInquiryReferenceDetail(InquiryReferenceDetail value) {
        this.inquiryReferenceDetail = value;
    }


    /**
     * 
     * Records data that allows the customer to specify details on the parameters provided by the customer to be considered during the custom score calculation.
     *                   
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CustomScoreParameters" type="{http://services.dnb.com/CustomProductServiceV2.0}DecisionParameter" maxOccurs="unbounded" minOccurs="0"/>
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
        "customScoreParameters"
    })
    public static class CustomScoreSpecification {

        @XmlElement(name = "CustomScoreParameters")
        protected List<DecisionParameter> customScoreParameters;

        /**
         * Gets the value of the customScoreParameters property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customScoreParameters property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomScoreParameters().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DecisionParameter }
         * 
         * 
         */
        public List<DecisionParameter> getCustomScoreParameters() {
            if (customScoreParameters == null) {
                customScoreParameters = new ArrayList<DecisionParameter>();
            }
            return this.customScoreParameters;
        }

    }

}
