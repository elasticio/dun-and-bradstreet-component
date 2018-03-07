
package com.dnb.services.customproduct;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Records information on tangible items of value that a subject owns, holds, or manages. It may provide additional information, such  the details about specific assets, the asset's financial value, the asset's registration information, and identification of other subjects involved in the asset.
 *          
 * 
 * <p>Java class for FinancialAssetArticle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAssetArticle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssetArticleSummary" type="{http://services.dnb.com/CustomProductServiceV2.0}AssetArticleSummary" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AssetArticleDetail" type="{http://services.dnb.com/CustomProductServiceV2.0}AssetArticleDetailType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAssetArticle", namespace = "http://services.dnb.com/CustomProductServiceV2.0", propOrder = {
    "assetArticleSummary",
    "assetArticleDetail"
})
public class FinancialAssetArticle {

    @XmlElement(name = "AssetArticleSummary")
    protected List<AssetArticleSummary> assetArticleSummary;
    @XmlElement(name = "AssetArticleDetail")
    protected List<AssetArticleDetailType> assetArticleDetail;

    /**
     * Gets the value of the assetArticleSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetArticleSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetArticleSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetArticleSummary }
     * 
     * 
     */
    public List<AssetArticleSummary> getAssetArticleSummary() {
        if (assetArticleSummary == null) {
            assetArticleSummary = new ArrayList<AssetArticleSummary>();
        }
        return this.assetArticleSummary;
    }

    /**
     * Gets the value of the assetArticleDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetArticleDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetArticleDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetArticleDetailType }
     * 
     * 
     */
    public List<AssetArticleDetailType> getAssetArticleDetail() {
        if (assetArticleDetail == null) {
            assetArticleDetail = new ArrayList<AssetArticleDetailType>();
        }
        return this.assetArticleDetail;
    }

}
