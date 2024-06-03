package java1;
import java.util.Random;
public class atvjogo {
    public static void main (String[]args) {

        int casa = 0;
        int casa1 = 0;
        boolean finalizar = false;
        Random random = new Random();

        System.out.println("Bem vindo ao IDE");

        do {
            System.out.println("jogador 1 ");
            System.out.println("jogue o dado!");
            int dado = random.nextInt(6) + 1;

            System.out.printf("Seu lançe foi " + dado);
            casa += dado;

            switch (casa) {

                case 1:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Sua jornada começou ande 2 casas.\n");
                    break;

                case 2:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você brigou com pessoas que não concordavam com você. volte ao inicio da jornada.\n");
                    break;

                case 3:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você esta na America do Norte .\n");
                    break;

                case 4:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você encontrou uma ovelha perdida, leve ela de volta a casa ande 3 casas\n");
                    break;

                case 5:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você se perdeu na jornada volte 2 casas.\n");
                    break;

                case 6:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você perdeu a oportunidade de falar sobre a verdade para alguém, volte 3 casas.\n");
                    break;

                case 7:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você orou por pessoas e elas aceitaram a verdade. Ande 2 casas.\n");
                    break;

                case 8:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você pregou em um pais que persegue a verdade. Sua coragem será recompensada ande 3 casas\n");
                    break;


                case 9:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você esta indo bem . \n");
                    break;

                case 10:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Opa, Suas palavras foram censuradas. Volte 2 casas.\n");
                    break;

                case 11:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você esta chegando no continete Europeu. \n");
                    break;


                case 12:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Aqueles que são contra a verdade estão te difamando. Volte 3 casas. . \n");
                    break;

                case 13:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Voce esta chegando na Asia.\n");
                    break;

                case 14:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você deu um testemunho e 5 pessoas aceitaram a verdade. Agora temos mais peregrinos. Ande 3 casas. \n");
                    break;


                case 15:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" A verdade esta sendo espalhada. \n");
                    break;

                case 16:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você fez uma palestra que atingiu muitas pessoas. Ande 3 casas. \n");
                    break;

                case 17:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você mentiu. Volte 2 casas.\n");
                    break;

                case 18:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você se arrependeu de seus erros e decidiu mudar. Ande 3 casas. \n");
                    break;

                case 19:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("  Você encontrou a ambição e cometeu erros. Volte 3 casas.\n");
                    break;

                case 20:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Continue assim e todos vao conhecer a verdade\n");
                    break;

                case 21:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você liberou o perdão e ensinou os outros a perdoarem. Ande 3 casas.\n \n");
                    break;

                case 22:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Todos estao conhecendo a verdade \n");
                    break;

                case 23:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("  Você foi religioso. Volte 2 casas.\n");
                    break;

                case 24:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("continue libertando as pessoas com a verdade \n");
                    break;

                case 25:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" A verdade é libertadora.\n \n");
                    break;

                case 26:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você foi Hipócrita. Volte 2 casas.\n \n");
                    break;

                case 27:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("  Você fez seu primeiro batismo. Ande 3 casas.\n");
                    break;

                case 28:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println("Você encontrou um obstáculo teve medo e fugiu do desafio. Volte 3 casas.  \n");
                    break;

                case 29:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Voce chegou ate aqui parabens.\n \n");
                    break;


                case 30:
                    System.out.println("Voce esta na casa " + casa);
                    System.out.println(" Você chegou até aqui e permaneceu com coragem e fé parabéns. Você completou a jornada ande 1 casa.\n \n");
                    break;
            }

            int dado2 = random.nextInt(6) + 1;

            System.out.println("jogador 2 ");
            System.out.println("jogue o dado!");

            System.out.printf("Seu lançe foi" + dado2);
            casa1 += dado2;

            switch (casa1) {

                case 1:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Sua jornada começou ande 2 casas.\n");
                    break;

                case 2:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você brigou com pessoas que não concordavam com você. volte ao inicio da jornada.\n");
                    break;

                case 3:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você esta na America do Norte .\n");
                    break;

                case 4:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você encontrou uma ovelha perdida, leve ela de volta a casa ande 3 casas\n");
                    break;

                case 5:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você se perdeu na jornada volte 2 casas.\n");
                    break;

                case 6:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você perdeu a oportunidade de falar sobre a verdade para alguém, volte 3 casas.\n");
                    break;

                case 7:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você orou por pessoas e elas aceitaram a verdade. Ande 2 casas.\n");
                    break;

                case 8:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você pregou em um pais que persegue a verdade. Sua coragem será recompensada ande 3 casas\n");
                    break;


                case 9:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você esta indo bem . \n");
                    break;

                case 10:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Opa, Suas palavras foram censuradas. Volte 2 casas.\n");
                    break;

                case 11:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você esta chegando no continete Europeu. \n");
                    break;


                case 12:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Aqueles que são contra a verdade estão te difamando. Volte 3 casas. . \n");
                    break;

                case 13:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Voce esta chegando na Asia.\n");
                    break;

                case 14:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você deu um testemunho e 5 pessoas aceitaram a verdade. Agora temos mais peregrinos. Ande 3 casas. \n");
                    break;


                case 15:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" A verdade esta sendo espalhada. \n");
                    break;

                case 16:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você fez uma palestra que atingiu muitas pessoas. Ande 3 casas. \n");
                    break;

                case 17:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você mentiu. Volte 2 casas.\n");
                    break;

                case 18:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você se arrependeu de seus erros e decidiu mudar. Ande 3 casas. \n");
                    break;

                case 19:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("  Você encontrou a ambição e cometeu erros. Volte 3 casas.\n");
                    break;

                case 20:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Continue assim e todos vao conhecer a verdade\n");
                    break;

                case 21:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você liberou o perdão e ensinou os outros a perdoarem. Ande 3 casas.\n \n");
                    break;

                case 22:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Todos estao conhecendo a verdade \n");
                    break;

                case 23:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("  Você foi religioso. Volte 2 casas.\n");
                    break;

                case 24:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("continue libertando as pessoas com a verdade \n");
                    break;

                case 25:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" A verdade é libertadora. \n");
                    break;

                case 26:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você foi Hipócrita. Volte 2 casas.\n");
                    break;

                case 27:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("  Você fez seu primeiro batismo. Ande 3 casas.\n");
                    break;

                case 28:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println("Você encontrou um obstáculo teve medo e fugiu do desafio. Volte 3 casas.  \n");
                    break;

                case 29:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Voce chegou ate aqui parabens. \n");
                    break;


                case 30:
                    System.out.println("Voce esta na casa " + casa1);
                    System.out.println(" Você chegou até aqui e permaneceu com coragem e fé parabéns. Você completou a jornada ande 1 casa.\n \n");
                    break;
            }

            if (casa>=30) {
                System.out.printf("\n jogador 1 venceu");
                finalizar = true;
            } else if (casa1>=30) {
                System.out.printf("\n jogador 2 venceu");
                finalizar = true;
            }

        } while (finalizar != true);


            }

    }

