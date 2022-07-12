package com.training.entities;

import com.training.EntityBase;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;
import java.util.ArrayList;

@Document( collection = "BrandGrossProfit" )
public class BrandGrossProfit extends EntityBase {
    @Id
    private String id;
    private String brandId;

    private String bankCode;

    private ArrayList<String> settlementReportEmails;

    private ArrayList<String> dailyReportEmails;

    private GrossProfit grossProfit;

    private String taxId;

    private CompanyInfo companyInfo;

    private Boolean enable = true;

    public BrandGrossProfit() {
    }

    public BrandGrossProfit(String id, String brandId, String bankCode, ArrayList<String> settlementReportEmails, ArrayList<String> dailyReportEmails, GrossProfit grossProfit, String taxId, CompanyInfo companyInfo, Boolean enable) {
        this.id = id;
        this.brandId = brandId;
        this.bankCode = bankCode;
        this.settlementReportEmails = settlementReportEmails;
        this.dailyReportEmails = dailyReportEmails;
        this.grossProfit = grossProfit;
        this.taxId = taxId;
        this.companyInfo = companyInfo;
        this.enable = enable;
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
}
