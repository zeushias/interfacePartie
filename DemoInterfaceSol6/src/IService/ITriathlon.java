package IService;

public interface ITriathlon {

	abstract void courir();
	
	abstract void nager();
	
	default void pedaler() {
		System.out.println("Je sais pédaler");
	}
}
