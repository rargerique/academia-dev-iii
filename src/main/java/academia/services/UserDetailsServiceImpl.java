package academia.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import academia.entidades.Cliente;
import academia.enums.TipoCadastro;
import academia.repositorios.ClienteRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
		Cliente cliente = clienteRepository.findByNome(name) != null? clienteRepository.findByNome(name).get(0) : null;
		if(cliente==null){
			throw new UsernameNotFoundException("Usuário não encontrado.");
		}
		
		if(cliente.getTipoCadastro() == TipoCadastro.cliente){
			throw new UsernameNotFoundException("Cliente não autorizado a fazer login.");
		}
		
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		return new User(cliente.getNome(), cliente.getSenha(), grantedAuthorities);
	}
	
	
	

}
