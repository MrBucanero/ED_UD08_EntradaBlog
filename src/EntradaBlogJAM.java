/**
 * Clase para manejar las entradas de un blog.
 * @author Jose Albaladejo Maciá
 * @version 2.3
 * @since 14/03/2021
 *
 */
public class EntradaBlogJAM {
	/**
	 * separador es el carácter que separa ENTRADA DE del 
	 * nombre del autor
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	

	/**
	 * Constructor de la clase
	 * @param id número de entrada
	 * @param autor nombre del autor de la entrada
	 * @param texto texto que contiene la entrada
	 * @throws IllegalArgumentException Si el número es negativo
	 */
	public EntradaBlogJAM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}
	
	/**
	 * @return String con separador, texto y autor
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * @return Número de la entrada
	 */
	public int getId(){
		return this.id;
	}
	
	/** 
	 * @return Texto completo de la entrada
	 */
	public String getTexto(){
		return this.texto;
	}
	
	
	/**
	 * @return Nombre del autor de la entrada en mayúsculas
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * Ya no se usa. Mejor ver getAutor
	 * @return Nombre del autor
	 */
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * No tiene porqué tener argumentos.
	 * @param args argumentos línea de comandos
	 */
	public static void main(String[] args) {
		EntradaBlogJAM e1=new EntradaBlogJAM (3,"TU_NOMBRE","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}