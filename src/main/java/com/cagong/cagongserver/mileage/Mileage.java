package com.cagong.cagongserver.mileage;

import com.cagong.cagongserver.cafe.Cafe;
import com.cagong.cagongserver.common.BaseEntity;
import com.cagong.cagongserver.member.Member;
import jakarta.persistence.*;

@Entity
public class Mileage extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mileage_id")
    private Long id;

    private int point;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "cafe_id")
    private Cafe cafe;
}
