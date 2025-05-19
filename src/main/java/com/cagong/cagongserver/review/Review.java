package com.cagong.cagongserver.review;

import com.cagong.cagongserver.cafe.Cafe;
import com.cagong.cagongserver.common.BaseEntity;
import com.cagong.cagongserver.member.Member;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Review extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    private int score;

    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
}
