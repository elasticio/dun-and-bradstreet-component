
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnershipTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OwnershipTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Non-Public"/>
 *     &lt;enumeration value="Owned by a Public Company"/>
 *     &lt;enumeration value="Public"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OwnershipTypeEnum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum OwnershipTypeEnum {

    @XmlEnumValue("Non-Public")
    NON_PUBLIC("Non-Public"),
    @XmlEnumValue("Owned by a Public Company")
    OWNED_BY_A_PUBLIC_COMPANY("Owned by a Public Company"),
    @XmlEnumValue("Public")
    PUBLIC("Public");
    private final String value;

    OwnershipTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnershipTypeEnum fromValue(String v) {
        for (OwnershipTypeEnum c: OwnershipTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
