package revisaozinha01.main;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		int idade = 15;

		System.out.println("A idade do infeliz é" + idade + ".");

		idade = (idade + 5) * 2;

		System.out.println("A idade do segundo infeliz é" + idade + ".");

		idade = idade - 5;

		System.out.println("A idade do terceiro infeliz é" + idade + ".");

		if (idade > 20) {
			System.out.println("A idade do infeliz é maior que 20.");
		} else {
			System.out.println("A idade do infeliz é menor que 20.");
		}
	}

}
