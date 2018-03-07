
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records details of the Principals (e.g., President, Vice President, Directors) and Managers responsible for the business strategy, decision making and day to day running of the subjects operations. This includes names, addresses and identification numbers of the principals. Whilst a principal will usually be an individual in some countries it is legally acceptable for a registered business entity to act as a principal in another business.
 * This excludes shareholders and similar owners who are not responsible for the management of the organization but includes proprietors and partners who, whilst owners, are also generally the principals running the business.
 *          
 * 
 * <p>Java class for PrincipalsAndManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrincipalsAndManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrentPrincipal" type="{http://services.dnb.com/CustomProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FormerPrincipal" type="{http://services.dnb.com/CustomProductServiceV2.0}Management" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BoardMemberService" type="{http://services.dnb.com/CustomProductServiceV2.0}BoardMemberService" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MostSeniorPrincipal" type="{http://services.dnb.com/CustomProductServiceV2.0}Management" minOccurs="0"/>
 *         &lt;element name="SeniorPrincipalNameAndPositionText" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBStringType" minOccurs="0"/>
 *         &lt;element name="Officers" type="{http://services.dnb.com/CustomProductServiceV2.0}Officers" minOccurs="0"/>
 *         &lt;element name="Directors" type="{http://services.dnb.com/CustomProductServiceV2.0}Directors" minOccurs="0"/>
 *         &lt;element name="DataProviderName" type="{http://services.dnb.com/CustomProductServiceV2.0}DNBDecodedStringType" minOccurs="0"/>
 *         &lt;element name="NonSpecificDataProviderText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TextEntry" type="{http://services.dnb.com/CustomProductServiceV2.0}TextEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrincipalSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}PrincipalSummaryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrincipalsAndManagement", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "currentPrincipal",
    "formerPrincipal",
    "boardMemberService",
    "mostSeniorPrincipal",
    "seniorPrincipalNameAndPositionText",
    "officers",
    "directors",
    "dataProviderName",
    "nonSpecificDataProviderText",
    "textEntry",
    "principalSummary"
})
public class PrincipalsAndManagement {

    @XmlElement(name = "CurrentPrincipal")
    protected List<Management> currentPrincipal;
    @XmlElement(name = "FormerPrincipal")
    protected List<Management> formerPrincipal;
    @XmlElement(name = "BoardMemberService")
    protected List<BoardMemberService> boardMemberService;
    @XmlElement(name = "MostSeniorPrincipal")
    protected Management mostSeniorPrincipal;
    @XmlElement(name = "SeniorPrincipalNameAndPositionText")
    protected DNBStringType seniorPrincipalNameAndPositionText;
    @XmlElement(name = "Officers")
    protected Officers officers;
    @XmlElement(name = "Directors")
    protected Directors directors;
    @XmlElement(name = "DataProviderName")
    protected DNBDecodedStringType dataProviderName;
    @XmlElement(name = "NonSpecificDataProviderText")
    protected String nonSpecificDataProviderText;
    @XmlElement(name = "TextEntry")
    protected List<TextEntryType> textEntry;
    @XmlElement(name = "PrincipalSummary")
    protected PrincipalSummaryType principalSummary;

    /**
     * Gets the value of the currentPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currentPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrentPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getCurrentPrincipal() {
        if (currentPrincipal == null) {
            currentPrincipal = new ArrayList<Management>();
        }
        return this.currentPrincipal;
    }

    /**
     * Gets the value of the formerPrincipal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formerPrincipal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormerPrincipal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Management }
     * 
     * 
     */
    public List<Management> getFormerPrincipal() {
        if (formerPrincipal == null) {
            formerPrincipal = new ArrayList<Management>();
        }
        return this.formerPrincipal;
    }

    /**
     * Gets the value of the boardMemberService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the boardMemberService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBoardMemberService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BoardMemberService }
     * 
     * 
     */
    public List<BoardMemberService> getBoardMemberService() {
        if (boardMemberService == null) {
            boardMemberService = new ArrayList<BoardMemberService>();
        }
        return this.boardMemberService;
    }

    /**
     * Gets the value of the mostSeniorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Management }
     *     
     */
    public Management getMostSeniorPrincipal() {
        return mostSeniorPrincipal;
    }

    /**
     * Sets the value of the mostSeniorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Management }
     *     
     */
    public void setMostSeniorPrincipal(Management value) {
        this.mostSeniorPrincipal = value;
    }

    /**
     * Gets the value of the seniorPrincipalNameAndPositionText property.
     * 
     * @return
     *     possible object is
     *     {@link DNBStringType }
     *     
     */
    public DNBStringType getSeniorPrincipalNameAndPositionText() {
        return seniorPrincipalNameAndPositionText;
    }

    /**
     * Sets the value of the seniorPrincipalNameAndPositionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBStringType }
     *     
     */
    public void setSeniorPrincipalNameAndPositionText(DNBStringType value) {
        this.seniorPrincipalNameAndPositionText = value;
    }

    /**
     * Gets the value of the officers property.
     * 
     * @return
     *     possible object is
     *     {@link Officers }
     *     
     */
    public Officers getOfficers() {
        return officers;
    }

    /**
     * Sets the value of the officers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Officers }
     *     
     */
    public void setOfficers(Officers value) {
        this.officers = value;
    }

    /**
     * Gets the value of the directors property.
     * 
     * @return
     *     possible object is
     *     {@link Directors }
     *     
     */
    public Directors getDirectors() {
        return directors;
    }

    /**
     * Sets the value of the directors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Directors }
     *     
     */
    public void setDirectors(Directors value) {
        this.directors = value;
    }

    /**
     * Gets the value of the dataProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public DNBDecodedStringType getDataProviderName() {
        return dataProviderName;
    }

    /**
     * Sets the value of the dataProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DNBDecodedStringType }
     *     
     */
    public void setDataProviderName(DNBDecodedStringType value) {
        this.dataProviderName = value;
    }

    /**
     * Gets the value of the nonSpecificDataProviderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonSpecificDataProviderText() {
        return nonSpecificDataProviderText;
    }

    /**
     * Sets the value of the nonSpecificDataProviderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonSpecificDataProviderText(String value) {
        this.nonSpecificDataProviderText = value;
    }

    /**
     * Gets the value of the textEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextEntryType }
     * 
     * 
     */
    public List<TextEntryType> getTextEntry() {
        if (textEntry == null) {
            textEntry = new ArrayList<TextEntryType>();
        }
        return this.textEntry;
    }

    /**
     * Gets the value of the principalSummary property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalSummaryType }
     *     
     */
    public PrincipalSummaryType getPrincipalSummary() {
        return principalSummary;
    }

    /**
     * Sets the value of the principalSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalSummaryType }
     *     
     */
    public void setPrincipalSummary(PrincipalSummaryType value) {
        this.principalSummary = value;
    }

}
