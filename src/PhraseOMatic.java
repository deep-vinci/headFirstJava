class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {
                "24/7",
                "multi-tier",
                "30 000 foot",
                "B-to-B",
                "win-win",
                "front-end",
                "web-based",
                "pervassive",
                "smart",
                "six-sigma",
                "critical-path",
                "dynamic"
        };

        String[] wordListTwo = {
                "empowered",
                "sticky",
                "value-added",
                "oriented",
                "centric",
                "distributed",
                "clustered",
                "branded",
                "outside-the-box",
                "positioned",
                "networked",
                "focused",
                "leveraged",
                "aligned",
                "targeted",
                "shared",
                "cooperative",
                "accelerated"
        };

        String[] wordListThree = {
                "process",
                "tipping-point",
                "solution",
                "architecture",
                "core competency",
                "strategy",
                "mindshare",
                "portal",
                "space",
                "vision",
                "paradigm",
                "mission"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;


        for (int i = 0; i < 10; i++) {
            int randOne = (int) (Math.random() * oneLength);
            int randTwo = (int) (Math.random() * twoLength);
            int randThree = (int) (Math.random() * threeLength);

            String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThree];

            System.out.println("what we need is a " + phrase);
        }

    }
}