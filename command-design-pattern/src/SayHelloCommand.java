/**
 * @Author : yangliu@tiduyun.com
 */
public class SayHelloCommand implements Command<Void> {

    @Override
    public Void execute(CommandContext commandContext) {
        System.out.println("hello world");
        return null;
    }
}
