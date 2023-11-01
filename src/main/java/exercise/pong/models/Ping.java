package exercise.pong.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Ping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer entry;

    @Column(name = "ping_message",length = 255)
    private String ping;

    @Column(name = "pong_response",length = 255)
    private String pong;

    @Column(name = "created_at")
    private LocalDateTime created;

    @Column(name ="last_updated_at")
    private LocalDateTime last_updated;

}

