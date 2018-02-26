
package com.dnb.services.entitylist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InclusionParameterenum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InclusionParameterenum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OrganizationName"/>
 *     &lt;enumeration value="StockExchangeTickerName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InclusionParameterenum", namespace = "http://services.dnb.com/EntityListServiceV2.0")
@XmlEnum
public enum InclusionParameterenum {

    @XmlEnumValue("OrganizationName")
    ORGANIZATION_NAME("OrganizationName"),
    @XmlEnumValue("StockExchangeTickerName")
    STOCK_EXCHANGE_TICKER_NAME("StockExchangeTickerName");
    private final String value;

    InclusionParameterenum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InclusionParameterenum fromValue(String v) {
        for (InclusionParameterenum c: InclusionParameterenum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
