package com.kodilla.patterns.strategy;

import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class PublisherTestSuite {
    @Test
    public void testShare() {
        //Given
        Millenials facebookUser = new Millenials("Ardian");
        YGeneration twitterUser = new YGeneration("Kamil");
        ZGeneration snapchatUser = new ZGeneration("Kamila");

        //When
        String facebookPost = facebookUser.sharePost();
        System.out.println("Should be facebook: " + facebookPost);
        String twitterPost = twitterUser.sharePost();
        System.out.println("Should be  twitter: " + twitterPost);
        String snapchatPost = snapchatUser.sharePost();
        System.out.println("Should be snapchat: " + snapchatPost);

        //Then
        Assert.assertEquals("Sharing something on Facebook.", facebookPost);
        Assert.assertEquals("Sharing something on Twitter.", twitterPost);
        Assert.assertEquals("Sharing something on Snapchat.", snapchatPost);
    }
}
