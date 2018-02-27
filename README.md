# dun-and-bradstreet-component
Dun &amp; Bradstreet component for elastic.io platform

## Description
Component exposes Dun &amp; Bradstreet API.

## Credentials
Access to the D&B Direct web services are secured by a **Username** and **Password** combination. D&B will issue your organization a production username upon completion of the contract establishment process. This username will be sent to the email address designated on the contract, along with instructions for setting up the password. This process will also be followed for production trial requests.
 
## Actions
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

[GetCleanseMatch Request documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/getcleansematch/soap-API)

[Get Company News Request documentation](https://docs.dnb.com/direct/2.0/en-US/newsandmedia/latest/orderproduct/news-soap-API)

[Match Request documentation](https://docs.dnb.com/direct/2.0/en-US/company/latest/match/soap-API)
