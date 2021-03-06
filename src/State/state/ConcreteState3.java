package State.state;

import State.state.State;
import State.context.Context;

/**
 * Created by navid on 12/15/17.
 * SingleTon
 */
public class ConcreteState3 extends State {
    private static State instance = new ConcreteState3();

    private ConcreteState3() {
        super();
    }

    public static State getInstance() {
        return instance;
    }

    @Override
    public void goNext(Context context) {
        context.setState(ConcreteState1.getInstance());
    }

    @Override
    public void describeState() {
        System.out.println("This is State 3 and next will be State 1");
    }
}
