package State;

/**
 * Created by navid on 12/15/17.
 */
public abstract class State {
    public abstract void goNext(Context context);
    public abstract void describeState();
}
