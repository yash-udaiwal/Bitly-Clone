package com.url.url.shortener.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class URLMapping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originalUrl;
    private String shortUrl;
    private int clickCount = 0;
    private LocalDate createdDate;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;  //means many url mapping can belong to one user // foreign key linking

    @OneToMany(mappedBy = "urlMapping")
    private List<ClickEvent> clickEvents;  //
}
