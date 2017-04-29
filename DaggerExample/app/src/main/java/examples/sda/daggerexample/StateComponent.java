package examples.sda.daggerexample;

import dagger.Component;
import examples.sda.daggerexample.model.State;

/**
 * Created by szyms on 4/29/17.
 */
@Component
public interface StateComponent {

    State state();

}
