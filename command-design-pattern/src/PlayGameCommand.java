/**
 * @Author : yangliu@tiduyun.com
 */
public class PlayGameCommand implements Command<Void> {

    @Override public Void execute(CommandContext commandContext) {
        System.out.println("play game");
        return null;
    }
}
