
package com.dnb.services.customproduct;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoleTypeEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FamilyTreeMember"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoleTypeEnumeration", namespace = "http://services.dnb.com/CustomProductServiceV2.0")
@XmlEnum
public enum RoleTypeEnumeration {

    @XmlEnumValue("FamilyTreeMember")
    FAMILY_TREE_MEMBER("FamilyTreeMember");
    private final String value;

    RoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleTypeEnumeration fromValue(String v) {
        for (RoleTypeEnumeration c: RoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
