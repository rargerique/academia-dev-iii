package academia.controller;

import academia.entidades.Funcionario;
import academia.entidades.Matricula;
import academia.entidades.User;
import academia.repositorios.api.FuncionarioApiRepository;
import academia.repositorios.api.MatriculaApiRepository;
import academia.repositorios.api.UserApiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @Autowired
    private UserApiRepository userApiRepository;

    @Autowired
    private MatriculaApiRepository matriculaApiRepository;
    
    @Autowired
    private FuncionarioApiRepository funcionarioApiRepository;

    @RequestMapping("/api/usersFuncionario")
    @ResponseBody
    public List<User> getUserFuncionario() {
        return userApiRepository.findByFuncionario();
    }
    
    @RequestMapping("/api/matriculas")
    @ResponseBody
    public List<Matricula> getMatriculas() {
        return matriculaApiRepository.findAll();
    }
    
    @RequestMapping("/api/funcionarios")
    @ResponseBody
    public List<Funcionario> getFuncionarios() {
        return funcionarioApiRepository.findAll();
    }

}
