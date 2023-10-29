package br.com.valmirsgama.todoList.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

    /**
     * Id
     * Usuário (ID-USUARIO)
     * Descrição
     * Título
     * Data de início
     * Data de termino
     * Prioridade
     */

@Data
@Entity(name = "tb_task")
public class TaskModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;

    @Column(length = 50) // limita o tamanho da coluna
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;

     private UUID idUser;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
