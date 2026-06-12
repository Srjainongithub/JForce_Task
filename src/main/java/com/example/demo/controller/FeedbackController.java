package com.example.demo.controller;

import com.example.demo.model.Feedback;
import com.example.demo.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;

    @GetMapping
    public String dashboard(Model model) {
        model.addAttribute("feedbacks", feedbackRepository.findAll());
        model.addAttribute("editingFeedback", new Feedback());
        return "feedback";
    }

    @PostMapping("/save")
    public String saveFeedback(@ModelAttribute Feedback feedback) {
        if (feedback.getId() != null) {
            // Agar edit ho raha hai, toh database se purani date fetch karke barkrar rakhein
            Feedback oldFeedback = feedbackRepository.findById(feedback.getId()).orElse(null);
            if (oldFeedback != null) {
                feedback.setDate(oldFeedback.getDate());
            }
        } else {
            feedback.setDate(LocalDate.now());
        }
        feedbackRepository.save(feedback);
        return "redirect:/feedback";
    }

    @GetMapping("/edit/{id}")
    public String editFeedback(@PathVariable Long id, Model model) {
        Feedback fb = feedbackRepository.findById(id).orElse(new Feedback());
        model.addAttribute("feedbacks", feedbackRepository.findAll());
        model.addAttribute("editingFeedback", fb);
        return "feedback";
    }

    @GetMapping("/delete/{id}")
    public String deleteFeedback(@PathVariable Long id) {
        feedbackRepository.deleteById(id);
        return "redirect:/feedback";
    }
}