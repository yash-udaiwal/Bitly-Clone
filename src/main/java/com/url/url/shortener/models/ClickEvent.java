package com.url.url.shortener.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="clickevents")
public class ClickEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate clickDate;

    @ManyToOne
    @JoinColumn(name = "url_mapping_id")
    private URLMapping urlMapping;
}
