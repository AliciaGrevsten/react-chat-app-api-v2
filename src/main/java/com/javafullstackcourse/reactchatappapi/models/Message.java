package com.javafullstackcourse.reactchatappapi.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer id;

    @Column
    public String message;

    @Column
    public Date sent = new java.sql.Timestamp(new Date().getTime());

    @ManyToOne
    public ChatUser fromUser;

    @ManyToOne
    public Chat chat;
}