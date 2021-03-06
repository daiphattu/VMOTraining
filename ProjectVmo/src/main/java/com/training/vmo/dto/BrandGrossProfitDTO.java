package com.training.vmo.dto;



import com.training.vmo.entity.CompanyInfo;
import com.training.vmo.entity.GrossProfit;

import java.time.Instant;
import java.util.ArrayList;

public class BrandGrossProfitDTO {

    private String id;

    private String brandId;

    private String bankCode;

    private ArrayList<String> settlementReportEmails;

    private ArrayList<String> dailyReportEmails;

    private GrossProfit grossProfit;

    private String taxId;

    private CompanyInfo companyInfo;

    private Boolean enable = true;

    private Instant createdDate;
    private Instant updatedDate;
    public BrandGrossProfitDTO() {
    }

    public BrandGrossProfitDTO(String id, String brandId, String bankCode, ArrayList<String> settlementReportEmails, ArrayList<String> dailyReportEmails, GrossProfit grossProfit, String taxId, CompanyInfo companyInfo, Boolean enable, Instant createdDate, Instant updatedDate) {
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
