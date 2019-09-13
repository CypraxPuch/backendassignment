package com.backbase.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

    @JsonProperty("public_alias")
    private String publicAlias;
    @JsonProperty("private_alias")
    private String privateAlias;
    @JsonProperty("more_info")
    private String moreInfo;
    @JsonProperty("URL")
    private String url;
    @JsonProperty("image_URL")
    private String imageUrl;
    @JsonProperty("open_corporates_URL")
    private String openCorporatesUrl;
    @JsonProperty("corporate_location")
    private String corporateLocation;
    @JsonProperty("physical_location")
    private String physicalLocation;


    private String narrative;
    private List<String> comments;
    private List<String> tags;
    private List<String> images;
    private String where;

    public String getPublicAlias() {
        return publicAlias;
    }

    public void setPublicAlias(String publicAlias) {
        this.publicAlias = publicAlias;
    }

    public String getPrivateAlias() {
        return privateAlias;
    }

    public void setPrivateAlias(String privateAlias) {
        this.privateAlias = privateAlias;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOpenCorporatesUrl() {
        return openCorporatesUrl;
    }

    public void setOpenCorporatesUrl(String openCorporatesUrl) {
        this.openCorporatesUrl = openCorporatesUrl;
    }

    public String getCorporateLocation() {
        return corporateLocation;
    }

    public void setCorporateLocation(String corporateLocation) {
        this.corporateLocation = corporateLocation;
    }

    public String getPhysicalLocation() {
        return physicalLocation;
    }

    public void setPhysicalLocation(String physicalLocation) {
        this.physicalLocation = physicalLocation;
    }

    public String getNarrative() {
        return narrative;
    }

    public void setNarrative(String narrative) {
        this.narrative = narrative;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }
}
