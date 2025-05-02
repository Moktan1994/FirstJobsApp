package com.bny.review.impl;

import com.bny.review.ReviewRepository;
import com.bny.review.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void getAllReview() {
        reviewRepository.findAll();

    }
}
