package com.training.vmo.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;
import java.time.Instant;
import java.util.ArrayList;

@Document(collection = "brand_gross_profit")
public class BrandGrossProfit {
    @Id
    private String id;
    @Field("brand_id")
    @Size(max = 7)
    private String brandId;
    @Field("bank_code")
    private String bankCode;
    @Field("settlement_report_emails")
    private ArrayList<String> settlementReportEmails;
    @Field("daily_report_emails")
    private ArrayList<String> dailyReportEmails;
    @Field("gross_profit")
    private GrossProfit grossProfit;
    @Field("tax_id")
    private String taxId;
    @Field("company_info")
    private CompanyInfo companyInfo;
    @Field("enabled")
    private Boolean enable = true;

    @Field(name = "created_date")
    private Instant createdDate;

    @Field(name = "updated_date")
    private Instant updatedDate;

    public BrandGrossProfit() {
    }

    public BrandGrossProfit(String id, String brandId, String bankCode, ArrayList<String> settlementReportEmails, ArrayList<String> dailyReportEmails, GrossProfit grossProfit, String taxId, CompanyInfo companyInfo, Boolean enable, Instant createdDate, Instant updatedDate) {
        this.id = id;
        this.brandId = brandId;
        this.bankCode = bankCode;
        this.settlementReportEmails = settlementReportEmails;
        this.dailyReportEmails = dailyReportEmails;
        this.grossProfit = grossProfit;
        this.taxId = taxId;
        this.companyInfo = companyInfo;
        this.enable = enable;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public ArrayList<String> getSettlementReportEmails() {
        return settlementReportEmails;
    }

    public void setSettlementReportEmails(ArrayList<String> settlementReportEmails) {
        this.settlementReportEmails = settlementReportEmails;
    }

    public ArrayList<String> getDailyReportEmails() {
        return dailyReportEmails;
    }

    public void setDailyReportEmails(ArrayList<String> dailyReportEmails) {
        this.dailyReportEmails = dailyReportEmails;
    }

    public GrossProfit getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(GrossProfit grossProfit) {
        this.grossProfit = grossProfit;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public CompanyInfo getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(CompanyInfo companyInfo) {
        this.companyInfo = companyInfo;
    }

    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public Instant getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }
}
