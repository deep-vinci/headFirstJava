class AssignObjToRefVarTestDrive {
    public static void main (String[] args) {
        AssignObjToRefVar firstAOTR = new AssignObjToRefVar();
        AssignObjToRefVar secondAOTR = firstAOTR;

        // printInfo(firstAOTR, secondAOTR);

        secondAOTR.width = 10;

        // printInfo(firstAOTR, secondAOTR);

        firstAOTR = null;

        // firstAOTR and secondAOTR both points to same object
        // and nullifying firstAOTR doesn't nullifies secondAOTR

        // printInfo(firstAOTR, secondAOTR);

        AssignObjToRefVarTestDrive demoVar = new AssignObjToRefVarTestDrive();
        demoVar.printInfo(firstAOTR, secondAOTR);
    }

    public void printInfo(AssignObjToRefVar firstAOTR,AssignObjToRefVar secondAOTR) {
        System.out.println(firstAOTR);
        System.out.println(secondAOTR);
    }
}