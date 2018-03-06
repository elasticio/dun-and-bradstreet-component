
package com.dnb.services.firmorgaphics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SocioEconomicIdentification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SocioEconomicIdentification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MinorityOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FemaleOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SmallBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OwnershipEthnicity" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}OwnershipEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}MinorityOwnedDetails" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SmallDisadvantagedBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HUBZoneCertifiedBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EightACertifiedBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EightACertifiedBusinessDetails" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SocioEconomicReferenceDetailType" minOccurs="0"/>
 *         &lt;element name="VeteranOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LaborSurplusAreaIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinorityCollegeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AlaskanNativeCorporationIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CertifiedSmallBusinessIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisabledOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceDisabledVeteranOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VietnamVeteranOwnedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AirportConcessionDisadvantagedBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisabledVeteranBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisadvantagedBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DisadvantagedVeteranEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MinorityBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FemaleOwnedBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="VeteranBusinessEnterpriseIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FemaleOwnedDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SocioEconomicReferenceDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="VeteranOwnedDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SocioEconomicReferenceDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SmallDisadvantagedBusinessDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SmallDisadvantagedBusinessDetail" minOccurs="0"/>
 *         &lt;element name="CertifiedSmallBusinessDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}CertifiedSmallBusinessDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisabledOwnedDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SocioEconomicReferenceDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirportConcessionDisadvantagedBusinessEnterpriseDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}AirportConcessionDisadvantagedBusinessEnterpriseDetail" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DisadvantagedBusinessEnterpriseDetail" type="{http://services.dnb.com/FirmographicsProductServiceV2.0}SocioEconomicReferenceDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SocioEconomicIdentification", namespace = "http://services.dnb.com/FirmographicsProductServiceV2.0", propOrder = {
    "minorityOwnedIndicator",
    "femaleOwnedIndicator",
    "smallBusinessIndicator",
    "ownershipEthnicity",
    "minorityOwnedDetails",
    "smallDisadvantagedBusinessIndicator",
    "hubZoneCertifiedBusinessIndicator",
    "eightACertifiedBusinessIndicator",
    "eightACertifiedBusinessDetails",
    "veteranOwnedIndicator",
    "laborSurplusAreaIndicator",
    "minorityCollegeIndicator",
    "alaskanNativeCorporationIndicator",
    "certifiedSmallBusinessIndicator",
    "disabledOwnedIndicator",
    "serviceDisabledVeteranOwnedIndicator",
    "vietnamVeteranOwnedIndicator",
    "airportConcessionDisadvantagedBusinessEnterpriseIndicator",
    "disabledVeteranBusinessEnterpriseIndicator",
    "disadvantagedBusinessEnterpriseIndicator",
    "disadvantagedVeteranEnterpriseIndicator",
    "minorityBusinessEnterpriseIndicator",
    "femaleOwnedBusinessEnterpriseIndicator",
    "veteranBusinessEnterpriseIndicator",
    "femaleOwnedDetail",
    "veteranOwnedDetail",
    "smallDisadvantagedBusinessDetail",
    "certifiedSmallBusinessDetail",
    "disabledOwnedDetail",
    "airportConcessionDisadvantagedBusinessEnterpriseDetail",
    "disadvantagedBusinessEnterpriseDetail"
})
public class SocioEconomicIdentification {

    @XmlElement(name = "MinorityOwnedIndicator")
    protected Boolean minorityOwnedIndicator;
    @XmlElement(name = "FemaleOwnedIndicator")
    protected Boolean femaleOwnedIndicator;
    @XmlElement(name = "SmallBusinessIndicator")
    protected Boolean smallBusinessIndicator;
    @XmlElement(name = "OwnershipEthnicity")
    protected List<OwnershipEthnicityType> ownershipEthnicity;
    @XmlElement(name = "MinorityOwnedDetails")
    protected List<MinorityOwnedDetails> minorityOwnedDetails;
    @XmlElement(name = "SmallDisadvantagedBusinessIndicator")
    protected Boolean smallDisadvantagedBusinessIndicator;
    @XmlElement(name = "HUBZoneCertifiedBusinessIndicator")
    protected Boolean hubZoneCertifiedBusinessIndicator;
    @XmlElement(name = "EightACertifiedBusinessIndicator")
    protected Boolean eightACertifiedBusinessIndicator;
    @XmlElement(name = "EightACertifiedBusinessDetails")
    protected SocioEconomicReferenceDetailType eightACertifiedBusinessDetails;
    @XmlElement(name = "VeteranOwnedIndicator")
    protected Boolean veteranOwnedIndicator;
    @XmlElement(name = "LaborSurplusAreaIndicator")
    protected Boolean laborSurplusAreaIndicator;
    @XmlElement(name = "MinorityCollegeIndicator")
    protected Boolean minorityCollegeIndicator;
    @XmlElement(name = "AlaskanNativeCorporationIndicator")
    protected Boolean alaskanNativeCorporationIndicator;
    @XmlElement(name = "CertifiedSmallBusinessIndicator")
    protected Boolean certifiedSmallBusinessIndicator;
    @XmlElement(name = "DisabledOwnedIndicator")
    protected Boolean disabledOwnedIndicator;
    @XmlElement(name = "ServiceDisabledVeteranOwnedIndicator")
    protected Boolean serviceDisabledVeteranOwnedIndicator;
    @XmlElement(name = "VietnamVeteranOwnedIndicator")
    protected Boolean vietnamVeteranOwnedIndicator;
    @XmlElement(name = "AirportConcessionDisadvantagedBusinessEnterpriseIndicator")
    protected Boolean airportConcessionDisadvantagedBusinessEnterpriseIndicator;
    @XmlElement(name = "DisabledVeteranBusinessEnterpriseIndicator")
    protected Boolean disabledVeteranBusinessEnterpriseIndicator;
    @XmlElement(name = "DisadvantagedBusinessEnterpriseIndicator")
    protected Boolean disadvantagedBusinessEnterpriseIndicator;
    @XmlElement(name = "DisadvantagedVeteranEnterpriseIndicator")
    protected Boolean disadvantagedVeteranEnterpriseIndicator;
    @XmlElement(name = "MinorityBusinessEnterpriseIndicator")
    protected Boolean minorityBusinessEnterpriseIndicator;
    @XmlElement(name = "FemaleOwnedBusinessEnterpriseIndicator")
    protected Boolean femaleOwnedBusinessEnterpriseIndicator;
    @XmlElement(name = "VeteranBusinessEnterpriseIndicator")
    protected Boolean veteranBusinessEnterpriseIndicator;
    @XmlElement(name = "FemaleOwnedDetail")
    protected List<SocioEconomicReferenceDetailType> femaleOwnedDetail;
    @XmlElement(name = "VeteranOwnedDetail")
    protected List<SocioEconomicReferenceDetailType> veteranOwnedDetail;
    @XmlElement(name = "SmallDisadvantagedBusinessDetail")
    protected SmallDisadvantagedBusinessDetail smallDisadvantagedBusinessDetail;
    @XmlElement(name = "CertifiedSmallBusinessDetail")
    protected List<CertifiedSmallBusinessDetail> certifiedSmallBusinessDetail;
    @XmlElement(name = "DisabledOwnedDetail")
    protected List<SocioEconomicReferenceDetailType> disabledOwnedDetail;
    @XmlElement(name = "AirportConcessionDisadvantagedBusinessEnterpriseDetail")
    protected List<AirportConcessionDisadvantagedBusinessEnterpriseDetail> airportConcessionDisadvantagedBusinessEnterpriseDetail;
    @XmlElement(name = "DisadvantagedBusinessEnterpriseDetail")
    protected List<SocioEconomicReferenceDetailType> disadvantagedBusinessEnterpriseDetail;

    /**
     * Gets the value of the minorityOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityOwnedIndicator() {
        return minorityOwnedIndicator;
    }

    /**
     * Sets the value of the minorityOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityOwnedIndicator(Boolean value) {
        this.minorityOwnedIndicator = value;
    }

    /**
     * Gets the value of the femaleOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFemaleOwnedIndicator() {
        return femaleOwnedIndicator;
    }

    /**
     * Sets the value of the femaleOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFemaleOwnedIndicator(Boolean value) {
        this.femaleOwnedIndicator = value;
    }

    /**
     * Gets the value of the smallBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallBusinessIndicator() {
        return smallBusinessIndicator;
    }

    /**
     * Sets the value of the smallBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallBusinessIndicator(Boolean value) {
        this.smallBusinessIndicator = value;
    }

    /**
     * Gets the value of the ownershipEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownershipEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnershipEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnershipEthnicityType }
     * 
     * 
     */
    public List<OwnershipEthnicityType> getOwnershipEthnicity() {
        if (ownershipEthnicity == null) {
            ownershipEthnicity = new ArrayList<OwnershipEthnicityType>();
        }
        return this.ownershipEthnicity;
    }

    /**
     * Gets the value of the minorityOwnedDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minorityOwnedDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinorityOwnedDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MinorityOwnedDetails }
     * 
     * 
     */
    public List<MinorityOwnedDetails> getMinorityOwnedDetails() {
        if (minorityOwnedDetails == null) {
            minorityOwnedDetails = new ArrayList<MinorityOwnedDetails>();
        }
        return this.minorityOwnedDetails;
    }

    /**
     * Gets the value of the smallDisadvantagedBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmallDisadvantagedBusinessIndicator() {
        return smallDisadvantagedBusinessIndicator;
    }

    /**
     * Sets the value of the smallDisadvantagedBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmallDisadvantagedBusinessIndicator(Boolean value) {
        this.smallDisadvantagedBusinessIndicator = value;
    }

    /**
     * Gets the value of the hubZoneCertifiedBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHUBZoneCertifiedBusinessIndicator() {
        return hubZoneCertifiedBusinessIndicator;
    }

    /**
     * Sets the value of the hubZoneCertifiedBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHUBZoneCertifiedBusinessIndicator(Boolean value) {
        this.hubZoneCertifiedBusinessIndicator = value;
    }

    /**
     * Gets the value of the eightACertifiedBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEightACertifiedBusinessIndicator() {
        return eightACertifiedBusinessIndicator;
    }

    /**
     * Sets the value of the eightACertifiedBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEightACertifiedBusinessIndicator(Boolean value) {
        this.eightACertifiedBusinessIndicator = value;
    }

    /**
     * Gets the value of the eightACertifiedBusinessDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SocioEconomicReferenceDetailType }
     *     
     */
    public SocioEconomicReferenceDetailType getEightACertifiedBusinessDetails() {
        return eightACertifiedBusinessDetails;
    }

    /**
     * Sets the value of the eightACertifiedBusinessDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SocioEconomicReferenceDetailType }
     *     
     */
    public void setEightACertifiedBusinessDetails(SocioEconomicReferenceDetailType value) {
        this.eightACertifiedBusinessDetails = value;
    }

    /**
     * Gets the value of the veteranOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeteranOwnedIndicator() {
        return veteranOwnedIndicator;
    }

    /**
     * Sets the value of the veteranOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeteranOwnedIndicator(Boolean value) {
        this.veteranOwnedIndicator = value;
    }

    /**
     * Gets the value of the laborSurplusAreaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLaborSurplusAreaIndicator() {
        return laborSurplusAreaIndicator;
    }

    /**
     * Sets the value of the laborSurplusAreaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLaborSurplusAreaIndicator(Boolean value) {
        this.laborSurplusAreaIndicator = value;
    }

    /**
     * Gets the value of the minorityCollegeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityCollegeIndicator() {
        return minorityCollegeIndicator;
    }

    /**
     * Sets the value of the minorityCollegeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityCollegeIndicator(Boolean value) {
        this.minorityCollegeIndicator = value;
    }

    /**
     * Gets the value of the alaskanNativeCorporationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlaskanNativeCorporationIndicator() {
        return alaskanNativeCorporationIndicator;
    }

    /**
     * Sets the value of the alaskanNativeCorporationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlaskanNativeCorporationIndicator(Boolean value) {
        this.alaskanNativeCorporationIndicator = value;
    }

    /**
     * Gets the value of the certifiedSmallBusinessIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCertifiedSmallBusinessIndicator() {
        return certifiedSmallBusinessIndicator;
    }

    /**
     * Sets the value of the certifiedSmallBusinessIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCertifiedSmallBusinessIndicator(Boolean value) {
        this.certifiedSmallBusinessIndicator = value;
    }

    /**
     * Gets the value of the disabledOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledOwnedIndicator() {
        return disabledOwnedIndicator;
    }

    /**
     * Sets the value of the disabledOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledOwnedIndicator(Boolean value) {
        this.disabledOwnedIndicator = value;
    }

    /**
     * Gets the value of the serviceDisabledVeteranOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServiceDisabledVeteranOwnedIndicator() {
        return serviceDisabledVeteranOwnedIndicator;
    }

    /**
     * Sets the value of the serviceDisabledVeteranOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServiceDisabledVeteranOwnedIndicator(Boolean value) {
        this.serviceDisabledVeteranOwnedIndicator = value;
    }

    /**
     * Gets the value of the vietnamVeteranOwnedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVietnamVeteranOwnedIndicator() {
        return vietnamVeteranOwnedIndicator;
    }

    /**
     * Sets the value of the vietnamVeteranOwnedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVietnamVeteranOwnedIndicator(Boolean value) {
        this.vietnamVeteranOwnedIndicator = value;
    }

    /**
     * Gets the value of the airportConcessionDisadvantagedBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAirportConcessionDisadvantagedBusinessEnterpriseIndicator() {
        return airportConcessionDisadvantagedBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the airportConcessionDisadvantagedBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAirportConcessionDisadvantagedBusinessEnterpriseIndicator(Boolean value) {
        this.airportConcessionDisadvantagedBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the disabledVeteranBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisabledVeteranBusinessEnterpriseIndicator() {
        return disabledVeteranBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the disabledVeteranBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisabledVeteranBusinessEnterpriseIndicator(Boolean value) {
        this.disabledVeteranBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the disadvantagedBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisadvantagedBusinessEnterpriseIndicator() {
        return disadvantagedBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the disadvantagedBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisadvantagedBusinessEnterpriseIndicator(Boolean value) {
        this.disadvantagedBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the disadvantagedVeteranEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisadvantagedVeteranEnterpriseIndicator() {
        return disadvantagedVeteranEnterpriseIndicator;
    }

    /**
     * Sets the value of the disadvantagedVeteranEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisadvantagedVeteranEnterpriseIndicator(Boolean value) {
        this.disadvantagedVeteranEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the minorityBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityBusinessEnterpriseIndicator() {
        return minorityBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the minorityBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityBusinessEnterpriseIndicator(Boolean value) {
        this.minorityBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the femaleOwnedBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFemaleOwnedBusinessEnterpriseIndicator() {
        return femaleOwnedBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the femaleOwnedBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFemaleOwnedBusinessEnterpriseIndicator(Boolean value) {
        this.femaleOwnedBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the veteranBusinessEnterpriseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVeteranBusinessEnterpriseIndicator() {
        return veteranBusinessEnterpriseIndicator;
    }

    /**
     * Sets the value of the veteranBusinessEnterpriseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVeteranBusinessEnterpriseIndicator(Boolean value) {
        this.veteranBusinessEnterpriseIndicator = value;
    }

    /**
     * Gets the value of the femaleOwnedDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the femaleOwnedDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFemaleOwnedDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocioEconomicReferenceDetailType }
     * 
     * 
     */
    public List<SocioEconomicReferenceDetailType> getFemaleOwnedDetail() {
        if (femaleOwnedDetail == null) {
            femaleOwnedDetail = new ArrayList<SocioEconomicReferenceDetailType>();
        }
        return this.femaleOwnedDetail;
    }

    /**
     * Gets the value of the veteranOwnedDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the veteranOwnedDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVeteranOwnedDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocioEconomicReferenceDetailType }
     * 
     * 
     */
    public List<SocioEconomicReferenceDetailType> getVeteranOwnedDetail() {
        if (veteranOwnedDetail == null) {
            veteranOwnedDetail = new ArrayList<SocioEconomicReferenceDetailType>();
        }
        return this.veteranOwnedDetail;
    }

    /**
     * Gets the value of the smallDisadvantagedBusinessDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SmallDisadvantagedBusinessDetail }
     *     
     */
    public SmallDisadvantagedBusinessDetail getSmallDisadvantagedBusinessDetail() {
        return smallDisadvantagedBusinessDetail;
    }

    /**
     * Sets the value of the smallDisadvantagedBusinessDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallDisadvantagedBusinessDetail }
     *     
     */
    public void setSmallDisadvantagedBusinessDetail(SmallDisadvantagedBusinessDetail value) {
        this.smallDisadvantagedBusinessDetail = value;
    }

    /**
     * Gets the value of the certifiedSmallBusinessDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certifiedSmallBusinessDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertifiedSmallBusinessDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertifiedSmallBusinessDetail }
     * 
     * 
     */
    public List<CertifiedSmallBusinessDetail> getCertifiedSmallBusinessDetail() {
        if (certifiedSmallBusinessDetail == null) {
            certifiedSmallBusinessDetail = new ArrayList<CertifiedSmallBusinessDetail>();
        }
        return this.certifiedSmallBusinessDetail;
    }

    /**
     * Gets the value of the disabledOwnedDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabledOwnedDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabledOwnedDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocioEconomicReferenceDetailType }
     * 
     * 
     */
    public List<SocioEconomicReferenceDetailType> getDisabledOwnedDetail() {
        if (disabledOwnedDetail == null) {
            disabledOwnedDetail = new ArrayList<SocioEconomicReferenceDetailType>();
        }
        return this.disabledOwnedDetail;
    }

    /**
     * Gets the value of the airportConcessionDisadvantagedBusinessEnterpriseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airportConcessionDisadvantagedBusinessEnterpriseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirportConcessionDisadvantagedBusinessEnterpriseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportConcessionDisadvantagedBusinessEnterpriseDetail }
     * 
     * 
     */
    public List<AirportConcessionDisadvantagedBusinessEnterpriseDetail> getAirportConcessionDisadvantagedBusinessEnterpriseDetail() {
        if (airportConcessionDisadvantagedBusinessEnterpriseDetail == null) {
            airportConcessionDisadvantagedBusinessEnterpriseDetail = new ArrayList<AirportConcessionDisadvantagedBusinessEnterpriseDetail>();
        }
        return this.airportConcessionDisadvantagedBusinessEnterpriseDetail;
    }

    /**
     * Gets the value of the disadvantagedBusinessEnterpriseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disadvantagedBusinessEnterpriseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisadvantagedBusinessEnterpriseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocioEconomicReferenceDetailType }
     * 
     * 
     */
    public List<SocioEconomicReferenceDetailType> getDisadvantagedBusinessEnterpriseDetail() {
        if (disadvantagedBusinessEnterpriseDetail == null) {
            disadvantagedBusinessEnterpriseDetail = new ArrayList<SocioEconomicReferenceDetailType>();
        }
        return this.disadvantagedBusinessEnterpriseDetail;
    }

}
