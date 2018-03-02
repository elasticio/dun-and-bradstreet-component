
package com.dnb.services.ratings.actions;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * This section provides details on the Bankruptcy that was filed by the company.
 *          
 * 
 * <p>Java class for BankruptcyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankruptcyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FilingTypeText" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="FilingDate" type="{http://services.dnb.com/AssessmentProductServiceV2.0}DNBDateType" minOccurs="0"/>
 *         &lt;element name="FilingChapterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RolePlayer" type="{http://services.dnb.com/AssessmentProductServiceV2.0}FilingPartyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChapterConversionDetails" type="{http://services.dnb.com/AssessmentProductServiceV2.0}ChapterConversionDetailsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankruptcyType", namespace = "http://services.dnb.com/AssessmentProductServiceV2.0", propOrder = {
    "filingTypeText",
    "filingDate",
    "filingChapterNumber",
    "rolePlayer",
    "chapterConversionDetails"
})
public class BankruptcyType {

    @XmlElement(name = "FilingTypeText")
    protected DNBDecodedStringType filingTypeText;
    @XmlElement(name = "FilingDate")
    protected DNBDateType filingDate;
    @XmlElement(name = "FilingChapterNumber")
    protected String filingChapterNumber;
    @XmlElement(name = "RolePlayer")
    protected List<FilingPartyType> rolePlayer;
    @XmlElement(name = "ChapterConversionDetails")
    protected List<ChapterConversionDetailsType> chapterConversionDetails;

    /**
     * Gets the value of the filingTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getFilingTypeText() {
        return filingTypeText;
    }

    /**
     * Sets the value of the filingTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setFilingTypeText(DNBDecodedStringType value) {
        this.filingTypeText = value;
    }

    /**
     * Gets the value of the filingDate property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDateType }
     *     
     */
    public DNBDateType getFilingDate() {
        return filingDate;
    }

    /**
     * Sets the value of the filingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDateType }
     *     
     */
    public void setFilingDate(DNBDateType value) {
        this.filingDate = value;
    }

    /**
     * Gets the value of the filingChapterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilingChapterNumber() {
        return filingChapterNumber;
    }

    /**
     * Sets the value of the filingChapterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilingChapterNumber(String value) {
        this.filingChapterNumber = value;
    }

    /**
     * Gets the value of the rolePlayer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rolePlayer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRolePlayer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilingPartyType }
     * 
     * 
     */
    public List<FilingPartyType> getRolePlayer() {
        if (rolePlayer == null) {
            rolePlayer = new ArrayList<FilingPartyType>();
        }
        return this.rolePlayer;
    }

    /**
     * Gets the value of the chapterConversionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chapterConversionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChapterConversionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChapterConversionDetailsType }
     * 
     * 
     */
    public List<ChapterConversionDetailsType> getChapterConversionDetails() {
        if (chapterConversionDetails == null) {
            chapterConversionDetails = new ArrayList<ChapterConversionDetailsType>();
        }
        return this.chapterConversionDetails;
    }

}
