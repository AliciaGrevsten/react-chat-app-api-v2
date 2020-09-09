package com.javafullstackcourse.reactchatappapi.respositories;

import com.javafullstackcourse.reactchatappapi.models.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Integer> {

    Chat getById(int id);

}