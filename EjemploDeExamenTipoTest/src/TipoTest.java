
import java.util.Scanner;
import java.util.ArrayList;

public class TipoTest {

	public static void main(String[] args) {
		
		
	
		
			
		 //iniciamos la clase scanner para poder meter entradas por teclado
		Scanner sc = new Scanner(System.in);
		
	    //declaramos la variable puntos para usarla como contador, sera double por los decimales
		
		
		
	    double puntos = 0;
	    
	    int respAcertadas =0;
	    int respFalladas =0;
	    
	    
	   
	    ArrayList<String> preguntasFalladas = new ArrayList<String>(); 
	    ArrayList<String> preguntasAcertadas = new ArrayList<String>(); 
	    
	    
	    // declaramos la variable string donde meteremos las opciones de la pregunta
	    
	    
	    String Id;
	    
	    
	    String respuesta;
	    
	    // imprimimos un menu por pantalla del examen
	    System.out.println("\nTrabajo Morad El Mourabit tercera evaluacion:Cuestionario test cultura general \n\n");
	    
	    System.out.println("Nombre del alumno : ");
	    Id = sc.nextLine();
	    System.out.println(Id);
	    
	    System.out.println( 
	    		"  ********************INSTRUCCIONES********************** \n\n"
	    		+"  -------------------------------------------------------"
	    		+" \n * Solo tienes una oportunidad"
	    		+ "\n * Por cada respuesta correcta se suman 0,5 puntos."
	    		+ "\n * Por cada respuesta mal contestada se restan 0,1 puntos "
	    		+ "\n * Si no contestas y pulsas enter, la respuesta contara como  incorrecta y restará"
	    		+ "\n * Importante!!, si saltas la pregunta o metes una opcion no valida te la cuenta como Erronea"
	    		+ "\n * Minimo 5 puntos para aprobar \n  "
	    		+ "--------------------------------------------------------\n\n");
	    
	   
	   	
	   	
	    
	    //empezamos imprimiendo la pregunta y las respuestas por pantalla
	    System.out.println("1. ¿A qué período pertenece Quevedo?");
	    System.out.println("a)Generación del 27.\nb)Siglo de las Luces.\nc)Siglo de Oro.\nd)Generación del 98."); 
	    System.out.print("=> ");
	    //aqui usamos la variable declarada y el scanner para poder meter la letra de la respuesta
	    respuesta = sc.nextLine();
	    
	    /* usamos un condicional para igualar la letra introducida por teclado y ver si es igual a la letra correcta
	    con el metodo equals*/
	    
	    
	    
	    	
 		if (respuesta.equalsIgnoreCase("c")) {

	    	
	    //ponemos el contador para que sume de 0.5 en 0.5, para que si tienes bien las 20 preguntas se valore sobre 10 puntos.
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 1");
	      
	      
	      
	      // en caso de que la respuesta no sea correcta se restan -0.2 y se le informa al alumno del fallo con if else
	      
    
	   	
	    } else if (respuesta!=("c"))  {  
	    	
	    	  puntos-=0.1;
		      respFalladas++;
		      System.out.println("Respuesta Incorrecta, es la C");
		      preguntasFalladas.add("Pregunta 1");
    	
	    } 
	    
	    
	   
	    
	    
	    System.out.print("\n  ");
// repetimos el mismo proceso para las 20 preguntas
	    
	    System.out.println("2. El gentilicio de Tenerife es:");
	    System.out.println("a)Tenerifano.\nb)Tenerifeño.\nc)Tenerifaño.\n d)Tinerfeño."); 
	    System.out.print("=>  ");
	    respuesta = sc.nextLine();  
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 2");
	    
	    }else if (respuesta!="d"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la D");
	      preguntasFalladas.add("Pregunta 2");
	    }
	    System.out.print("\n  ");

	    System.out.println("3. ¿A qué ejército pertenecían los centuriones?");
	    System.out.println("a)Romano.\nb)Bizantino.\nc)Ruso.\nd)Griego."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 3");
	      
	    }else if (respuesta!="a") {
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 3");
	    }
	    System.out.print("\n  ");
	    
	    System.out.println("4. El aparato respiratorio está formado por: las fosas nasales, la boca, la faringe, la laringe, los bronquios y:");
	    System.out.println("a)El corazón.\nb)Los riñones.\nc)Los pulmones.\nd)El hígado."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("c")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 4");
	     
	    }else if (respuesta!="c") {
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la C");
	      preguntasFalladas.add("Pregunta 4");
	    }
	    System.out.print("\n  ");

	    
	    System.out.println("5. ¿Cómo se representa el número 2261 en números romanos?");
	    System.out.println("a)MMDLX.\nb) MMCCLXI.\nc) MMCCLXII.\nd)MMCLXIII."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("b")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 5");
	     
	    }else if (respuesta!="b"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la B");
	      preguntasFalladas.add("Pregunta 5");
	    }
	    System.out.print("\n  ");

	    System.out.println("6. La Segunda República se extendió entre los años:");
	    System.out.println("a)1932 - 1939.\nb)1931 - 1938. \nc)1932 - 1938. \nd)1931 - 1939."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 6");
	     
	    }else if (respuesta!="d") {
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la C");
	      preguntasFalladas.add("Pregunta 6");
	    }
	    System.out.print("\n  ");

	    System.out.println("7. ¿Qué tipo de construcción era el Coliseo de Roma?");
	    System.out.println("a)Castillo.\nb)Anfiteatro. \nc)Fortaleza. \nd)Templo"); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("b")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 7");
	    
	     
	    }else if (respuesta!="b"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la B");
	      preguntasFalladas.add("Pregunta 7");
	    }
	    System.out.print("\n  ");

	    System.out.println("8. ¿Cuál de las siguientes es considerada la mayor batalla marítima de la historia?");
	    System.out.println("a)Batalla de Lepanto\nb)Batalla del Ebro. \nc)Batalla de Waterloo. \nd)Batalla de Trafalgar."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 8");
	      
	    }else if (respuesta!="a"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 8");
	    }
	    System.out.print("\n  ");

	    
	    System.out.println("9. Beirut es la capital de:");
	    System.out.println("a)Maldivas.\nb)Nepal. \nc)Hawai. \nd)Libano."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 9");
	      
	    }else if (respuesta!="d"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la D");
	      preguntasFalladas.add("Pregunta 9");
	    }
	    System.out.print("\n  ");

	    System.out.println("10. El telégrafo eléctrico fue descubierto por:");
	    System.out.println("a)Roentgen.\nb)Edison. \nc)Bell. \nd)Morse"); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 10");
	    
	      
	    }else if (respuesta!="d"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la D");
	      preguntasFalladas.add("Pregunta 10");
	    }
	    System.out.print("\n  ");
	    
	    System.out.println("11. ¿Quién pintó \"Los Fusilamientos del Dos de Mayo\"?");
	    System.out.println("a)Tiziano.\nb)Francisco de Goya. \nc)Picasso. \nd)Matisse."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("b")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 11");
	      
	    }else if (respuesta!="b"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la B");
	      preguntasFalladas.add("Pregunta 11");
	    }
	    System.out.print("\n  ");

	    System.out.println("12. La dictadura de Franco ocurrió entre:");
	    System.out.println("a)1939 - 1975.\nb)1938 - 1974. \nc)1939 - 1974. \nd)1938 - 1975."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 12");
	      
	    }else if (respuesta!=("a")){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 12");
	    }
	    System.out.print("\n  ");
	    
	    System.out.println("13. ¿Dónde se encuentra el Palacio Taj Mahal?");
	    System.out.println("a)Rusia.\nb)China. \nc)India. \nd)Japón"); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("c")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 13");
	      
	    }else if (respuesta!="c"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la C");
	      preguntasFalladas.add("Pregunta 13");
	    }
	    
	    System.out.print("\n  ");

	    System.out.println("14.¿Cuál es el elemento químico cuyo símbolo es Pb?");
	    System.out.println("a)Plomo.\nb)Polonio. \nc)Platino. \nd)Praseodimio."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 14");
	     
	    }else if (respuesta!="a"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 14");
	    }
	    System.out.print("\n  ");

	    System.out.println("15. ¿Quién es el autor de \"El Principito\"?");
	    System.out.println("a)Lewis Carroll.\nb)Robert Louis Stevenson \nc)Albert Camus. \nd)Antoine de Saint- Exupéry."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 15");
	      
	    }else if (respuesta!="d"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la D");
	      preguntasFalladas.add("Pregunta 15");
	    }
	    System.out.print("\n  ");

	    System.out.println("16. ¿Quiénes se enfrentaron en la Batalla de las Termópilas?");
	    System.out.println("a)Las ciudades-estado griegas contra el Imperio persa.\n"
	    		+ "b)Las ciudades-estado griegas contra el Imperio inca. \n"
	    		+ "c)Las ciudades-estado romanas contra el Imperio persa. \n"
	    		+ "d)Las ciudades-estado romanas contra el Imperio bizantino."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 16");
	      
	    }else if (respuesta!="a"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 16");
	    }
	    System.out.print("\n  ");

	    System.out.println("17.El gentilicio de la provincia de Lugo es:");
	    System.out.println("a)Luguiano.\nb)Luano. \nc)Lucense. \nd)Luguense"); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("c")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 17");
	     
	    }else if (respuesta!="c"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la C");
	      preguntasFalladas.add("Pregunta 17");
	    }
	    System.out.print("\n  ");

	    
	    System.out.println("18.¿Con qué acontecimiento comienza la Edad Media?");
	    System.out.println("a)Caída del imperio bizantino.\nb)Caída del imperio romano de occidente. \nc)Las guerras púnicas. \nd)Las guerras carlistas."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("b")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 18");
	      
	    }else if (respuesta!="b"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la B");
	      preguntasFalladas.add("Pregunta 18");
	    }
	    System.out.print("\n  ");

	    
	    System.out.println("19.¿Qué nombre recibieron las guerras entre Roma y Cartago?");
	    System.out.println("a)Púnicas.\nb)Cartaginensas. \nc)Romanas. \nd)Peloponesas."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("a")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 19");
	      
	    }else if (respuesta!="a"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la A");
	      preguntasFalladas.add("Pregunta 19");
	    }
	    System.out.print("\n  ");
	    
	    System.out.println("20.La capital de Paraguay es:");
	    System.out.println("a)San Juan.\nb)Managua. \nc)Santo Domingo. \nd)Asunción."); 
	    System.out.print("=> ");
	    respuesta = sc.nextLine();
	    if (respuesta.equalsIgnoreCase("d")) {
	      puntos+=0.5;
	      respAcertadas++;
	      System.out.println("Respuesta Correcta");
	      preguntasAcertadas.add("Pregunta 20");
	      
	    }else if (respuesta!="d"){
	    	
	      puntos-=0.1;
	      respFalladas++;
	      System.out.println("Respuesta Incorrecta, es la D");
	      preguntasFalladas.add("Pregunta 20");
	      
	      
	    }
	   
    	
		
	    System.out.print("\n \n ");
	  
    	
	    
	    //aqui se informa al alumno de la puntacion obtenida, si esta suspenso o aprobado si la nota es mayor o igual a 5 pts.
	    
	 
	    
	    
	   
	    System.out.println("Preguntas falladas: " + respFalladas + " \n");
	    
	    
	    if(preguntasFalladas.size() > 0){
			for(String pregunta : preguntasFalladas){
			
				System.out.println(pregunta);
			}
		}
	    
	    System.out.println();
	    
	    System.out.println("\nPreguntas acertadas: "+ respAcertadas + " \n");
	    
	    if(preguntasAcertadas.size() > 0){
			for(String pregunta : preguntasAcertadas){
			
				System.out.println(pregunta);
			}
		}
	    
	    
	    
	    
	    
	    if ( puntos<=0) { System.out.println("\nSu nota es un : 0 es Insuficiente");} else if
	    
	     ( puntos<5 ) { System.out.println("Su nota es un : " + Math.round(puntos*100.0)/100.0 + " Insuficiente" + "\n tienes que estudiar más \n");
	   
	    
	    } else if(puntos>=5 && puntos <6) { System.out.println("Su nota es un :" + Math.round(puntos*100.0)/100.0 +  " Suficiente \n");
	    	
	    } else if(puntos>=6 && puntos <7) { System.out.println("Su nota es un :" + Math.round(puntos*100.0)/100.0 +  " Bien \n");
	    
	    }else if(puntos>=7 && puntos <9) { System.out.println("Su nota es un :" + Math.round(puntos*100.0)/100.0 +  " Notable \n");
	    
			}else if(puntos>=9 && puntos <=10) { System.out.println("Su nota es un :" + Math.round(puntos*100.0)/100.0 +  " Sobresaliente \n");}
	    
	    
		
	  sc.close();
	  
	    
	    System.out.println("Examen realizado por: "+ Id + "\n\n Gracias. Adios");
	  }
	}










