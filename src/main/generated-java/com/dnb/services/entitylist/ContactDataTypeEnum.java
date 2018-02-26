
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactDataTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactDataTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HasDirectPhone"/>
 *     &lt;enumeration value="HasDirectEmail"/>
 *     &lt;enumeration value="HasDirectPhoneOrDirectEmail"/>
 *     &lt;enumeration value="HasDirectPhoneAndDirectEmail"/>
 *     &lt;enumeration value="HasNeitherDirectPhoneNorDirectEmail"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactDataTypeEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum ContactDataTypeEnum {

    @XmlEnumValue("HasDirectPhone")
    HAS_DIRECT_PHONE("HasDirectPhone"),
    @XmlEnumValue("HasDirectEmail")
    HAS_DIRECT_EMAIL("HasDirectEmail"),
    @XmlEnumValue("HasDirectPhoneOrDirectEmail")
    HAS_DIRECT_PHONE_OR_DIRECT_EMAIL("HasDirectPhoneOrDirectEmail"),
    @XmlEnumValue("HasDirectPhoneAndDirectEmail")
    HAS_DIRECT_PHONE_AND_DIRECT_EMAIL("HasDirectPhoneAndDirectEmail"),
    @XmlEnumValue("HasNeitherDirectPhoneNorDirectEmail")
    HAS_NEITHER_DIRECT_PHONE_NOR_DIRECT_EMAIL("HasNeitherDirectPhoneNorDirectEmail");
    private final String value;

    ContactDataTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactDataTypeEnum fromValue(String v) {
        for (ContactDataTypeEnum c: ContactDataTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
