package IService;

public interface IJeu {

	default void jouer() {
		System.out.println("Je sais jouer");
	}
}
