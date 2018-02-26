
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SortBasisTextEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SortBasisTextEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ConsolidatedEmployeeQuantity"/>
 *     &lt;enumeration value="CountryISOAlpha2Code"/>
 *     &lt;enumeration value="DUNSNumber"/>
 *     &lt;enumeration value="FamilyTreeMemberRole"/>
 *     &lt;enumeration value="OrganizationPrimaryName"/>
 *     &lt;enumeration value="PostalCode"/>
 *     &lt;enumeration value="PostalCodeExtensionCode"/>
 *     &lt;enumeration value="PrimaryTownName"/>
 *     &lt;enumeration value="SalesRevenueAmount"/>
 *     &lt;enumeration value="StandaloneOrganizationIndicator"/>
 *     &lt;enumeration value="StreetAddressLine"/>
 *     &lt;enumeration value="TelephoneNumber"/>
 *     &lt;enumeration value="TerritoryAbbreviatedName"/>
 *     &lt;enumeration value="TerritoryOfficialName"/>
 *     &lt;enumeration value="TradeStyleName"/>
 *     &lt;enumeration value="Relevancy"/>
 *     &lt;enumeration value="MarketabilityIndicator"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SortBasisTextEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum SortBasisTextEnum {

    @XmlEnumValue("ConsolidatedEmployeeQuantity")
    CONSOLIDATED_EMPLOYEE_QUANTITY("ConsolidatedEmployeeQuantity"),
    @XmlEnumValue("CountryISOAlpha2Code")
    COUNTRY_ISO_ALPHA_2_CODE("CountryISOAlpha2Code"),
    @XmlEnumValue("DUNSNumber")
    DUNS_NUMBER("DUNSNumber"),
    @XmlEnumValue("FamilyTreeMemberRole")
    FAMILY_TREE_MEMBER_ROLE("FamilyTreeMemberRole"),
    @XmlEnumValue("OrganizationPrimaryName")
    ORGANIZATION_PRIMARY_NAME("OrganizationPrimaryName"),
    @XmlEnumValue("PostalCode")
    POSTAL_CODE("PostalCode"),
    @XmlEnumValue("PostalCodeExtensionCode")
    POSTAL_CODE_EXTENSION_CODE("PostalCodeExtensionCode"),
    @XmlEnumValue("PrimaryTownName")
    PRIMARY_TOWN_NAME("PrimaryTownName"),
    @XmlEnumValue("SalesRevenueAmount")
    SALES_REVENUE_AMOUNT("SalesRevenueAmount"),
    @XmlEnumValue("StandaloneOrganizationIndicator")
    STANDALONE_ORGANIZATION_INDICATOR("StandaloneOrganizationIndicator"),
    @XmlEnumValue("StreetAddressLine")
    STREET_ADDRESS_LINE("StreetAddressLine"),
    @XmlEnumValue("TelephoneNumber")
    TELEPHONE_NUMBER("TelephoneNumber"),
    @XmlEnumValue("TerritoryAbbreviatedName")
    TERRITORY_ABBREVIATED_NAME("TerritoryAbbreviatedName"),
    @XmlEnumValue("TerritoryOfficialName")
    TERRITORY_OFFICIAL_NAME("TerritoryOfficialName"),
    @XmlEnumValue("TradeStyleName")
    TRADE_STYLE_NAME("TradeStyleName"),
    @XmlEnumValue("Relevancy")
    RELEVANCY("Relevancy"),
    @XmlEnumValue("MarketabilityIndicator")
    MARKETABILITY_INDICATOR("MarketabilityIndicator");
    private final String value;

    SortBasisTextEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortBasisTextEnum fromValue(String v) {
        for (SortBasisTextEnum c: SortBasisTextEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
