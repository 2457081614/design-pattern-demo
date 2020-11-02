/**
 * @Author : yangliu@tiduyun.com
 */
public interface Command<T> {

    T execute(CommandContext commandContext);
}
