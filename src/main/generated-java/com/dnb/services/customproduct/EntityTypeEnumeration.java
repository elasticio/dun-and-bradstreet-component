
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Organization"/>
 *     &lt;enumeration value="Person"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityTypeEnumeration", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum EntityTypeEnumeration {

    @XmlEnumValue("Organization")
    ORGANIZATION("Organization"),
    @XmlEnumValue("Person")
    PERSON("Person");
    private final String value;

    EntityTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityTypeEnumeration fromValue(String v) {
        for (EntityTypeEnumeration c: EntityTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
