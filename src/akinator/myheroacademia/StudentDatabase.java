package akinator.myheroacademia;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

    public static List<Students_Characters> initializeStudents() {
        List<Students_Characters> students = new ArrayList<>();

        // Alunos Femininos
        students.add(new Students_Characters("Mina Ashido", true, true, true, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Tsuyu Asui", true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, true, true));
        students.add(new Students_Characters("Ochaco Uraraka", true, true, false, false, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Kyoka Jiro", true, true, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true));
        students.add(new Students_Characters("Toru Hagakure", true, true, false, false, true, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, true));
        students.add(new Students_Characters("Momo Yaoyorozu", true, true, false, false, false, false, true, false, false, false, false, false, true, false, false, true, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Nejire Hado", true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true, false, false, false, true, false, false, true)); // Adicionada

        // Alunos Masculinos
        students.add(new Students_Characters("Yuga Aoyama", false, true, false, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Tenya Iida", false, true, false, false, false, false, true, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, true));
        students.add(new Students_Characters("Mashirao Ojiro", false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Denki Kaminari", false, true, false, false, true, false, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Eijiro Kirishima", false, true, false, false, true, false, false, false, false, true, false, false, false, false, false, true, false, false, false, true, false, false, true));
        students.add(new Students_Characters("Koji Koda", false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Rikido Sato", false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Mezo Shoji", false, true, true, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Hanta Sero", false, true, false, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Fumikage Tokoyami", false, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true));
        students.add(new Students_Characters("Shoto Todoroki", false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true));
        students.add(new Students_Characters("Katsuki Bakugo", false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, true));
        students.add(new Students_Characters("Izuku Midoriya", false, true, false, true, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, false, true));
        students.add(new Students_Characters("Minorou Mineta", false, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true));
        students.add(new Students_Characters("Hitoshi Shinso", false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, true, false, false, true));
        students.add(new Students_Characters("Togata Mirio", false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, true, false, false, true, true, false, false, true));
        students.add(new Students_Characters("Amajiki Tamaki", false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, false, false, true, true));

        return students;
    }

    // Filtra os personagens com base nas respostas do usuário.
    public static void filter(List<Students_Characters> characters, int perguntaAtual, boolean resposta) {
        characters.removeIf(character -> {
            return switch (perguntaAtual) {
                case 0 -> character.isFemale() != resposta;
                case 1 -> character.isClass1A() != resposta;
                case 2 -> character.isHasNonHumanCharacteristics() != resposta;
                case 3 -> character.isHasMultipleQuirks() != resposta;
                case 4 -> character.isExtroverted() != resposta;
                case 5 -> character.isHasMarksOrTattoos() != resposta;
                case 6 -> character.isWearsHeadAccessory() != resposta;
                case 7 -> character.isWearsFaceAccessory() != resposta;
                case 8 -> character.isHasElectricityOrMagnetismQuirk() != resposta;
                case 9 -> character.isCanHardenBody() != resposta;
                case 10 -> character.isCanFloatOrManipulateGravity() != resposta;
                case 11 -> character.isCanGrowBodyParts() != resposta;
                case 12 -> character.isCanCamouflageOrBecomeInvisible() != resposta;
                case 13 -> character.isUsesTechnologyToAmplifyQuirk() != resposta;
                case 14 -> character.isUsesOrganicMaterial() != resposta;
                case 15 -> character.isSkilledInHandToHandCombat() != resposta;
                case 16 -> character.isManipulatesLiquidsOrSolids() != resposta;
                case 17 -> character.isWearsGlasses() != resposta;
                case 18 -> character.isFastOrClassLeader() != resposta;
                case 19 -> character.isConfidentAndArrogant() != resposta;
                case 20 -> character.isHasIceOrFireQuirk() != resposta;
                case 21 -> character.isHasAnimalLikeAppearance() != resposta;
                case 22 -> character.isFriendlyAndOptimistic() != resposta;
                default -> false;
            };
        });

        // Imprimir a lista de personagens após a filtragem para depuração
        System.out.println("Personagens restantes apos a pergunta " + (perguntaAtual + 1) + ": ");
        for (Students_Characters character : characters) {
            System.out.println(character.getName());
        }
    }
}
