
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataTopicEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataTopicEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActivitiesAndOperations"/>
 *     &lt;enumeration value="Assessment"/>
 *     &lt;enumeration value="Banking"/>
 *     &lt;enumeration value="EmployeeFigures"/>
 *     &lt;enumeration value="Financial"/>
 *     &lt;enumeration value="FinancialAssetArticle"/>
 *     &lt;enumeration value="IndustryCode"/>
 *     &lt;enumeration value="Linkage"/>
 *     &lt;enumeration value="OrganizationDetail"/>
 *     &lt;enumeration value="OrganizationName"/>
 *     &lt;enumeration value="PrincipalsAndManagement"/>
 *     &lt;enumeration value="RegisteredDetail"/>
 *     &lt;enumeration value="SocioEconomicIdentification"/>
 *     &lt;enumeration value="Telecommunication"/>
 *     &lt;enumeration value="ThirdPartyAssessment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataTopicEnum", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum DataTopicEnum {

    @XmlEnumValue("ActivitiesAndOperations")
    ACTIVITIES_AND_OPERATIONS("ActivitiesAndOperations"),
    @XmlEnumValue("Assessment")
    ASSESSMENT("Assessment"),
    @XmlEnumValue("Banking")
    BANKING("Banking"),
    @XmlEnumValue("EmployeeFigures")
    EMPLOYEE_FIGURES("EmployeeFigures"),
    @XmlEnumValue("Financial")
    FINANCIAL("Financial"),
    @XmlEnumValue("FinancialAssetArticle")
    FINANCIAL_ASSET_ARTICLE("FinancialAssetArticle"),
    @XmlEnumValue("IndustryCode")
    INDUSTRY_CODE("IndustryCode"),
    @XmlEnumValue("Linkage")
    LINKAGE("Linkage"),
    @XmlEnumValue("OrganizationDetail")
    ORGANIZATION_DETAIL("OrganizationDetail"),
    @XmlEnumValue("OrganizationName")
    ORGANIZATION_NAME("OrganizationName"),
    @XmlEnumValue("PrincipalsAndManagement")
    PRINCIPALS_AND_MANAGEMENT("PrincipalsAndManagement"),
    @XmlEnumValue("RegisteredDetail")
    REGISTERED_DETAIL("RegisteredDetail"),
    @XmlEnumValue("SocioEconomicIdentification")
    SOCIO_ECONOMIC_IDENTIFICATION("SocioEconomicIdentification"),
    @XmlEnumValue("Telecommunication")
    TELECOMMUNICATION("Telecommunication"),
    @XmlEnumValue("ThirdPartyAssessment")
    THIRD_PARTY_ASSESSMENT("ThirdPartyAssessment");
    private final String value;

    DataTopicEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataTopicEnum fromValue(String v) {
        for (DataTopicEnum c: DataTopicEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
