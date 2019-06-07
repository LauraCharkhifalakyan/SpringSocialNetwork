package com.example.spring_social_network.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "friends")
public class Friends {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int friendId;

    @Column(name = "from_user_id")
    private int fromUserId;


    @Column(name = "to_user_id")
    private int toUserId;

    @Column
    private Date date;
}
