package com.training.vmo.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;

@Document(collection = "company_info")
public class CompanyInfo {
    @Field("name")
    private String name;
    @Field("address")
    private String address;
    @Field("subDistrict")
    private String subDistrict;
    @Field("district")
    private String district;
    @Field("province")
    private String province;
    @Field("postcode")
    @Size(max = 5)
    private String postcode;

    public CompanyInfo() {
    }

    public CompanyInfo(String name, String address, String subDistrict, String district, String province, String postcode) {
        this.name = name;
        this.address = address;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
