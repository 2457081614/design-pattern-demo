/**
 * @Author : yangliu@tiduyun.com
 */
public class DefaultCommandExecutor implements CommandExecutor {

    @Override public <T> T execute(Command<T> command) {
        return command.execute(Context.get());
    }
}
