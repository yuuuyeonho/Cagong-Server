package com.cagong.cagongserver.menu;

import com.cagong.cagongserver.cafe.Cafe;
import jakarta.persistence.*;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;

    private String name;

    private int price;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
}
