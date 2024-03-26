package mx.com.bank.AgenciaViajeTA.service;

import mx.com.bank.AgenciaViajeTA.dto.AnswerDTO;
import mx.com.bank.AgenciaViajeTA.dto.PermissionDTO;
import mx.com.bank.AgenciaViajeTA.dto.RoleDTO;
import mx.com.bank.AgenciaViajeTA.dto.UserDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RoleService {

    RoleDTO createRole(@RequestBody RoleDTO newUser);

    RoleDTO updateRole(@RequestBody RoleDTO updateUser);

    RoleDTO consultRole(Long id);

    AnswerDTO deleteRole(Long id);

    List<RoleDTO> getRole();
}
