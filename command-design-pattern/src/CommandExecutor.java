/**
 * @Author : yangliu@tiduyun.com
 */
public interface CommandExecutor {

    <T> T execute(Command<T> command);
}
