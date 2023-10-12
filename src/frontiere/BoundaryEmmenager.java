package frontiere;

import java.util.Scanner;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					System.out.println("Bienvenue Villageois" + nomVisiteur);
					question.append("Quel est votre Force ? ");
					}
					break;

				default:
					System.out.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		question.append("Bienvenue Druide" + nomVisiteur);
		question.append("Quel est votre force");
		Scanner scan = new Scanner(System.in);
		String ForceDruide = scan.nextLine();
		while(effetPotionMax < effetPotionMin) {					
			question.append("Quelle est la force de potion la plus faible que vous produisez ?");
			String effetPotionMin = scan.nextLine();
			question.append("Quelle est la force de potion la plus faible que vous produisez ?");
			String effetPotionMax = scan.nextLine();
		}
		System.out.println("Attention Druide, vous vous �tes tromp� entre le minimum et le maximum");
}
