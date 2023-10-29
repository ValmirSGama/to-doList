package br.com.valmirsgama.todoList.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // @Getter and @Setter fornecido pelo lombok, aplicável tanto na classe quanto apenas no atributo
@Entity(name = "tb_users" ) // Criar uma tabela no banco de dados
public class UserModel {

    @Id // Identificador da chave primaria do banco de dados
    @GeneratedValue(generator = "UUID") // Gerador de UUID automatico
    private UUID id; // UUID é mais seguro que o id sequencial do banco de dados

    @Column(unique = true) // define uma constraint/unicidade em coluna
    private String userName;
    private String name;
    private String password;
 
    @CreationTimestamp // Define a data de criacao do objeto no banco de dados
    private LocalDateTime createdAt; // Define a data de criacao do objeto
}
