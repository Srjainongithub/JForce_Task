package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "feedback_text", length = 1000)
    private String feedbackText;

    private LocalDate date; // Date column ke liye field

    // PrePersist se jab bhi naya feedback save hoga, aaj ki date apne aap set ho jayegi
    @PrePersist
    protected void onCreate() {
        this.date = LocalDate.now();
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getFeedbackText() { return feedbackText; }
    public void setFeedbackText(String feedbackText) { this.feedbackText = feedbackText; }
    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}