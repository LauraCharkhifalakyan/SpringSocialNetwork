package com.example.spring_social_network.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "friend_request")
public class FriendRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int requestId;

    @Column(name = "from_id")
    private int fromId;

    @Column(name = "to_id")
    private int toId;

    @Column
    private Date date;
}
