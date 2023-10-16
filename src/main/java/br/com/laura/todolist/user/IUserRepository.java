package br.com.laura.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

// primeiro parametro é a classe a qual o repositorio representa, e o segundo é o tipo do id
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
  UserModel findByUsername(String username);
}
