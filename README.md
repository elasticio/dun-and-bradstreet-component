# dun-and-bradstreet-component
Dun &amp; Bradstreet component for elastic.io platform

## Description
Component exposes Dun &amp; Bradstreet API.

## Credentials
Access to the D&B Direct web services are secured by a **Username** and **Password** combination. D&B will issue your organization a production username upon completion of the contract establishment process. This username will be sent to the email address designated on the contract, along with instructions for setting up the password. This process will also be followed for production trial requests.

**Note:** in some cases your developer account must be registered as US located one. As soon as some services are not available in other countries. 
## Actions
### Business Background Report
D&B's Business Background Report provides details about the operations of a company, its history, and business background of its management.

**`OrderCompanyReportRequest. OrderCompanyReportRequestDetail. ProductSpecification. DNBProductID` must be equal to `BBR`**

Request JSON schema `schemas/json/Report/BusinessBackgroundReport.in.json`

### Business Information Report
D&B’s Business Information Report is our most popular and widely used information product for determining a company's profitability, stability, viability, and payment performance. It is recognized within the credit management community as the standard for evaluating both new and existing credit relationships, particularly medium-to-high risk accounts. Information found in this report also supports general company research and decision-making in a range of other functions, such as marketing, underwriting, legal services, and purchasing.

**`OrderCompanyReportRequest. OrderCompanyReportRequestDetail. ProductSpecification. DNBProductID` must be equal to `BIR`**

Request JSON schema `schemas/json/Report/BusinessInformationReport.in.json`

### Cleanse and Standardize
The D&B Direct API provides address standardization in two features: On-Demand Single Entity Resolution and On-Demand Address Cleanse & Update. The purpose of these features is to produce machine sortable mailing addresses that are optimized for accurate and quick delivery.

The On-Demand Address Cleanse & Update feature only performs the address cleanup service. To locate a D-U-N-S Numbers while cleansing address records, refer to the On-Demand Single Entity Resolution feature.

Request JSON schema `schemas/json/CompanyService/CleanseAndStandardize.in.json`

### Compact report
Concise information for making decisions fast. Three years financial comparisons, D&B Rating and a 'maximum credit recommendation' are included to help you set credit limits. 

**`OrderCompanyReportRequest. OrderCompanyReportRequestDetail. ProductSpecification. DNBProductID` must be equal to `CPTR`**

Request JSON schema `schemas/json/Report/CompactReport.in.json`

### Comprehensive report
D&B's Comprehensive Report is our most complete risk management report, designed to help you assess new and existing business relationships where the large-dollar and/or long-term nature of the commitment pose a significant risk or opportunity to your business. This report combines the background, payments and financial information from the Business Information Report with the power of D&B's predictive scores and ratings, helping you determine both the current profile and future outlook for an account.

**`OrderCompanyReportRequest. OrderCompanyReportRequestDetail. ProductSpecification. DNBProductID` must be equal to `COMPR`**

Request JSON schema `schemas/json/Report/ComprehensiveReport.in.json`

### Find Competitors
Returns all the competitors for a given company. 

Request JSON schema `schemas/json/EntityList/FindCompetitor.in.json`

### Get Cleanse Match
Also known as Match and Cleanse

The D&B Direct API provides address standardization in two features: On-Demand Single Entity Resolution and On-Demand Address Cleanse & Update. The purpose of these features is to produce machine sortable mailing addresses that are optimized for accurate and quick delivery.

The On-Demand Single Entity Resolution feature provides the added service of matching the resulting "cleansed" information to the D&B database for the purpose of locating a D-U-N-S Number. To access the address cleansing services without the additional lookup, refer to the On-Demand Address Cleanse & Update feature.

Request JSON schema `schemas/json/CompanyService/GetCleanseMatch.in.json`

### Get Company News
Also known as Company News

Returns news items for a given D-U-N-S Number.

Request JSON schema `schemas/json/NewsAndMediaProductService/GetCompanyNews.in.json`

### Match
On-Demand Entity Identification. Also known as Match. 

Request JSON schema `schemas/json/CompanyService/Match.in.json`

## Triggers
No triggers.
## Dun &amp; Bradstreet API links
[Dun &amp; Bradstreet documentation](https://docs.dnb.com/direct/2.0/en-US/quick-soap-API)

[Business Information Report documentation](https://docs.dnb.com/direct/2.0/en-US/report/latest/ordercompanyreport/bir-soap-API)

[Cleanse and Standardize documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/standardize/soap-API)

[Compact Report documentation](https://docs.dnb.com/direct/2.0/en-US/report/latest/ordercompanyreport/cmpct-soap-API)

[Comprehensive Report documentation](https://docs.dnb.com/direct/2.0/en-US/report/latest/ordercompanyreport/cmprhnsv-soap-API)

[GetCleanseMatch documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/getcleansematch/soap-API)

[Get Company News documentation](https://docs.dnb.com/direct/2.0/en-US/newsandmedia/latest/orderproduct/news-soap-API)

[Match documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/match/soap-API)

