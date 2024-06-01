import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Cliente> clientes = new ArrayList<>();

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }
}

