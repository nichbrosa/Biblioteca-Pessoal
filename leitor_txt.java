import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class leitor_txt {
		//programa pega o arquivo do que estiver dentro de um txt e puxa pro programa transformando numa string
		public static void main(String[] args) throws IOException {
			BufferedReader bf = new BufferedReader(
					new FileReader("C:\\Users\\Nícholas\\Desktop\\Texto.txt"));
		String s;
		//enquanto o que estiver no .txt nao for nulo ele escrevera o que estiver la
		while((s=bf.readLine()) != null){
			System.out.println(s);
		}
	}
}
