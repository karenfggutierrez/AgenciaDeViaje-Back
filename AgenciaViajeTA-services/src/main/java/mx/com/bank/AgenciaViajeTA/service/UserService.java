package mx.com.bank.AgenciaViajeTA.service;

import mx.com.bank.AgenciaViajeTA.dto.AirlineDTO;
import mx.com.bank.AgenciaViajeTA.dto.AnswerDTO;
import mx.com.bank.AgenciaViajeTA.dto.UserDTO;
import mx.com.bank.AgenciaViajeTA.model.UserEntity;
import mx.com.bank.AgenciaViajeTA.model.UserEntity2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserService {

    UserDTO createUser(@RequestBody UserDTO newUser);

    UserDTO updateUser(@RequestBody UserDTO updateUser);

    UserDTO consultUser(Long id);

    AnswerDTO deleteUser(Long id);

    List<UserDTO> getUsers();

    Page<UserEntity2> paginas(Pageable pageable);
}
