import java.io.InputStream;
import java.net.Socket;

public class MinhaConexaoIndividual extends Thread {
	Socket conexao;
	public MinhaConexaoIndividual(Socket s) {
		conexao = s;
	}

	public void  run() {
		try {
			InputStream is = conexao.getInputStream();

			int c = -1;
			while ((c = is.read()) != -1) {
				System.out.print(((char) c));

			}

			is.close();
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
