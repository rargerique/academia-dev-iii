package academia.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import academia.entidades.User;
import academia.repositorios.UserRepository;
import java.util.Collections;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = userRepository.findFuncionarioByNome(name) != null ? userRepository.findFuncionarioByNome(name).get(0) : null;
        
        if (user == null) {
            throw new UsernameNotFoundException("Usuário não encontrado.");
        }

//        if (user.getTipoCadastro() == TipoCadastro.cliente) {
//            throw new UsernameNotFoundException("Cliente não autorizado a fazer login.");
//        }
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));

        return new org.springframework.security.core.userdetails.User(user.getNome(), user.getSenha(), Collections.emptyList());
    }

}
