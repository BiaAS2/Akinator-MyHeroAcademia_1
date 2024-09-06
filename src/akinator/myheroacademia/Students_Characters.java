
package akinator.myheroacademia;
/* @author Beatriz Alves */

public class Students_Characters {
    private String name;
    private boolean isFemale; // "Este personagem é uma mulher?"
    private boolean isClass1A; // "Este personagem pertence à Classe 1-A?"
    private boolean hasNonHumanCharacteristics; // "Este personagem tem características não-humanas ou é parcialmente animal?"
    private boolean hasMultipleQuirks; // "Este personagem tem mais de uma individualidade (como 2 ou mais poderes)?"
    private boolean isExtroverted; // "Este personagem tem uma personalidade extrovertida?"
    private boolean hasMarksOrTattoos; // "Este personagem possui alguma marca, cicatriz ou tatuagem?"
    private boolean wearsHeadAccessory; // "Este personagem utiliza algum acessório na cabeça (como chapéu, capacete, etc.)?"
    private boolean wearsFaceAccessory; // "Este personagem utiliza algum acessório no rosto (como máscara, óculos, etc.)?"
    private boolean hasElectricityOrMagnetismQuirk; // "Este personagem tem uma individualidade que envolve a manipulação de eletricidade ou magnetismo?"
    private boolean canHardenBody; // "Este personagem pode endurecer partes do corpo como forma de defesa?"
    private boolean canFloatOrManipulateGravity; // "Este personagem é capaz de flutuar ou manipular a gravidade?"
    private boolean canGrowBodyParts; // "Este personagem possui uma individualidade que permite crescer partes adicionais do corpo (como múltiplos braços ou olhos)?"
    private boolean canCamouflageOrBecomeInvisible; // "Este personagem tem uma habilidade que permite se camuflar ou se tornar invisível?"
    private boolean usesTechnologyToAmplifyQuirk; // "Este personagem usa tecnologia para amplificar a sua individualidade, como áudio ou equipamentos especiais?"
    private boolean usesOrganicMaterial; // "Este personagem tem uma individualidade que envolve o uso de um material orgânico ou de construção, como fitas ou lodo?"
    private boolean skilledInHandToHandCombat; // "Este personagem tem habilidades em combate corpo a corpo?"
    private boolean manipulatesLiquidsOrSolids; // "Este personagem é conhecido por uma individualidade que envolve criação ou manipulação de líquidos ou sólidos?"
    private boolean wearsGlasses; // "Este personagem usa óculos como parte de seu traje ou estilo pessoal?"
    private boolean isFastOrClassLeader; // "Este personagem é conhecido por sua velocidade ou por ser líder da Classe 1-A?"
    private boolean isConfidentAndArrogant; // "Este personagem é extremamente confiante, frequentemente arrogante, mas é conhecido por suas habilidades explosivas?"
    private boolean hasIceOrFireQuirk; // "Este personagem tem uma individualidade que envolve criar ou manipular gelo ou fogo?"
    private boolean hasAnimalLikeAppearance; // "Este personagem é conhecido por ter uma aparência ou estilo de luta que lembra um animal?"
    private boolean isFriendlyAndOptimistic; // "Este personagem é conhecido por ser extremamente amigável e otimista, mesmo em situações difíceis?"

    public Students_Characters(String name, boolean isFemale, boolean isClass1A, boolean hasNonHumanCharacteristics, boolean hasMultipleQuirks, boolean isExtroverted,
            boolean hasMarksOrTattoos, boolean wearsHeadAccessory, boolean wearsFaceAccessory, boolean hasElectricityOrMagnetismQuirk, boolean canHardenBody,
            boolean canFloatOrManipulateGravity, boolean canGrowBodyParts, boolean canCamouflageOrBecomeInvisible, boolean usesTechnologyToAmplifyQuirk,
            boolean usesOrganicMaterial, boolean skilledInHandToHandCombat, boolean manipulatesLiquidsOrSolids, boolean wearsGlasses, boolean isFastOrClassLeader,
            boolean isConfidentAndArrogant, boolean hasIceOrFireQuirk, boolean hasAnimalLikeAppearance, boolean isFriendlyAndOptimistic) {
        this.name = name;
        this.isFemale = isFemale;
        this.isClass1A = isClass1A;
        this.hasNonHumanCharacteristics = hasNonHumanCharacteristics;
        this.hasMultipleQuirks = hasMultipleQuirks;
        this.isExtroverted = isExtroverted;
        this.hasMarksOrTattoos = hasMarksOrTattoos;
        this.wearsHeadAccessory = wearsHeadAccessory;
        this.wearsFaceAccessory = wearsFaceAccessory;
        this.hasElectricityOrMagnetismQuirk = hasElectricityOrMagnetismQuirk;
        this.canHardenBody = canHardenBody;
        this.canFloatOrManipulateGravity = canFloatOrManipulateGravity;
        this.canGrowBodyParts = canGrowBodyParts;
        this.canCamouflageOrBecomeInvisible = canCamouflageOrBecomeInvisible;
        this.usesTechnologyToAmplifyQuirk = usesTechnologyToAmplifyQuirk;
        this.usesOrganicMaterial = usesOrganicMaterial;
        this.skilledInHandToHandCombat = skilledInHandToHandCombat;
        this.manipulatesLiquidsOrSolids = manipulatesLiquidsOrSolids;
        this.wearsGlasses = wearsGlasses;
        this.isFastOrClassLeader = isFastOrClassLeader;
        this.isConfidentAndArrogant = isConfidentAndArrogant;
        this.hasIceOrFireQuirk = hasIceOrFireQuirk;
        this.hasAnimalLikeAppearance = hasAnimalLikeAppearance;
        this.isFriendlyAndOptimistic = isFriendlyAndOptimistic;
    }

    // Getters
    public String getName() { return name; }
    public boolean isFemale() { return isFemale; }
    public boolean isClass1A() { return isClass1A; }
    public boolean isHasNonHumanCharacteristics() { return hasNonHumanCharacteristics; }
    public boolean isHasMultipleQuirks() { return hasMultipleQuirks; }
    public boolean isExtroverted() { return isExtroverted; }
    public boolean isHasMarksOrTattoos() { return hasMarksOrTattoos; }
    public boolean isWearsHeadAccessory() { return wearsHeadAccessory; }
    public boolean isWearsFaceAccessory() { return wearsFaceAccessory; }
    public boolean isHasElectricityOrMagnetismQuirk() { return hasElectricityOrMagnetismQuirk; }
    public boolean isCanHardenBody() { return canHardenBody; }
    public boolean isCanFloatOrManipulateGravity() { return canFloatOrManipulateGravity; }
    public boolean isCanGrowBodyParts() { return canGrowBodyParts; }
    public boolean isCanCamouflageOrBecomeInvisible() { return canCamouflageOrBecomeInvisible; }
    public boolean isUsesTechnologyToAmplifyQuirk() { return usesTechnologyToAmplifyQuirk; }
    public boolean isUsesOrganicMaterial() { return usesOrganicMaterial; }
    public boolean isSkilledInHandToHandCombat() { return skilledInHandToHandCombat; }
    public boolean isManipulatesLiquidsOrSolids() { return manipulatesLiquidsOrSolids; }
    public boolean isWearsGlasses() { return wearsGlasses; }
    public boolean isFastOrClassLeader() { return isFastOrClassLeader; }
    public boolean isConfidentAndArrogant() { return isConfidentAndArrogant; }
    public boolean isHasIceOrFireQuirk() { return hasIceOrFireQuirk; }
    public boolean isHasAnimalLikeAppearance() { return hasAnimalLikeAppearance; }
    public boolean isFriendlyAndOptimistic() { return isFriendlyAndOptimistic; }
    
    @Override
    public String toString() {
        return name; // Retorna o nome do personagem
    }
}
