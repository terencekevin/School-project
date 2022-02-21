import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Simulateur_Processeur {
    public static void main(String[] args) {
        final int MAX_INSTRUCTIONS_PAR_MS = 2;
        Processeur processeur = new Processeur(MAX_INSTRUCTIONS_PAR_MS);

        Programme p1 = new Programme("P1", new String[] { "x=1", "y=2", "z=(x+y)+2" });
        Programme p2 = new Programme("P2", new String[] { "H=4", "K=8", "T=H", "H=K" });
        Programme p3 = new Programme("P3", new String[] { "I=0", "J=0", "Tant que I < 3", "J=I+5" });

        List<Programme> programmesAExecuter = Arrays.asList(new Programme[] { p1, p2, p3 });

        processeur.executer(programmesAExecuter);
    }

    public static class Programme {
        private String programName;
        private ArrayList<String> instructions;

        public Programme(String programName, String[] instructions) {
            this.programName = programName;
            this.instructions = new ArrayList<>(Arrays.asList(instructions));
        }

        public ArrayList<String> getInstructions() {
            return instructions;
        }

        @Override
        public String toString() {
            return programName + ": " + instructions;
        }
    }

    public static class Processeur {
        //Nombre d'instructions maximum a executer par ms
        int instructionsParCycle;

        public Processeur(int instructionsParCycle) {
            this.instructionsParCycle = instructionsParCycle;
        }

        public void executer(List<Programme> programmes) {
            printStatus(programmes);
            while (!areAllProgramsExecuted(programmes)) {
                for (int i = 0; i < programmes.size(); i++) {
                    executer(programmes.get(i));
                }
                System.out.println("");
                printStatus(programmes);
            }
        }

        public void executer(Programme p) {
            if (p.getInstructions().isEmpty()) {
                return;
            }

            System.out.println("Execution du programme " + p.programName);

            int compteur = 0; //Compteur d'instructions executees
            while (!p.getInstructions().isEmpty() && compteur < instructionsParCycle) {
                System.out.println("Execution de l'instruction " + p.getInstructions().get(0));
                p.getInstructions().remove(0);
                compteur++;
            }
        }

        private void printStatus(List<Programme> programmes) {
            String programStatus = "";
            for (int i = 0; i < programmes.size(); i++) {
                programStatus += programmes.get(i).toString();
                if (i != programmes.size() - 1) {
                    programStatus += " | ";
                }
            }
            System.out.println(programStatus);
        }

        private boolean areAllProgramsExecuted(List<Programme> programmes) {
            for (Programme programme : programmes) {
                if (!programme.getInstructions().isEmpty()) {
                    return false;
                }
            }
            
            return true;
        }
    }
}