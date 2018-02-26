
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionContactDataEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InclusionContactDataEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IncludeUndeliverableAddressSubject"/>
 *     &lt;enumeration value="IncludeOutofBusiness"/>
 *     &lt;enumeration value="IncludeIncompleteData"/>
 *     &lt;enumeration value="IncludeNonMarketableOnly"/>
 *     &lt;enumeration value="IncludeContactsOnlyWithDirectEmail"/>
 *     &lt;enumeration value="IncludeContactsOnlyWithDirectPhone"/>
 *     &lt;enumeration value="IncludeContactsOnlyWithDirectEmailOrDirectPhone"/>
 *     &lt;enumeration value="IncludeContactsOnlyWithoutDirectEmailAndDirectPhone"/>
 *     &lt;enumeration value="IncludeNonMarketable"/>
 *     &lt;enumeration value="IncludeDelisted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InclusionContactDataEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum InclusionContactDataEnum {

    @XmlEnumValue("IncludeUndeliverableAddressSubject")
    INCLUDE_UNDELIVERABLE_ADDRESS_SUBJECT("IncludeUndeliverableAddressSubject"),
    @XmlEnumValue("IncludeOutofBusiness")
    INCLUDE_OUTOF_BUSINESS("IncludeOutofBusiness"),
    @XmlEnumValue("IncludeIncompleteData")
    INCLUDE_INCOMPLETE_DATA("IncludeIncompleteData"),
    @XmlEnumValue("IncludeNonMarketableOnly")
    INCLUDE_NON_MARKETABLE_ONLY("IncludeNonMarketableOnly"),
    @XmlEnumValue("IncludeContactsOnlyWithDirectEmail")
    INCLUDE_CONTACTS_ONLY_WITH_DIRECT_EMAIL("IncludeContactsOnlyWithDirectEmail"),
    @XmlEnumValue("IncludeContactsOnlyWithDirectPhone")
    INCLUDE_CONTACTS_ONLY_WITH_DIRECT_PHONE("IncludeContactsOnlyWithDirectPhone"),
    @XmlEnumValue("IncludeContactsOnlyWithDirectEmailOrDirectPhone")
    INCLUDE_CONTACTS_ONLY_WITH_DIRECT_EMAIL_OR_DIRECT_PHONE("IncludeContactsOnlyWithDirectEmailOrDirectPhone"),
    @XmlEnumValue("IncludeContactsOnlyWithoutDirectEmailAndDirectPhone")
    INCLUDE_CONTACTS_ONLY_WITHOUT_DIRECT_EMAIL_AND_DIRECT_PHONE("IncludeContactsOnlyWithoutDirectEmailAndDirectPhone"),
    @XmlEnumValue("IncludeNonMarketable")
    INCLUDE_NON_MARKETABLE("IncludeNonMarketable"),
    @XmlEnumValue("IncludeDelisted")
    INCLUDE_DELISTED("IncludeDelisted");
    private final String value;

    InclusionContactDataEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InclusionContactDataEnum fromValue(String v) {
        for (InclusionContactDataEnum c: InclusionContactDataEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
