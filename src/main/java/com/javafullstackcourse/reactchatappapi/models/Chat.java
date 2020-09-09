package com.javafullstackcourse.reactchatappapi.models;

import javax.persistence.*;

@Entity
public class Chat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @ManyToOne
    public ChatUser userOne;

    @ManyToOne
    public ChatUser userTwo;

}
