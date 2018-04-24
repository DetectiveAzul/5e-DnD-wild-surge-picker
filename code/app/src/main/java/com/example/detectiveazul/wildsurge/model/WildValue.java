package com.example.detectiveazul.wildsurge.model;

public enum WildValue {
    ONE("Roll on this table at the start of each of your turns for the next minute, ignoring this result on subsequent rolls"),
    TWO("For the next minute, you can see any invisible creature if you have line of sight to it"),
    THREE("A modron chosen and controlled by the DM appears in an unoccupied space within 5 feet of you, then disappears 1 minute later"),
    FOUR("You cast fireball as a 3rd level spell centered on yourself"),
    FIVE("You cast magic missile as a 5th-level spell"),
    SIX("Roll a d10. Your height changes by a number of inches equal to the roll. If the roll is odd, you shrink. If the roll is even, you grow"),
    SEVEN("You cast confusion centered on yourself"),
    EIGHT("For the next minute, you regain 5 hit points at the start of each of your turns"),
    NINE("You grow a long beard made of feathers that remains until you sneeze, at which point the feathers explode out from your face"),
    TEN("You cast grease centered on yourself"),
    ELEVEN("Creatures have disadvantage on saving throws against the next spell you cast in the next minute that involves a saving throw"),
    TWELVE("Your skin turns a vibrant shade of blue. A remove curse spell can end this effect"),
    THIRTEEN("An eye appears on your forehead for the next minute. During this time, you have advantage on Wisdom (Perception) checks that rely on sight"),
    FOURTEEN("For the next minute, all your spells with a casting time of 1 action have a casting time of 1 bonus action"),
    FIFTEEN("You teleport up to 60 feet to an unoccupied space of your choice that you can see"),
    SIXTEEN("You are transported to the astral plane until the end of your next turn, after which time you return to the space you previously occupied or the nearest unoccupied space if that space is occupied"),
    SEVENTEEN("Maximize the damage of the next damaging spell you cast within the next minute"),
    EIGHTEEN("Roll a d10. Your age changes by a number of years equal to the roll. If the roll is odd, you get younger (minimum 1 year old). If the roll is even, you get older"),
    NINETEEN("1d6 flumphs controlled by the DM appear in unoccupied spaces within 60 feet of you and you are frightened of you. They vanished after 1 minute"),
    TWENTY("You regain 2d10 hit points"),
    TWENTY_ONE("You turn into a potted plant until the start of your next turn. While a plant, " +
            "you are incapacitated and" +
            " have vulnerability to ali damage. If you drop to O hit" +
            " points, your pot breaks, and your form reverts"),
    TWENTY_TWO("For the next minute, you can teleport up to 20 feet as a bonus action on each of your turns"),
    TWENTY_THREE("You cast levitate on yourself"),
    TWENTY_FOUR("A unicorn controlled by the DM appears in a space within 5 feet of you, then disappears 1 minute late"),
    TWENTY_FIVE("You can't speak for the next minute. Whenever you try, pink bubbles float out of your mouth"),
    TWENTY_SIX("A spectral shield hovers nears you for the next minute, granting you a +2 bonus to AC and immunity to magic missile"),
    TWENTY_SEVEN("You are immune to being intoxicated by alcohol for the next 5d6 days"),
    TWENTY_EIGHT("Your hair falls out but grows back within 24 hours"),
    TWENTY_NINE("For the next minute, any flammable object you touch that isn't being worn or carried by another creature burst into flames"),
    THIRTY("You regain your lowest-level expended spell slot"),
    THIRTY_ONE("For the next minute, you must shout when you speak"),
    THIRTY_TWO("You cast fog cloud centered on yourself"),
    THIRTY_THREE("Up to three creatures you choose within 30 feet of you take 4d10 lightning damage"),
    THIRTY_FOUR("You are frightened by the nearest creature until the end of your turn"),
    THIRTY_FIVE("Each creature within 30 feet of you becomes invisible for the next minute. The invisibility" +
            " ends on a creature when it attacks or casts a spell"),
    THIRTY_SIX("You gain resistance to all damage for the next minute"),
    THIRTY_SEVEN("A random creature within 60 feet of you becomes poisoned for 1d4 hours"),
    THIRTY_EIGHT("You glow with bright light in a 30-foot radius for the next minute. Any creature " +
            "that ends its turn within 5 feet of you is blinded until the end of its next turn"),
    THIRTY_NINE("You cast polymorph on yourself. If you fail the saving throw, you turn into a sheep for the" +
            " spell's duration"),
    FORTY("Illusory butterflies and flower petals flutter in the air within 10 feet of you for the next minute"),
    FORTY_ONE("You can take one additional action immediately"),
    FORTY_TWO("Each creature within 30 feet of you takes 1d10 necrotic damage. You regain hit points equal to the sum of" +
            " the necrotic damage dealt"),
    FORTY_THREE("You cast mirror image"),
    FORTY_FOUR("You cast fly on a random creature within 60 feet of you"),
    FORTY_FIVE("You become invisible for the next minute. During that time, other creatures can't hear you. " +
            "The invisibility ends if you attack or cast a spell"),
    FORTY_SIX("If you die within the next minute, you immediately come back to life as if by the " +
            "reincarnate spell"),
    FORTY_SEVEN("Your size increases by one size category for the next minute"),
    FORTY_EIGHT("You and all creatures within 30 feet of you gain vulnerability to piercing damage " +
            "for the next minute"),
    FORTY_NINE("You are surrounded by fain, ethereal music for the next minute"),
    FIFTY("You regain all expended sorcery points")
    ;

    private final String description;

    WildValue(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
