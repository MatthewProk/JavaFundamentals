package Task6andTask7;

@Submarine(name = "Mexico")
public class NuclearSubmarine {

    private String name;
    private boolean working;
    private EngineOfSubmarine engine;

    private NuclearSubmarine(){
        engine = new EngineOfSubmarine();
    }

    public static void main(String[] args) {
        NuclearSubmarine nuclearSubmarine = new NuclearSubmarine();
        nuclearSubmarine.start();
    }

    private void start(){
        engine.go();
    }

    private class EngineOfSubmarine{
        void go(){
            System.out.println("Go!");
        }
    }
}
