package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review einsReview = new Review(1L,"Adventure Conqueror King", "https://i.imgur.com/eJKEVJV.png");
        Review zxeiReview = new Review(2L,"Anima:Beyond Fantasy", "https://i.imgur.com/tzgXj6C.png");
        Review dreiReview = new Review(3L,"Avatar Legends: The RPG", "https://i.imgur.com/SuELuGm.png");
        Review vierReview = new Review(4L, "Chronicles of Darkness" ,"https://i.imgur.com/utpEHvw.png");
        Review funfReview = new Review(5L,"Deadfire: Pillar of Eternity RPG", "https://i.imgur.com/F97YptG.png");
        Review sechsReview = new Review(6L, "Dungeon and Dragons 5E", "https://i.imgur.com/BUlPd1O.png");
        Review siebenReview = new Review(7L, "Duty And Honor", "https://i.imgur.com/cXo1mJw.png");
        Review achtReview = new Review(8L, "Fate Core System", "https://i.imgur.com/9YdaANJ.png");
        Review neunReview = new Review(9L, "Lancer", "https://i.imgur.com/G5QaMq0.png");
        Review zehnReview = new Review(10L,"Secure, Contain, Protect(SCP) RPG", "https://i.imgur.com/NlJ7rbY.png");
        Review elfReview = new Review(11L,"Star Trek Adventure", "https://i.imgur.com/vuMED6k.png");
        Review zwolfReview = new Review(12L,"Vampire the Masquerade", "https://i.imgur.com/s9lcO6a.png");

        reviewList.put(einsReview.getId(), einsReview);
        reviewList.put(zxeiReview.getId(), zxeiReview);
        reviewList.put(dreiReview.getId(), dreiReview);
        reviewList.put(vierReview.getId(), vierReview);
        reviewList.put(funfReview.getId(), funfReview);
        reviewList.put(sechsReview.getId(), sechsReview);
        reviewList.put(siebenReview.getId(), siebenReview);
        reviewList.put(achtReview.getId(), achtReview);
        reviewList.put(neunReview.getId(), neunReview);
        reviewList.put(zehnReview.getId(), zehnReview);
        reviewList.put(elfReview.getId(), elfReview);
        reviewList.put(zwolfReview.getId(), zwolfReview);
    }
    public Review findOne(long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }

    //For testing
    public ReviewRepository(Review ...reviewToAdd){
        for(Review reviews : reviewToAdd){
            reviewList.put(reviews.getId(), reviews);
        }
    }
}

