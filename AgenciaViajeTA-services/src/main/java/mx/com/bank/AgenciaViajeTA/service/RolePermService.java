package mx.com.bank.AgenciaViajeTA.service;

import mx.com.bank.AgenciaViajeTA.dto.AnswerDTO;
import mx.com.bank.AgenciaViajeTA.dto.RolePermDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface RolePermService {

    RolePermDTO createRolePerm(@RequestBody RolePermDTO newRolePerm);

    RolePermDTO updateRolePerm(@RequestBody RolePermDTO updateRolePerm);

    RolePermDTO consultRolePerm(Long id);

    List<RolePermDTO> getRolePerm();

    AnswerDTO deleteRolePerm(Long id);
}
