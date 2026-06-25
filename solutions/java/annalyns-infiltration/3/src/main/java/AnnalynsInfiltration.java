class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    // archer = true && prisioner = false || false
    // archer = false && prisioner = true || true
    // archer = false && prisioner = false || false
    // archer = true && prisioner = true || false
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
            return !archerIsAwake && prisonerIsAwake;
    }

    // petDog = true || archer = false
    // petDog = false || prisioner = true || knight = false || archer = false
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake || !knightIsAwake && !archerIsAwake && prisonerIsAwake && !petDogIsPresent);
    }
}
