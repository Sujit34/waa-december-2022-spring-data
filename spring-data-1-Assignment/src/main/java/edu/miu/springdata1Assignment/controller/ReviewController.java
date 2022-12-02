package edu.miu.springdata1Assignment.controller;

import edu.miu.springdata1Assignment.dto.ReviewDto;
import edu.miu.springdata1Assignment.entity.Review;
import edu.miu.springdata1Assignment.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private ReviewService reviewService;

    @GetMapping
    public List<ReviewDto> findAll(){
        return reviewService.findAll();
    }
    @GetMapping("/{id}")
    public ReviewDto findById(@PathVariable int id){
        return reviewService.findById(id);
    }
    @PostMapping
    public void save(Review review){
        reviewService.save(review);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable int id, Review review){
        reviewService.update(id,review);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        reviewService.delete(id);
    }
}
