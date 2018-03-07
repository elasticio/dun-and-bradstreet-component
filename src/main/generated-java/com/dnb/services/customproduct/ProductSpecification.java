
package com.dnb.services.customproduct;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductSpecification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSpecification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DNBProductID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LanguagePreferenceCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="CharacterSetPreferenceCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ProductFormatPreferenceCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ExcludeBranchesIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TradeUpIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CurrencyPreferenceISOAlpha3Code" type="{http://services.dnb.com/CustomProductServiceV2.0}CurrencyISOAlpha3Code" minOccurs="0"/>
 *         &lt;element name="ReturnOnlyInDateDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OrderReasonCode" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBCodeValueType" minOccurs="0"/>
 *         &lt;element name="ReturnConnectMailDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DataTopicSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}DataTopicSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NewsSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}NewsSpecification" minOccurs="0"/>
 *         &lt;element name="SocialMediaSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}SocialMediaSpecification" minOccurs="0"/>
 *         &lt;element name="ProfileChapterName" type="{http://services.dnb.com/CustomProductServiceV2.0}IndustryChapterNameEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RequestedOrganizationChildLinkageSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}RequestedOrganizationChildLinkageSpecification" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LinkedOrganizationLocationSpecification" type="{http://services.dnb.com/CustomProductServiceV2.0}LinkedOrganizationLocationSpecification" minOccurs="0"/>
 *         &lt;element name="InclusionCriteria" type="{http://services.dnb.com/CustomProductServiceV2.0}InclusionCriteria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RequestedOrganizationChildLevelMaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductSpecification", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "dnbProductID",
    "languagePreferenceCode",
    "characterSetPreferenceCode",
    "productFormatPreferenceCode",
    "excludeBranchesIndicator",
    "tradeUpIndicator",
    "currencyPreferenceISOAlpha3Code",
    "returnOnlyInDateDataIndicator",
    "orderReasonCode",
    "returnConnectMailDataIndicator",
    "dataTopicSpecification",
    "newsSpecification",
    "socialMediaSpecification",
    "profileChapterName",
    "requestedOrganizationChildLinkageSpecification",
    "linkedOrganizationLocationSpecification",
    "inclusionCriteria"
})
public class ProductSpecification {

    @XmlElement(name = "DNBProductID")
    protected String dnbProductID;
    @XmlElement(name = "LanguagePreferenceCode")
    protected BigInteger languagePreferenceCode;
    @XmlElement(name = "CharacterSetPreferenceCode")
    protected BigInteger characterSetPreferenceCode;
    @XmlElement(name = "ProductFormatPreferenceCode")
    protected BigInteger productFormatPreferenceCode;
    @XmlElement(name = "ExcludeBranchesIndicator")
    protected Boolean excludeBranchesIndicator;
    @XmlElement(name = "TradeUpIndicator")
    protected Boolean tradeUpIndicator;
    @XmlElement(name = "CurrencyPreferenceISOAlpha3Code")
    protected String currencyPreferenceISOAlpha3Code;
    @XmlElement(name = "ReturnOnlyInDateDataIndicator")
    protected Boolean returnOnlyInDateDataIndicator;
    @XmlElement(name = "OrderReasonCode")
    protected BigInteger orderReasonCode;
    @XmlElement(name = "ReturnConnectMailDataIndicator")
    protected Boolean returnConnectMailDataIndicator;
    @XmlElement(name = "DataTopicSpecification")
    protected List<DataTopicSpecification> dataTopicSpecification;
    @XmlElement(name = "NewsSpecification")
    protected NewsSpecification newsSpecification;
    @XmlElement(name = "SocialMediaSpecification")
    protected SocialMediaSpecification socialMediaSpecification;
    @XmlElement(name = "ProfileChapterName")
    @XmlSchemaType(name = "string")
    protected List<IndustryChapterNameEnum> profileChapterName;
    @XmlElement(name = "RequestedOrganizationChildLinkageSpecification")
    protected List<RequestedOrganizationChildLinkageSpecification> requestedOrganizationChildLinkageSpecification;
    @XmlElement(name = "LinkedOrganizationLocationSpecification")
    protected LinkedOrganizationLocationSpecification linkedOrganizationLocationSpecification;
    @XmlElement(name = "InclusionCriteria")
    protected List<InclusionCriteria> inclusionCriteria;
    @XmlAttribute(name = "RequestedOrganizationChildLevelMaximumQuantity")
    protected Integer requestedOrganizationChildLevelMaximumQuantity;

    /**
     * Gets the value of the dnbProductID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNBProductID() {
        return dnbProductID;
    }

    /**
     * Sets the value of the dnbProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNBProductID(String value) {
        this.dnbProductID = value;
    }

    /**
     * Gets the value of the languagePreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLanguagePreferenceCode() {
        return languagePreferenceCode;
    }

    /**
     * Sets the value of the languagePreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLanguagePreferenceCode(BigInteger value) {
        this.languagePreferenceCode = value;
    }

    /**
     * Gets the value of the characterSetPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCharacterSetPreferenceCode() {
        return characterSetPreferenceCode;
    }

    /**
     * Sets the value of the characterSetPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCharacterSetPreferenceCode(BigInteger value) {
        this.characterSetPreferenceCode = value;
    }

    /**
     * Gets the value of the productFormatPreferenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductFormatPreferenceCode() {
        return productFormatPreferenceCode;
    }

    /**
     * Sets the value of the productFormatPreferenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductFormatPreferenceCode(BigInteger value) {
        this.productFormatPreferenceCode = value;
    }

    /**
     * Gets the value of the excludeBranchesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcludeBranchesIndicator() {
        return excludeBranchesIndicator;
    }

    /**
     * Sets the value of the excludeBranchesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeBranchesIndicator(Boolean value) {
        this.excludeBranchesIndicator = value;
    }

    /**
     * Gets the value of the tradeUpIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradeUpIndicator() {
        return tradeUpIndicator;
    }

    /**
     * Sets the value of the tradeUpIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradeUpIndicator(Boolean value) {
        this.tradeUpIndicator = value;
    }

    /**
     * Gets the value of the currencyPreferenceISOAlpha3Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyPreferenceISOAlpha3Code() {
        return currencyPreferenceISOAlpha3Code;
    }

    /**
     * Sets the value of the currencyPreferenceISOAlpha3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyPreferenceISOAlpha3Code(String value) {
        this.currencyPreferenceISOAlpha3Code = value;
    }

    /**
     * Gets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnOnlyInDateDataIndicator() {
        return returnOnlyInDateDataIndicator;
    }

    /**
     * Sets the value of the returnOnlyInDateDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnOnlyInDateDataIndicator(Boolean value) {
        this.returnOnlyInDateDataIndicator = value;
    }

    /**
     * Gets the value of the orderReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrderReasonCode() {
        return orderReasonCode;
    }

    /**
     * Sets the value of the orderReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrderReasonCode(BigInteger value) {
        this.orderReasonCode = value;
    }

    /**
     * Gets the value of the returnConnectMailDataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnConnectMailDataIndicator() {
        return returnConnectMailDataIndicator;
    }

    /**
     * Sets the value of the returnConnectMailDataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnConnectMailDataIndicator(Boolean value) {
        this.returnConnectMailDataIndicator = value;
    }

    /**
     * Gets the value of the dataTopicSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataTopicSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataTopicSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataTopicSpecification }
     * 
     * 
     */
    public List<DataTopicSpecification> getDataTopicSpecification() {
        if (dataTopicSpecification == null) {
            dataTopicSpecification = new ArrayList<DataTopicSpecification>();
        }
        return this.dataTopicSpecification;
    }

    /**
     * Gets the value of the newsSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link NewsSpecification }
     *     
     */
    public NewsSpecification getNewsSpecification() {
        return newsSpecification;
    }

    /**
     * Sets the value of the newsSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewsSpecification }
     *     
     */
    public void setNewsSpecification(NewsSpecification value) {
        this.newsSpecification = value;
    }

    /**
     * Gets the value of the socialMediaSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link SocialMediaSpecification }
     *     
     */
    public SocialMediaSpecification getSocialMediaSpecification() {
        return socialMediaSpecification;
    }

    /**
     * Sets the value of the socialMediaSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocialMediaSpecification }
     *     
     */
    public void setSocialMediaSpecification(SocialMediaSpecification value) {
        this.socialMediaSpecification = value;
    }

    /**
     * Gets the value of the profileChapterName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileChapterName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileChapterName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryChapterNameEnum }
     * 
     * 
     */
    public List<IndustryChapterNameEnum> getProfileChapterName() {
        if (profileChapterName == null) {
            profileChapterName = new ArrayList<IndustryChapterNameEnum>();
        }
        return this.profileChapterName;
    }

    /**
     * Gets the value of the requestedOrganizationChildLinkageSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedOrganizationChildLinkageSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedOrganizationChildLinkageSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedOrganizationChildLinkageSpecification }
     * 
     * 
     */
    public List<RequestedOrganizationChildLinkageSpecification> getRequestedOrganizationChildLinkageSpecification() {
        if (requestedOrganizationChildLinkageSpecification == null) {
            requestedOrganizationChildLinkageSpecification = new ArrayList<RequestedOrganizationChildLinkageSpecification>();
        }
        return this.requestedOrganizationChildLinkageSpecification;
    }

    /**
     * Gets the value of the linkedOrganizationLocationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link LinkedOrganizationLocationSpecification }
     *     
     */
    public LinkedOrganizationLocationSpecification getLinkedOrganizationLocationSpecification() {
        return linkedOrganizationLocationSpecification;
    }

    /**
     * Sets the value of the linkedOrganizationLocationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkedOrganizationLocationSpecification }
     *     
     */
    public void setLinkedOrganizationLocationSpecification(LinkedOrganizationLocationSpecification value) {
        this.linkedOrganizationLocationSpecification = value;
    }

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
     * Gets the value of the requestedOrganizationChildLevelMaximumQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRequestedOrganizationChildLevelMaximumQuantity() {
        return requestedOrganizationChildLevelMaximumQuantity;
    }

    /**
     * Sets the value of the requestedOrganizationChildLevelMaximumQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRequestedOrganizationChildLevelMaximumQuantity(Integer value) {
        this.requestedOrganizationChildLevelMaximumQuantity = value;
    }

}
