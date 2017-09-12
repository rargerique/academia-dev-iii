package academia;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping("/cliente")
	public Cliente addCliente(@RequestParam(value="name", defaultValue="World") String name){
		Cliente cliente = new Cliente();
		cliente.setId(counter.incrementAndGet());
		cliente.setNome(name);
		return cliente;
	}
}
