import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	// 10.1.2.31

	public static void main(String[] args) {
		try {
			ServerSocket servidor = new ServerSocket(1111);
			System.out.println("Esperando conexao !!");
			while (true) {

				Socket s = servidor.accept();

				System.out.println("Conexao recebida !!!");
				
				new MinhaConexaoIndividual(s).start();


			}
			
			//servidor.close();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
