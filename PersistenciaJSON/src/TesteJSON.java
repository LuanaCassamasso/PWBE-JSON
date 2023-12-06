
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
public class TesteJSON {
	
	public static void main(String[] args) {
		 try {
			 ObjectMapper objeto = new ObjectMapper();
			 //obj para ultilizar na serializaçao
			 Pessoa pes = new Pessoa("Abel",45);
			 
			 
			 //serialidade o obj pes
			 String json = objeto.writeValueAsString(pes);
			 
			 System.out.println("objeto serializado");
			 System.out.println(json);
			 
			 //desserializaçao o JSON para o obj pes
			 Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			 System.out.println("JSON desserializado para obj Pessoa:");
			 System.out.println("Nome:" + desPessoa.getNome());
			 System.out.println("Idade:" + desPessoa.getIdade());
			 
		 }catch(Exception e ) {
			 e.printStackTrace();
		 }
	}

}
