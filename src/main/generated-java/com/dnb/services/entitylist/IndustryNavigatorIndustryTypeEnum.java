
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryNavigatorIndustryTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IndustryNavigatorIndustryTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NAICS"/>
 *     &lt;enumeration value="UK SIC"/>
 *     &lt;enumeration value="US SIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IndustryNavigatorIndustryTypeEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum IndustryNavigatorIndustryTypeEnum {

    NAICS("NAICS"),
    @XmlEnumValue("UK SIC")
    UK_SIC("UK SIC"),
    @XmlEnumValue("US SIC")
    US_SIC("US SIC");
    private final String value;

    IndustryNavigatorIndustryTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IndustryNavigatorIndustryTypeEnum fromValue(String v) {
        for (IndustryNavigatorIndustryTypeEnum c: IndustryNavigatorIndustryTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
