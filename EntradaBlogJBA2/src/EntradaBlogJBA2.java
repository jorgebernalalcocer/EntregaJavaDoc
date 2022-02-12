

/**
 * @author jorge
 * sabado febrero 2022
 * prueba javaDoc
 * versión 3.0
 *
 */
public class EntradaBlogJBA2 {
	//separador es el ccarácter que separa ENTRADA DE del
	//nombre del autor
	
	/**
	 * Se crea un char separador de comillas
	 * 
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	
	public EntradaBlogJBA2(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
/**
 * Metodo to String	
 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	
	/** 
	 * @return int
	 */
	//Devuelve el número de la entrada
	public int getId(){
		return this.id;
	}
	
	
	/** 
	 * @return String
	 */
	//devuelve el texto completo de la entrada
	public String getTexto(){
		return this.texto;
	}
	
	
	//devuelve el nombre del autor de la entrada en mayúsculas
	/**
	 * @return
	 * Se ha eliminado el otro método get, por lo que se utiliza este
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	

	
	/**
	 * @param args
	 * Es obligatorio meter valor positivo en el int
	 */
	public static void main(String[] args) {
               
		EntradaBlogJBA2 e1=new EntradaBlogJBA2 (2,"ana","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}
