package com.cagong.cagongserver.strip;

import com.cagong.cagongserver.cafe.Cafe;
import jakarta.persistence.*;

@Entity
public class Strip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "strip_id")
    private Long id;

    private int stripNumber;

    private boolean isActive;

    private int time;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
}
