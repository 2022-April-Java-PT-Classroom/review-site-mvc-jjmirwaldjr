package org.wecancoeit.reviews;


public class Review {

    private Long id;
    private String review;
    private String imageUrl;


    public Review(Long id, String name, String imageUrl) {
        this.id = id;
        this.review = name;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public String getReview() {
        return review;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
