package com.backbase.data.entity;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: gpucheta<br/>
 * Date: 9/14/19<br/>
 * Time: 1:47 PM<br/>
 * Generated to
 */
public class MetadataTest {

    private Metadata metadata;

    @Before
    public void setUp() throws Exception {
        metadata = new Metadata();
    }

    @Test
    public void getPublicAlias_NullAnd_NotNull() {
        assertNull(metadata.getPublicAlias());
        String publicAlias = "public_alias_01";
        metadata.setPublicAlias(publicAlias);
        assertNotNull(metadata.getPublicAlias());
        assertEquals(publicAlias, metadata.getPublicAlias());
    }

    @Test
    public void getPrivateAlias_NullAnd_NotNull() {
        assertNull(metadata.getPrivateAlias());
        String privateAlias = "private_alias_01";
        metadata.setPrivateAlias(privateAlias);
        assertNotNull(metadata.getPrivateAlias());
        assertEquals(privateAlias, metadata.getPrivateAlias());
    }

    @Test
    public void getMoreInfo_NullAnd_NotNull() {
        assertNull(metadata.getMoreInfo());
        String moreInfo = "more_info_01";
        metadata.setMoreInfo(moreInfo);
        assertNotNull(metadata.getMoreInfo());
        assertEquals(moreInfo, metadata.getMoreInfo());
    }

    @Test
    public void getUrl_NullAnd_NotNull() {
        assertNull(metadata.getUrl());
        String url = "url_01";
        metadata.setUrl(url);
        assertNotNull(metadata.getUrl());
        assertEquals(url, metadata.getUrl());
    }

    @Test
    public void getImageUrl_NullAnd_NotNull() {
        assertNull(metadata.getImageUrl());
        String imageUrl = "image_url_01";
        metadata.setImageUrl(imageUrl);
        assertNotNull(metadata.getImageUrl());
        assertEquals(imageUrl, metadata.getImageUrl());
    }

    @Test
    public void getOpenCorporatesUrl_NullAnd_NotNull() {
        assertNull(metadata.getOpenCorporatesUrl());
        String openCorporatesUrl = "open_corp_url_01";
        metadata.setOpenCorporatesUrl(openCorporatesUrl);
        assertNotNull(metadata.getOpenCorporatesUrl());
        assertEquals(openCorporatesUrl, metadata.getOpenCorporatesUrl());
    }

    @Test
    public void getCorporateLocation_NullAnd_NotNull() {
        assertNull(metadata.getCorporateLocation());
        String corporateLocation = "corporate_location_01";
        metadata.setCorporateLocation(corporateLocation);
        assertNotNull(metadata.getCorporateLocation());
        assertEquals(corporateLocation, metadata.getCorporateLocation());
    }

    @Test
    public void getPhysicalLocation_NullAnd_NotNull() {
        assertNull(metadata.getPhysicalLocation());
        String physicalLocation = "physical_location_01";
        metadata.setPhysicalLocation(physicalLocation);
        assertNotNull(metadata.getPhysicalLocation());
        assertEquals(physicalLocation, metadata.getPhysicalLocation());
    }

    @Test
    public void getNarrative_NullAnd_NotNull() {
        assertNull(metadata.getNarrative());
        String narrative = "narrative_01";
        metadata.setNarrative(narrative);
        assertNotNull(metadata.getNarrative());
        assertEquals(narrative, metadata.getNarrative());
    }

    @Test
    public void getComments_NullAnd_NotNull() {
        assertNull(metadata.getComments());
        metadata.setComments(Arrays.asList("comments_01", "comments_02"));
        assertNotNull(metadata.getComments());
        assertEquals("comments_01", metadata.getComments().get(0));
    }

    @Test
    public void getTags_NullAnd_NotNull() {
        assertNull(metadata.getTags());
        metadata.setTags(Arrays.asList("tag_01", "tag_02"));
        assertNotNull(metadata.getTags());
        assertEquals("tag_01", metadata.getTags().get(0));
    }

    @Test
    public void getImages_NullAnd_NotNull() {
        assertNull(metadata.getImages());
        metadata.setImages(Arrays.asList("image_01", "image_02"));
        assertNotNull(metadata.getImages());
        assertEquals("image_01", metadata.getImages().get(0));
    }

    @Test
    public void getWhere_NullAnd_NotNull() {
        assertNull(metadata.getWhere());
        String where = "where_01";
        metadata.setWhere(where);
        assertNotNull(metadata.getWhere());
        assertEquals(where, metadata.getWhere());
    }
}