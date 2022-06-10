package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne;
    private Review reviewTwo;

    private ReviewRepositoryTest() {
        reviewOne = new Review(1L, "Review One","");
        reviewTwo = new Review(2L, "Review Two","");
    }

    @Test
    public void shouldFindReviewOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindBothReviews(){
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundBoth = underTest.findAll();
        assertThat(foundBoth).contains(reviewOne, reviewTwo);
    }

    @Test
    public void shouldRunTheTestWithImageStringBlank(){
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundBoth = underTest.findAll();
        assertThat(foundBoth).contains(reviewOne, reviewTwo);
    }
}
