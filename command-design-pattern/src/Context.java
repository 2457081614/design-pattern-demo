import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Author : yangliu@tiduyun.com
 */
public class Context {

    /**
     * 存储上下文
     */
    public static ThreadLocal<Deque<CommandContext>> commandContextDeque = new ThreadLocal<>();

    public static void push(CommandContext commandContext) {
        Deque<CommandContext> commandContexts = getContextList();
        commandContexts.push(commandContext);
    }

   public static Deque<CommandContext> getContextList() {
        Deque<CommandContext> commandContexts = commandContextDeque.get();
        if (commandContexts == null) {
            commandContexts = new ArrayDeque<>();
            commandContextDeque.set(commandContexts);
        }
        return commandContexts;
    }

    public static CommandContext get() {
        Deque<CommandContext> commandContexts = getContextList();
        if (commandContexts.size() == 0) {
            return null;
        }
        return commandContexts.peek();
    }
}
