package ed.listas;

public class SingleListClient {

	public static void main(String[] args) {
		
		SingleList<Integer> listaSimple = new SingleList<>();
		
		listaSimple.add(45);
		listaSimple.add(78);
		listaSimple.add(12);
		listaSimple.add(65);
		listaSimple.add(23);
		listaSimple.add(90);
		
		listaSimple.print();
		
		listaSimple.deleteLast();
		
		listaSimple.print();
		
		listaSimple.deleteLast();
		
		listaSimple.print();
		
		System.out.println("Exito");
		
	}
	
}
