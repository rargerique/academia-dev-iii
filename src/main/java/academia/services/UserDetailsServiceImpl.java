package academia.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import academia.entidades.User;
import academia.enums.TipoCadastro;
import academia.repositorios.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		User user = userRepository.findByNome(name) != null? userRepository.findByNome(name).get(0) : null;
		if(user==null){
			throw new UsernameNotFoundException("Usuário não encontrado.");
		}
		
		if(user.getTipoCadastro() == TipoCadastro.cliente){
			throw new UsernameNotFoundException("Cliente não autorizado a fazer login.");
		}
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		return new org.springframework.security.core.userdetails.User(user.getNome(), user.getSenha(), grantedAuthorities);
	}
	
	
	

}
