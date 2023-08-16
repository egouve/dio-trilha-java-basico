package dioPack;

public class Usuário {
	public static void main(String[] args) throws Exception {
		
		SmartTv smartTv = new SmartTv();
		
		System.out.println("A TV está ligada? " + smartTv.ligada);
		System.out.println("Qual o canal atual? " + smartTv.canal);
		System.out.println("Qual o volume atual? " + smartTv.volume);
		
		smartTv.ligar ();
		System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
		
		smartTv.desligar ();
		System.out.println("Novo status - TV Ligada? " + smartTv.ligada);
		
		smartTv.aumentarVolume ();
		System.out.println("Novo Volume: " + smartTv.volume);
		
		smartTv.diminuirVolume ();
		System.out.println("Novo Volume: " + smartTv.volume);
		
		smartTv.aumentarCanal ();
		System.out.println("Novo Canal: " + smartTv.canal);
		
		smartTv.diminuirCanal ();
		System.out.println("Novo Volume: " + smartTv.canal);
		
		smartTv.mudarCanal(22);
		System.out.println("Novo Canal: " + smartTv.canal);
		}
	}
