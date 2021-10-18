package musementpark.offline.entertainment.command;

class MacroCommandTest {
    public static void main(String[] args) {
        Entertainment entertain = new Entertainment();
        Macro myMacro = new Macro();

        myMacro.addCommand(new OpenCommand(entertain));
        myMacro.addCommand(new VolumeCommand(entertain));
        myMacro.addCommand(new LightCommand(entertain));
        EntertainmentCommand cc = new CloseCommand(entertain);
        myMacro.addCommand(cc);
        myMacro.execute();

        System.out.println("------------------------------");
        myMacro.removeCommand(cc);
        myMacro.execute();

    }


}