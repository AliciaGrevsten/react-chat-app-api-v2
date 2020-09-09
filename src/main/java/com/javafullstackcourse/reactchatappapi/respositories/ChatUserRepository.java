package com.javafullstackcourse.reactchatappapi.respositories;

import com.javafullstackcourse.reactchatappapi.models.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatUserRepository extends JpaRepository<ChatUser, Integer> {

    ChatUser getById(int id);

    ChatUser getByUsername(String username);
}