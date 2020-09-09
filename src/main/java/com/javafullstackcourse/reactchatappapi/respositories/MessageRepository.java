package com.javafullstackcourse.reactchatappapi.respositories;

import com.javafullstackcourse.reactchatappapi.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    Message getById(int id);
}
