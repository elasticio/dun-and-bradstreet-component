
package com.dnb.services.company;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExclusionDataEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExclusionDataEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Exact Match"/>
 *     &lt;enumeration value="Exclude Non HeadQuarters"/>
 *     &lt;enumeration value="Exclude Non Marketable"/>
 *     &lt;enumeration value="Exclude Out of Business"/>
 *     &lt;enumeration value="Exclude Undeliverable"/>
 *     &lt;enumeration value="Exclude Unreachable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExclusionDataEnum", namespace = "http://services.dnb.com/CompanyServiceV2.0")
@XmlEnum
public enum ExclusionDataEnum {

    @XmlEnumValue("Exact Match")
    EXACT_MATCH("Exact Match"),
    @XmlEnumValue("Exclude Non HeadQuarters")
    EXCLUDE_NON_HEAD_QUARTERS("Exclude Non HeadQuarters"),
    @XmlEnumValue("Exclude Non Marketable")
    EXCLUDE_NON_MARKETABLE("Exclude Non Marketable"),
    @XmlEnumValue("Exclude Out of Business")
    EXCLUDE_OUT_OF_BUSINESS("Exclude Out of Business"),
    @XmlEnumValue("Exclude Undeliverable")
    EXCLUDE_UNDELIVERABLE("Exclude Undeliverable"),
    @XmlEnumValue("Exclude Unreachable")
    EXCLUDE_UNREACHABLE("Exclude Unreachable");
    private final String value;

    ExclusionDataEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExclusionDataEnum fromValue(String v) {
        for (ExclusionDataEnum c: ExclusionDataEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
