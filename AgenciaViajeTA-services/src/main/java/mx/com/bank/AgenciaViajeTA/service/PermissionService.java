package mx.com.bank.AgenciaViajeTA.service;

import mx.com.bank.AgenciaViajeTA.dto.AnswerDTO;
import mx.com.bank.AgenciaViajeTA.dto.PermissionDTO;
import mx.com.bank.AgenciaViajeTA.dto.RoleDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface PermissionService {

    PermissionDTO createPermission(@RequestBody PermissionDTO newPermission);

    PermissionDTO updatePermission(@RequestBody PermissionDTO updatePermission);

    PermissionDTO consultPermission(Long id);

    AnswerDTO deletePermission(Long id);

    List<PermissionDTO> getPermission();
}
