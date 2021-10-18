package musementpark.offline.entertainment.command;

class MacroCommandTest {
    public static void main(String[] args) {
        Entermainment doc = new Entermainment();
        Macro myMacro = new Macro();
        myMacro.addCommand(new OpenCommand(doc));
        myMacro.addCommand(new VolumeCommand(doc));
        myMacro.addCommand(new LightCommand(doc));
        EntertainmentCommand cc = new CloseCommand(doc);
        myMacro.addCommand(cc);
        myMacro.execute();

        System.out.println("------------------------------");
        myMacro.removeCommand(cc);
        myMacro.execute();

    }

}