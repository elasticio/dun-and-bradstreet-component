
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionDataEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InclusionDataEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IncludeUndeliverableAddressSubject"/>
 *     &lt;enumeration value="IncludeOutofBusiness"/>
 *     &lt;enumeration value="IncludeIncompleteData"/>
 *     &lt;enumeration value="IncludeNonMarketableOnly"/>
 *     &lt;enumeration value="IncludeNonMarketable"/>
 *     &lt;enumeration value="IncludeDelisted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InclusionDataEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum InclusionDataEnum {

    @XmlEnumValue("IncludeUndeliverableAddressSubject")
    INCLUDE_UNDELIVERABLE_ADDRESS_SUBJECT("IncludeUndeliverableAddressSubject"),
    @XmlEnumValue("IncludeOutofBusiness")
    INCLUDE_OUTOF_BUSINESS("IncludeOutofBusiness"),
    @XmlEnumValue("IncludeIncompleteData")
    INCLUDE_INCOMPLETE_DATA("IncludeIncompleteData"),
    @XmlEnumValue("IncludeNonMarketableOnly")
    INCLUDE_NON_MARKETABLE_ONLY("IncludeNonMarketableOnly"),
    @XmlEnumValue("IncludeNonMarketable")
    INCLUDE_NON_MARKETABLE("IncludeNonMarketable"),
    @XmlEnumValue("IncludeDelisted")
    INCLUDE_DELISTED("IncludeDelisted");
    private final String value;

    InclusionDataEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InclusionDataEnum fromValue(String v) {
        for (InclusionDataEnum c: InclusionDataEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
